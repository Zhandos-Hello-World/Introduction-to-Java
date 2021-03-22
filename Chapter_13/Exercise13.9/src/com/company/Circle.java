package com.company;

public class Circle extends GeometricObject{
    private static final double p = Math.PI;
    private double radius;
    Circle(double radius){
        super();
        this.radius = radius;
    }
    Circle(){
        super(false, "white");
        new Circle(0.0);
    }
    Circle(double radius, String color, boolean fill){
        super(fill, color);
        this.radius = radius;
    }
    double getArea(){
        return (int)(p * this.radius * this.radius * 100.0) / 100.0;
    }
    double getPerimeter(){
        return (int)(2 * p * this.radius * 100.0) / 100.0;
    }
    double getDiameter(){
        return 2 * radius;
    }
    double getRadius(){
        return this.radius;
    }
    void setRadius(double radius){
        this.radius = radius;
    }
    public String toString(){
        return "\nCircle" + "\nRadius: " + getRadius() + "\nDiameter: " +
                getDiameter() + "\nArea: " + getArea() + "\nPerimeter: " +
                getPerimeter() + "\nColor: " + getColor() + "\nFill: " + getFill();
    }
}
