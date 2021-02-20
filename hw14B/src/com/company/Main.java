package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Ivanov", "Petya", 'M', 25, 1995);
        Student student2 = new Student("Petrov", "Vasiliy", 'M', 21, 1999);
        Student student3 = new Student("Kuznecova", "Anastasiya", 'F', 23, 1997);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        Course course = new Course("Java", 232323, "JV-F20", "Eugenii Petrovich");

        Group group = new Group(students, course, 101218, 10);

        System.out.println(course);
        System.out.println(group);
    }
}
