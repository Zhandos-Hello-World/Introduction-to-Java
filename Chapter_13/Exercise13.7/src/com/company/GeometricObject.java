package com.company;

public abstract class GeometricObject implements Colorable{
    private boolean fill;
    private String color;

    GeometricObject(String color, boolean fill){
        this.color = color;
        this.fill = fill;
    }

    boolean getFill(){
        return fill;
    }
    String getColor(){
        return color;
    }
    void setColor(String color){
        this.color = color;
    }
    void setFill(boolean fill){
        this.fill = fill;
    }
    abstract double getArea();

}
