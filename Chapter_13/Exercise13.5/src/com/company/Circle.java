package com.company;

public class Circle extends GeometricObject{
    private double radius;
    String maxArea(GeometricObject circle){
        if(getArea() > circle.getArea()){
            return ">";
        }
        else if(getArea() == circle.getArea()){
            return "=";
        }
        else{
            return "<";
        }
    }
    String maxPerimeter(GeometricObject circle){
        if(getPerimeter() > circle.getPerimeter()){
            return ">";
        }
        else if(getPerimeter() == circle.getPerimeter()){
            return "=";
        }
        else{
            return "<";
        }
    }
    Circle(double radius, String color, boolean fill){
        super(color, fill);
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return (int)(100 * pi * Math.pow(radius, 2)) / 100.0;
    }
    @Override
    public double getPerimeter(){
        return (int)(2 * pi * radius * 100) / 100.0;
    }
    void setRadius(double radius){
        this.radius = radius;
    }
    double getRadius(){
        return this.radius;
    }
    public String toString(){
        return "Circle" + "\nRadius: " + getRadius()
                + "\nPerimeter: " + getPerimeter() + "\nArea: " + getArea() + "\n----------";
    }
}
