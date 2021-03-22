package com.company;

public class Square extends GeometricObject implements Colorable{
    private double side;

    Square(double side){
        super("default", false);
        this.side = side;
    }

    Square(double side, String color, boolean fill){
        super(color, fill);
        this.side = side;
    }
    double getArea(){
        return side * side;
    }

    double getSide(){
        return this.side;
    }
    void setSide(double side){
        this.side = side;
    }

    @Override
    public void howToColor(){
        System.out.println("\nColor all four sides");
    }

}
