package com.company;
public class Triangle extends GeometricObject{
    private double side1;
    private double side2;
    private double side3;
    private String color = "white";
    private boolean fill;
    Triangle(double side1, double side2, double side3,
             String color, boolean fill){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.color = color;
        this.fill = fill;
    }
    double getArea(){
        double s = (side1 + side2 + side3) / 2;
        return (int)(Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)) * 100) / 100.0;
    }
    double getPerimeter(){
        return side1 + side2 + side3;
    }
    String getColor(){
        return this.color;
    }
    boolean getFill(){
        return this.fill;
    }
    public String toString(){
        return "Area: " + getArea() + "\nPerimeter: " + getPerimeter() +
                "\nColor: " + getColor() + "\nFill: " + getFill();
    }
    void setColor(String color){
        this.color = color;
    }
    void setFill(boolean fill){
        this.fill = fill;
    }
}
