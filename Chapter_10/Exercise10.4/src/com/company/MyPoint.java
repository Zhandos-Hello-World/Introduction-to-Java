package com.company;

public class MyPoint {
    private double x;
    private double y;

    MyPoint(){
        this.x = 0.0;
        this.y = 0.0;
    }
    MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }


    double getX(){
        return x;
    }
    double getY(){
        return y;
    }

    double distance(MyPoint myPoint){
        return Math.sqrt(Math.pow(myPoint.getX() - this.x, 2) + Math.pow(myPoint.getY() - this.y, 2));
    }
    double distance(double x2, double y2){
        return Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2));
    }
}
