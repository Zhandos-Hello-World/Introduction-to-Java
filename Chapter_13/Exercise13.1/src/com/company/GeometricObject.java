package com.company;

public abstract class GeometricObject {
    abstract double getArea();
    abstract double getPerimeter();
    abstract String getColor();
    abstract boolean getFill();
    abstract public String toString();
    abstract void setColor(String color);
    abstract void setFill(boolean fill);
}
