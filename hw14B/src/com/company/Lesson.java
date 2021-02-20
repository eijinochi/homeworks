package com.company;

public class Lesson {
    int date;
    Student[] students;
    Course courses;
    int startTime;
    boolean homeworks;
    boolean exams;

    public Lesson() {
    }

    public Lesson(int date, Student[] students, Course courses, int startTime, boolean homeworks, boolean exams) {
        this.date = date;
        this.students = students;
        this.courses = courses;
        this.startTime = startTime;
        this.homeworks = homeworks;
        this.exams = exams;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Course getCourses() {
        return courses;
    }

    public void setCourses(Course courses) {
        this.courses = courses;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public boolean isHomeworks() {
        return homeworks;
    }

    public void setHomeworks(boolean homeworks) {
        this.homeworks = homeworks;
    }

    public boolean isExams() {
        return exams;
    }

    public void setExams(boolean exams) {
        this.exams = exams;
    }
}
