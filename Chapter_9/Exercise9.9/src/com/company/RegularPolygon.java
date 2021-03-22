package com.company;

public class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    //These are constructors
    RegularPolygon(){
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }
    RegularPolygon(int n, double side){
        this.side = side;
        this.n = n;
    }
    RegularPolygon(int n, double side, double x, double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }
    //These are getter functions
    double getX(){
        return x;
    }
    double getY(){
        return y;
    }

    //These are functions that find Perimeter and Area
    double getPerimeter(){
        return n * side;
    }
    double getArea(){
        return (int)((n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n)) * 100) / 100.0;
    }
}
