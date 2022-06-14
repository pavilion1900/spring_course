package ru.clevertec.hibernate2;

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
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
