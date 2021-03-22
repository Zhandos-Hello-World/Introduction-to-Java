package com.company;

public abstract class GeometricObject implements Comparable{

    String maxArea(GeometricObject rectangle){
        if(getArea() > rectangle.getArea()){
            return ">";
        }
        else if(getArea() == rectangle.getArea()){
            return "=";
        }
        else{
            return "<";
        }
    }
    String maxPerimeter(GeometricObject rectangle){
        if(getPerimeter() > rectangle.getPerimeter()){
            return ">";
        }
        else if(getPerimeter() == rectangle.getPerimeter()){
            return "=";
        }
        else{
            return "<";
        }
    }


    private String color;
    private boolean fill;
    GeometricObject(String color, boolean fill){
        this.color = color;
        this.fill = fill;
    }
    @Override
    public String getColor(){
        return this.color;
    }
    @Override
    public boolean getFill(){
        return this.fill;
    }

    @Override
    public void setColor(String color){
        this.color = color;
    }
    @Override
    public void setFill(boolean fill){
        this.fill = fill;
    }

}