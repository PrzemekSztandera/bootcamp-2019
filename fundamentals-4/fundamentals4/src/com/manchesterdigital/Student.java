package com.manchesterdigital;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name) {
        this(name, 43);

    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Student englishStudent = new Student("Lol");
        System.out.println(englishStudent.getName());
        Student frenchStudent = new Student("Duncan", 23);
        System.out.println(frenchStudent.getName() + " " + frenchStudent.getAge());
        System.out.println(frenchStudent.toString());


    }
}
