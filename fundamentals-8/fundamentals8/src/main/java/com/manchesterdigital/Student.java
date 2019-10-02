package com.manchesterdigital;

public class Student extends Person {
    private String universityName;


    public Student(String firstName, String lastName, Integer age, Address address) {
        super(firstName, lastName, age, address);
    }

    @Override
    public void haveLunch() {

    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append("University Name: ");
        out.append(universityName);
        out.append("\n");
        out.append("Person ");
        out.append(super.toString());
        return out.toString();
    }

    public static void main(String[] args) {
        Student student = new Student(
                "John",
                "Snow",
                18,
                new Address("1st Street", "Manchester", "M23 4TT"
                ));
        student.setUniversityName("Some University");

        System.out.println(student);


    }
}
