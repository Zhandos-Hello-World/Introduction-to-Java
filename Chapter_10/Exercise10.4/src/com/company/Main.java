package com.company;

public class Main {

    public static void main(String[] args) {
        MyPoint myPoint1 = new MyPoint(0, 0);
        MyPoint myPoint2 = new MyPoint(10, 30.5);
        System.out.print(myPoint1.distance(myPoint2));
    }
}
