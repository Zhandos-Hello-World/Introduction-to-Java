package com.company;

public class CircleComparable extends Circle implements Comparable<Circle>{
    CircleComparable(double radius, String color, boolean fill){
        super(radius, color, fill);
    }
    @Override
    public int compareTo(Circle o) {
        if(getArea() > o.getArea()){
            return 1;
        }
        else if(getArea() < o.getArea()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
