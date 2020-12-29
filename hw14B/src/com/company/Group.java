package com.company;

import java.time.LocalDate;

public class Group {
    Student[] students;
    Course courses;
    int start;
    int duration;

    public Group(Student[] students, Course courses, int start, int duration){
        this.students = students;
        this.courses = courses;
        this.start = start;
        this.duration = duration;
    }

    public void setStudents(Student[] students){
        this.students = students;
    }

    public Student[] students (){
        return students;
    }

    public void setCourses(Course courses){
        this.courses = courses;
    }

    public Course getCourses(){
        return courses;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getStart() {
        return start;
    }

    public void setDuration(int duration){
        this.duration = duration;
    }

    public int getDuration(){
        return duration;
    }

    
}
