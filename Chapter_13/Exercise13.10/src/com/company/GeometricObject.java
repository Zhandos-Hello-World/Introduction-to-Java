package com.company;

abstract public class GeometricObject {
    private boolean fill;
    private String color;
    GeometricObject(boolean fill, String color){
        this.fill = fill;
        this.color = color;
    }
    GeometricObject(){
        this(false, "white");
    }
    boolean getFill(){
        return this.fill;
    }
    String getColor(){
        return this.color;
    }
    void setColor(String color){
        this.color = color;
    }
    void setFill(boolean fill){
        this.fill = fill;
    }
}
