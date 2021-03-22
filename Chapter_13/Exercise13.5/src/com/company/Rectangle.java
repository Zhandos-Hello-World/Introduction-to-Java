package com.company;

public class Rectangle extends GeometricObject{
    private double side1;
    private double side2;



    Rectangle(double side1, double side2, String color, boolean fill){
        super(color, fill);
        this.side1 = side1;
        this.side2 = side2;
    }

    double getSide1(){
        return this.side1;
    }
    double getSide2(){
        return this.side2;
    }
    void setSide1(double side1){
        this.side1 = side1;
    }
    void setSide2(double side2){
        this.side2 = side2;
    }

    @Override
    public double getPerimeter(){
        return 2 * (side1 + side2);
    }

    @Override
    public double getArea(){
        return (int)(side1 * side2 * 100) / 100.0;
    }
    @Override
    public String toString(){
        return "Rectangle" + "\nside1: " + getSide1() + "\nside2: " + getSide2()
                + "\nPerimeter: " + getPerimeter() + "\nArea: " + getArea() + "\ncolor: " +
                getColor() + "\nfill: " + getFill() + "\n----------";

    }



}
