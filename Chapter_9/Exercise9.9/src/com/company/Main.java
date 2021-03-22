package com.company;

public class Main {

    public static void main(String[] args) {
        RegularPolygon polygon1 = new RegularPolygon(6, 4);
        RegularPolygon polygon2 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("Polygon1\nPerimeter: " + polygon1.getPerimeter() + "\nArea: "
                        + polygon1.getArea() + "\nx: " +polygon1.getX() +"\ny: " + polygon1.getY());
        System.out.println("----------------");
        System.out.println("Polygon2\nPerimeter: " + polygon2.getPerimeter() + "\nArea: "
                + polygon2.getArea() + "\nx: " +polygon2.getX() +"\ny: " + polygon2.getY());
    }
}
