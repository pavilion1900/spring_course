package ru.clevertec.hibernate2to2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.clevertec.hibernate2to2.entity.Child;
import ru.clevertec.hibernate2to2.entity.Section;

public class Ex1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();
        Session session = null;
        try {
//            Section section1 = new Section("dance");
//            Child child1 = new Child("Olga", 5);
//            Child child2 = new Child("Pavel", 7);
//            Child child3 = new Child("Dima", 6);
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            session.persist(section1);
//            session.getTransaction().commit();

//            Section section1 = new Section("basketball");
//            Section section2 = new Section("chess");
//            Section section3 = new Section("math");
//            Child child1 = new Child("Timyr", 10);
//            child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section3);
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            session.save(child1);
//            session.getTransaction().commit();

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Section section = session.get(Section.class, 1);
//            System.out.println(section);
//            section.getChildList().forEach(System.out::println);
//            session.getTransaction().commit();

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Child child = session.get(Child.class, 4);
//            System.out.println(child);
//            child.getSections().forEach(System.out::println);
//            session.getTransaction().commit();

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Section section = session.get(Section.class, 1);
//            session.delete(section);
//            session.getTransaction().commit();

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            session.createQuery("delete from Child where id > 5 and id < 10")
//                    .executeUpdate();
//            session.getTransaction().commit();

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Section section = session.get(Section.class, 7);
//            session.delete(section);
//            session.getTransaction().commit();

            session = factory.getCurrentSession();
            session.beginTransaction();
            Child child = session.get(Child.class, 4);
            session.delete(child);
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
