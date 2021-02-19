package com.company;

public class Sheep {
    int mass;
    int age;
    char gender;
    String name;

    public Sheep() {
    }

    public Sheep(int mass, int age, char gender, String name) {
        this.mass = mass;
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    public void printInfo(){
        System.out.println("Sheep " + name + ": " + mass + "kg, " + age + " y.o. Gender: " + gender);
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
        if(age > 0){
            this.age = age;
        }
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
