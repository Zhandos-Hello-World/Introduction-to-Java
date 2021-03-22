package com.company;

public class Circle implements Comparable{
    private double radius;
    Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return (int)(100.0 * Math.pow(this.radius, 2) * pi) / 100.0;
    }
    double getRadius(){
        return this.radius;
    }
    void setRadius(double radius){
        this.radius = radius;
    }
}
