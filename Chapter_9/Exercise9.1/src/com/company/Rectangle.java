package com.company;

public class Rectangle {
    double weight;
    double height;
    Rectangle(){
        weight = 1;
        height = 1;
    }
    Rectangle(double NewWeight, double NewHeight){
        this.weight = NewWeight;
        this.height = NewHeight;
    }
    double getArea(){
        return weight * height;
    }
    double getPerimeter(){
        return 2 * (weight + height);
    }

}
