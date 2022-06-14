package ru.clevertec.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.clevertec.hibernate.entity.Employee;

public class Ex5 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
//            Employee emp = session.get(Employee.class, 2);
//            session.delete(emp);
            session.createQuery("delete Employee where name = 'Ivan'").executeUpdate();
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
