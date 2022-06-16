package ru.clevertec.hibernate1to2bi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.clevertec.hibernate1to2bi.entity.Department;
import ru.clevertec.hibernate1to2bi.entity.Employee;

public class Ex1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;
        try {
//            Department dep = new Department("IT", 300, 1200);
//            Employee emp1 = new Employee("Ivan", "Ivanov", 800);
//            Employee emp2 = new Employee("Petr", "Petrov", 1000);
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            session.save(dep);
//            session.getTransaction().commit();

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Department dep = session.get(Department.class, 1);
//            System.out.println(dep);
//            dep.getEmpsList().forEach(System.out::println);
//            session.getTransaction().commit();

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Employee emp = session.get(Employee.class, 1);
//            System.out.println(emp);
//            System.out.println(emp.getDepartment());
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
