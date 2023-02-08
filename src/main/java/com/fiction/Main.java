package com.fiction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.sayHello();
        //IoC container - this is where the beans are located
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //We do not get a NULL exception because the Spring Container
        //does the instantiation under the hood
        Student student = (Student) context.getBean("student_bean");
//        Student student1 = (Student) context.getBean("student_bean");
//        student.setStudentName("Argyrios Gatidis");
         student.showInfo();
//        System.out.println("Hi my name is "+student1.getStudentName());
//        System.out.println("Is the same instance : "+(student == student1));
//        This is how to close the Context
        ((ConfigurableApplicationContext) context).close();
//

    }
}