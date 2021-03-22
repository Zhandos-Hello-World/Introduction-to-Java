package com.company;

public class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;

    MyRectangle2D(){
        this.width = 1;
        this.height = 1;
    }
    MyRectangle2D(double x, double y, double height, double width){
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    double getArea(){
        return width * height;
    }
    double getPerimeter(){
        return 2 * (width + height);
    }

    boolean contains(double x, double y){
        return getDistance(this.y, y) <= height / 2 &&
                getDistance(this.x, x) <= width / 2;
    }
    boolean contains(MyRectangle2D r){
        return getDistance(y, r.getY()) + r.getHeight() / 2 <= height / 2 &&
                        getDistance(x, r.getX()) + r.getWidth() / 2 <= width / 2 &&
                        height / 2 + r.getHeight() / 2 <= height &&
                        width / 2 + r.getWidth() / 2 <= width;
    }
    boolean overlaps(MyRectangle2D r){
        return !contains(r) &&
                ((x + width / 2 > r.getX() - r.getWidth()) ||
                        (y + height / 2 > r.getY() - r.getHeight())) &&
                (getDistance(y, r.getY()) < height / 2 + r.getHeight() / 2) &&
                (getDistance(x, r.getX()) < width / 2 + r.getWidth() / 2);
    }
    private double getDistance(double p1, double p2) {
        return Math.sqrt(Math.pow(p2 - p1, 2));
    }

    double getX(){
        return x;
    }
    double getY(){
        return y;
    }
    double getWidth(){
        return width;
    }
    double getHeight(){
        return height;
    }
    void setWidth(double width){
        this.width = width;
    }
    void setHeight(double height){
        this.height = height;
    }
    void setX(double x){
        this.x = x;
    }
    void setY(double y){
        this.y = y;
    }
}
