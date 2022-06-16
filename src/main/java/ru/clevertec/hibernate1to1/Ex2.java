package ru.clevertec.hibernate1to1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.clevertec.hibernate1to1.entity.Detail;
import ru.clevertec.hibernate1to1.entity.Employee;

public class Ex2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;
        try {
//            Employee emp = new Employee("Misha", "Sidorov", "Market", 800);
//            Detail detail = new Detail("London", "+777551234567", "misha@gmail.com");
//            emp.setEmpDetail(detail);
//            detail.setEmployee(emp);
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            session.save(detail);
//            session.getTransaction().commit();

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Detail detail = session.get(Detail.class, 3);
//            System.out.println(detail.getEmployee());
//            session.getTransaction().commit();

            session = factory.getCurrentSession();
            session.beginTransaction();
            Detail detail = session.get(Detail.class, 6);
            detail.getEmployee().setEmpDetail(null);
            session.delete(detail);
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
