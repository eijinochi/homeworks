package com.company;

public class Horse {
    int mass;
    int age;
    String color;
    char gender;
    String name;

    public Horse(){
    }

    public Horse(int mass, int age, String color, char gender, String name){
        this.mass = mass;
        this.age = age;
        this.color = color;
        this.gender = gender;
        this.name = name;

    }

    public void printInfo(){
        System.out.println("Horse " + name + ": " + mass + "kg, " + age + " y.o. Gender: " + gender + ". Color is " + color);
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
