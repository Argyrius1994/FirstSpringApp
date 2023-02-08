package com.fiction;

public class Student {

//    private String studentName;
//
//    public String getStudentName() {
//        return studentName;
//    }
//
//    public void setStudentName(String studentName) {
//        this.studentName = studentName;
//    }
//
//    //Define the init() and destroy() methods
//    public void initStudent(){
//        System.out.println("This is the init() method...");
//    }
//    //this is not called if the scope = "prototype"
//    //WHY? memory leak and memory management
//    public void destroyStudent()
//    {
//        System.out.println("This is the destroy method...");
//    }
//
//    public void sayHello()
//    {
//        System.out.println("Hello world from spring framework");
//
//    }

    //Composition
    private Address address;

    public Student(Address address) {
        this.address = address;
    }

    public void showInfo()
    {
        System.out.println("Adress is : "+address);
    }


}
