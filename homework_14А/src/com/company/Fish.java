package com.company;

public class Fish {
    String name;
    int age;
    char gender;
    int height;
    double weight;

    public Fish(String name, int age, char gender, int height, double weight){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    public void printFishInfo(){
        System.out.println("Fish " + name + ":\n\n" + "Age " + age + "\nGender: " + gender
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
