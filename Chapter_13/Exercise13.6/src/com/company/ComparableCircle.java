package com.company;

public class ComparableCircle extends Circle{
    ComparableCircle(double radius) {
        super(radius);
    }
    String compareTo(Circle circle){
        String s = "";
        if(circle.getArea() < getArea()){
            s = " > ";
        }
        else if(getArea() == circle.getArea()){
            s = " = ";
        }
        else{
            s = " < ";
        }
        return getArea() + s + circle.getArea() + "\n" + "Circle1" + s + "Circle2";
    }
}
