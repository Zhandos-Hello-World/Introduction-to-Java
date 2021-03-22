package com.company;

public class Rectangle extends GeometricObject{
    private double height;
    private double weight;
    Rectangle(double height, double weight, String color, boolean fill){
        super(fill, color);
        this.height = height;
        this.weight = weight;
    }
    Rectangle(double height, double weight){
        this(height, weight, "white", false);
    }
    Rectangle(){
        this(0.0,0.0);
    }
    double getHeight(){
        return height;
    }
    double getWeight(){
        return weight;
    }
    void setHeight(double height){
        this.height = height;
    }
    void setWeight(double weight){
        this.weight = weight;
    }
    double getPerimeter(){
        return 2 * (height + weight);
    }
    double getArea(){
        return height * weight;
    }

}
