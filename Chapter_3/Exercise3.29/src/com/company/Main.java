package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
        double x = str.nextDouble();
        double y = str.nextDouble();
        double r = str.nextDouble();
        System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
        double x1 = str.nextDouble();
        double y1 = str.nextDouble();
        double r1 = str.nextDouble();
        if(x1 + r1 < x + r && x1 - r1 > x - r &&
            y1 + r1 < y + r && y1 - r1 > y - r){
            System.out.println("circle2 is inside circle1");
        }
        else if((x1 + r1 < x - r || x1 - r1 > x + r) &&
                (y1 + r1 < y - r || y1 - r1 > y + r)){
            System.out.println("circle2 does not overlaps circle1");
        }

        else{
            System.out.println("circle2 overlaps circle1");
        }
    }
}
