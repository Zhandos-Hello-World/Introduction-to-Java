package com.company;

public class Main {

    public static void main(String[] args) {
        GeometricObject s1 = new Circle(12, "black", true);
        GeometricObject s2 = new Circle(23, "black", true);
        System.out.print(new CircleComparable(12, "black", true).compareTo(new CircleComparable(23, "black", true)));
        System.out.print(s1.toString());
    }
}
