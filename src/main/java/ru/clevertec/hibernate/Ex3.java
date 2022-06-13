package ru.clevertec.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import ru.clevertec.hibernate.entity.Employee;

import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
//            List<Employee> list = session.createQuery("from Employee").getResultList();
            List<Employee> list = session
                    .createQuery("from Employee where name = 'Alex' and salary > 1000")
                    .getResultList();
            list.forEach(System.out::println);
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
