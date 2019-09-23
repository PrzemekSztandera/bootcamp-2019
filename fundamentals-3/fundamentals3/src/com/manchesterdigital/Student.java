package com.manchesterdigital;

public class Student {
    // this is instance variable
    public String studentName;
    static final String CLASS_NAME = "Bootcamp";

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public void printDetails() {
        System.out.println("Student name is " + studentName + ", Class is: " + CLASS_NAME);
    }

    public static void main(String[] args) {
        Student students  = new Student("blabla");
        students.printDetails();
        // boolean bool =  Variables.isHungry;
    }
}
