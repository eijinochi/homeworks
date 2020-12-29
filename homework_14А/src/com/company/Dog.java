package com.company;

public class Dog {
    String name;
    int age;
    char gender;
    int height;
    double weight;

    public Dog(String name, int age, char gender, int height, double weight){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    public void printDogInfo(){
        System.out.println("Dog " + name + ":\n\n" + "Age " + age + "\nGender: " + gender
                + "\nHeight: " + height + "\nWeight: " + weight);
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(){
        this.age = age;
    }

    public char getGender(){
        return gender;
    }

    public void setGender(){
        this.gender = gender;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(){
        this.height = height;
    }

    public double weight(){
        return weight;
    }

    public void setWeight(){
        this.weight = weight;
    }
}
