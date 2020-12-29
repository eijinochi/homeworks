package com.company;

public class Rectangle {
    int height;
    int width;
    String color;

    public void setHeight(int h){
        height = h;
    }

    public void setWidth(int w){
        width = w;
    }

    public int getArea(){
        return height * width;
    }
}
