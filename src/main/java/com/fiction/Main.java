package com.fiction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.sayHello();
        //IoC container - this is where the beans are located
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //We do not get a NULL exception because the Spring Contatiner
        //does the instantiation under the hood
        Student student = (Student) context.getBean("student_bean");
        student.sayHello();

        

    }
}