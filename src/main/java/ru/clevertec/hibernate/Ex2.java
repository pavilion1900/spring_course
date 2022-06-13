package ru.clevertec.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.clevertec.hibernate.entity.Employee;

public class Ex2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Employee emp1 = new Employee("Oleg", "Sidorov", "HR", 700);
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            session.save(emp1);
//            session.getTransaction().commit();
            int myId = emp1.getId();
//            session = factory.getCurrentSession();
//            session.beginTransaction();
            Employee emp2 = session.get(Employee.class, myId);
            session.getTransaction().commit();
            System.out.println(emp2);
        } finally {
            factory.close();
        }
    }
}
