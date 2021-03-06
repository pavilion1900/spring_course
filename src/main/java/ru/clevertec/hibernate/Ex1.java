package ru.clevertec.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.clevertec.hibernate.entity.Employee;

public class Ex1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Employee emp1 = new Employee("Alex", "Ivanov", "IT", 600);
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            session.save(emp1);
            session.getTransaction().commit();
            System.out.println(emp1);
        } finally {
            factory.close();
        }
    }
}
