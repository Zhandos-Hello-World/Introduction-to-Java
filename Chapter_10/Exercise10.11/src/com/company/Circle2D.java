package com.company;

public class Circle2D {
    private double x;
    private double y;
    private double radius;

    Circle2D(){
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }
    Circle2D(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    double getArea(){
        return radius * radius * Math.PI;
    }
    double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    boolean contains(double x, double y){
        return Math.sqrt(Math.pow(x - this.x, 2) +
                    Math.pow(y - this.y, 2)) < radius;
    }
    boolean contains(Circle2D circle2D){
        return Math.sqrt(Math.pow(circle2D.getX() - this.x, 2) +
                Math.pow(circle2D.getY() - this.y, 2)) <= Math.abs(radius - circle2D.getRadius());
    }
    boolean overlaps(Circle2D circle){
        return Math.sqrt(Math.pow(circle.getX() - x, 2) +
                Math.pow(circle.getY() - y, 2))
                <= radius + circle.getRadius();
    }

    double getRadius(){
        return radius;
    }
    double getX(){
        return x;
    }
    double getY(){
        return y;
    }
}
