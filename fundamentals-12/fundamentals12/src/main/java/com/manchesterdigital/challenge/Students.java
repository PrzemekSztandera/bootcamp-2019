package com.manchesterdigital.challenge;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Students {
    private List<Student> studentslist;

    public Students() {
    }

    public List<Student> getStudents() {
        return studentslist;
    }

    public static void main(String[] args) {
        Students students = new Students();
        students.studentslist = List.of(
                new Student("Ann", "English", 57),
                new Student("Tom", "English", 34),
                new Student("Sue", "English", 95),
                new Student("Adam", "French", 25),
                new Student("Steve", "German", 73),
                new Student("Helen", "English", 65),
                new Student("Phil", "French", 90),
                new Student("Sarah", "German", 55),
                new Student("Greg", "French", 18),
                new Student("Jack", "English", 38),
                new Student("Greg", "English", 46)
                );

        var collectEnglishStudents = students.studentslist.stream()
                .filter(student -> student.getLanguage().equalsIgnoreCase("english"))
                .filter(student -> student.getScore() > 50)
                .filter(student -> student.getName().startsWith("A") || student.getName().startsWith("S"))
                .collect(Collectors.toList());
        System.out.println("collectEnglishStudent = " + collectEnglishStudents);

        var collectGermanStudents = students.studentslist.stream()
                .filter(student -> student.getLanguage().equalsIgnoreCase("german"))
                .filter(student -> student.getScore() > 50)
                .filter(student -> student.getName().startsWith("A") || student.getName().startsWith("S"))
                .collect(Collectors.toList());
        System.out.println("collectGermanStudent = " + collectGermanStudents);

        var collectFrenchStudents = students.studentslist.stream()
                .filter(student -> student.getLanguage().equalsIgnoreCase("french"))
                .filter(student -> student.getScore() > 50)
                .filter(student -> student.getName().startsWith("A") || student.getName().startsWith("S"))
                .collect(Collectors.toList());
        System.out.println("collectFrenchStudent = " + collectFrenchStudents);


    }

    private static List<? super Student> extractStudentsUsingPredicate(List<? extends Student> students,
                                                               String subject,
                                                               Integer minScore) {
        return students.stream()
                .filter(studentFilter(subject, minScore))
                .collect(Collectors.toList());
    }
    private static Predicate<Student> studentFilter(String subject, Integer minScore) {
        return student -> student.getLanguage().equalsIgnoreCase(subject) &&
                student.getLanguage().equalsIgnoreCase(subject) &&
                (student.getName().startsWith("A") || student.getName().startsWith("S"));
    }
}
