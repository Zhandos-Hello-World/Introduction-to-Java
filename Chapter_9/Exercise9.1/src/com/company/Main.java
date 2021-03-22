package com.company;
public class Main {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);
        System.out.println("Rectangle1: height = " + rectangle1.height + ", weight = "
                + rectangle1.weight + ", Area = " + rectangle1.getArea() + ", " +
                "Perimeter = " + rectangle1.getPerimeter());
        System.out.println("Rectangle2: height = " + rectangle2.height + ", weight = "
                + rectangle2.weight + ", Area = " + rectangle2.getArea() + ", " +
                "Perimeter = " + rectangle2.getPerimeter());
    }
}
