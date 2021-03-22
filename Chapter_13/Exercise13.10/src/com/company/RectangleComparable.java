package com.company;

public class RectangleComparable extends Rectangle implements Comparable<Rectangle>{
    public int compareTo(Rectangle rectangle){
        if(getArea() > rectangle.getArea()){
            return 1;
        }
        else if(getArea() < rectangle.getArea()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
