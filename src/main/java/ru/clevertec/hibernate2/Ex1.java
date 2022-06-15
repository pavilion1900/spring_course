package ru.clevertec.hibernate2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.clevertec.hibernate2.entity.Detail;
import ru.clevertec.hibernate2.entity.Employee;

public class Ex1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;
        try {
//            Session session = factory.getCurrentSession();
//            Employee emp = new Employee("Ivan", "Ivanov", "Sales", 500);
//            Detail detail = new Detail("Gomel", "+375291234567", "ivan@gmail.com");
//            emp.setEmpDetail(detail);
//            session.beginTransaction();
//            session.save(emp);
//            session.getTransaction().commit();

//            Session session = factory.getCurrentSession();
//            Employee emp = new Employee("Oleg", "Smirnov", "HR", 600);
//            Detail detail = new Detail("Minsk", "+375447654321", "oleg@gmail.com");
//            emp.setEmpDetail(detail);
//            session.beginTransaction();
//            session.save(emp);
//            session.getTransaction().commit();

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Employee emp = session.get(Employee.class, 10);
//            System.out.println(emp.getEmpDetail());
//            session.getTransaction().commit();

            session = factory.getCurrentSession();
            session.beginTransaction();
            Employee emp = session.get(Employee.class, 2);
            session.delete(emp);
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
