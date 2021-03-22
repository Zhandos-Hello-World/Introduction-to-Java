package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Circle1 radius: ");
        double radius = str.nextDouble();
        System.out.print("Circle2 radius: ");
        double radius1 = str.nextDouble();
        ComparableCircle[]circles = new ComparableCircle[2];
        circles[0] = new ComparableCircle(radius);
        circles[1] = new ComparableCircle(radius1);
        System.out.print(circles[0].compareTo(circles[1]));
    }
}
