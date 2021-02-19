package com.company;

public class Cow {
    int mass;
    int age;
    char gender;
    String name;

    public Cow() {
    }

    public Cow(int mass, int age, char gender, String name) {
        this.mass = mass;
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    public void printInfo(){
        System.out.println("Cow " + name + ": " + mass + "kg, " + age + " y.o. Gender: " + gender);
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
