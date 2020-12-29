package com.company;

import java.time.LocalDate;

public class Student {
    String surname;
    String name;
    char gender;
    int age;
    int birth;

    public Student( String surname, String name, char gender, int age, int birth){
        this.surname = surname;
        this.name = name;
        this.gender = gender;
        setAge(age);
        this.birth = birth;
    }



    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getSurname(){
        return surname;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setGender(char gender){
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public void setAge(int age) {
        if(age > 0){
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void setBirth(int birth){
        this.birth = birth;
    }

    public int getBirth() {
        return birth;
    }
}
