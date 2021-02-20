package com.company;

import java.time.LocalDate;

public class Course {
    String name;
    int create;
    String groupId;
    String teacherName;

    public Course() {
    }

    public Course(String name, int create, String groupId, String teacherName){
        this.name = name;
        this.create = create;
        this.groupId = groupId;
        this.teacherName = teacherName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setCreate(int create) {
        this.create = create;
    }

    public int getCreate() {
        return create;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    @Override
    public String toString(){
        String message = "It's the " + this.name + " courses.";
        return message;
    }
}
