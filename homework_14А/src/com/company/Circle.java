package com.company;

public class Circle {
    double radius;
    double pi = 3.14;
    String color;
    boolean isTransparent;



    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius, String color, boolean isTransparent){
        this.radius = radius;
        this.color = color;
        this.isTransparent = isTransparent;
    }

    public void printCircleInfo(){
        System.out.println("circle: \n\n" + "radius = " + radius
                + "\ncolor is " + color
                + "\nisTransparent = " + isTransparent);
    }

    public double getCircleLength(){
        return 2 * pi * radius;
    }

    public double getCircleArea(){
        return pi * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getIsTransparent(){
        return isTransparent;
    }

    public void setIsTransparent(boolean transparent) {
        this.isTransparent = isTransparent;
    }
}

