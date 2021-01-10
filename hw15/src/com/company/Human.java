package com.company;

import java.time.LocalDate;

public class Human {
    String name;
    String surname;
    int birthYear;
    String hobby;
    char gender;
    int currentYear = LocalDate.now().getYear();

    public Human(String name, String surname, int birthYear, char gender, String hobby){
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.gender = gender;
        this.hobby = hobby;

    }

    public void info(){
        System.out.println("My name is " + name + " " + surname + ". I'm " + (currentYear - birthYear) + "years old. My gender:" + gender + ".");
        if(hobby != null){
            System.out.println("My hobby is " + hobby + ".");
        }else{
            System.out.println("I have not hobby");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }

    public int getBirthYear(){
        return birthYear;
    }

    public void setHobby(String hobby){

        this.hobby = hobby;
    }

    public String getHobby(){
        return hobby;
    }

    public void setGender(char gender){
        this.gender = gender;
    }

    public char getGender(){
        return gender;
    }



}
