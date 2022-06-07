package ru.clevertec.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> studentList = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Tregulov", 4, 7.5);
        Student st2 = new Student("Ivanov", 2, 8.3);
        Student st3 = new Student("Sidorova", 1, 9.1);
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("start of getStudents");
        System.out.println(studentList.get(3));
        System.out.println("Information from method getStudents:");
        System.out.println(studentList);
        return studentList;
    }
}
