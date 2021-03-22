package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            Triangle sides = new Triangle(0.2, 0.3, 1, "blue", true);
        }catch (IllegalTriangleException ex){
        }
    }
}
class GeometricObject {
    double side1;
    double side2;
    double side3;
    private boolean filed;
    private String color;

    GeometricObject(){
        side1 = side2 = side3 = 1.0;
    }
    GeometricObject(double side1, double side2, double side3) throws IllegalTriangleException{
        try{
            if((side1 + side2 < side3) || (side3 + side2 < side1) || (side1 + side3 < side2)) {
                throw new IllegalTriangleException();
            }
        }
        catch (IllegalTriangleException ex){
            System.out.print(ex.message());
            return;
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    boolean getFilled(){
        return filed;
    }
    String getColor(){
        return color;
    }

    void setFiled(boolean filled){
        this.filed = filled;
    }
    void setColor(String color){
        this.color = color;
    }
}
class Triangle extends GeometricObject{
    private String color;
    private boolean filled;

    Triangle(){
        super();
    }
    Triangle(double side1, double side2, double side3, String color,boolean filled)
    throws IllegalTriangleException{
        try{
            if((side1 + side2 < side3) || (side3 + side2 < side1) || (side1 + side3 < side2)) {
                throw new IllegalTriangleException();
            }
        }
        catch (IllegalTriangleException ex){
            System.out.print(ex.message());
            return;
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.filled = filled;
        this.color = color;
    }

    double getArea(){
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    double getPerimeter(){
        return side1 + side2 + side3;
    }

    String getColor(boolean filled){
        if(filled){
            return color;
        }
        else{
            return "null";
        }
    }


    public String toString(){
        return "Triangle: side1 = " + side1 + " side2 = " + side2 +
                " side3 = " + side3 + " color = " + getColor(filled);
    }
}
