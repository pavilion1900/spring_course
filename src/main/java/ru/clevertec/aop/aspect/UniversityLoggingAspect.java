package ru.clevertec.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import ru.clevertec.aop.Student;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("beforeGetStudentsLoggingAdvice");
//    }

    //    @AfterReturning(pointcut = "execution(* getStudents())",
//            returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
//        Student firstStudent = students.get(0);
//
//        String surnameFirstStudent = firstStudent.getSurname();
//        surnameFirstStudent = "Mr. " + surnameFirstStudent;
//        firstStudent.setSurname(surnameFirstStudent);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade + 1;
//        firstStudent.setAvgGrade(avgGrade);
//
//        System.out.println("afterReturningGetStudentsLoggingAdvice");
//    }
//
//    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
//    public void afterThrowingGetStudentsLoggingAdvice(JoinPoint joinPoint, Throwable exception) {
//        System.out.println("afterThrowingGetStudentLoggingAdvice " + exception);
//    }
    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice(JoinPoint joinPoint) {
        System.out.println("afterGetStudentsLoggingAdvice");
    }
}
