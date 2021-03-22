package com.company;
import java.util.*;

public class Main{
    public static void main(String [] args){
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
        double x = str.nextDouble();
        double y = str.nextDouble();
        double width = str.nextDouble();
        double height = str.nextDouble();
        System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
        double x1 = str.nextDouble();
        double y1 = str.nextDouble();
        double width1 = str.nextDouble();
        double height1 = str.nextDouble();


        if(x1 + (width1 / 2) < x + (width / 2) && x1 - (width1 / 2) > x - (width / 2) &&
            y1 + (height1 / 2) < y + (height / 2) && y1 - (height1 / 2) > y - (height / 2)){
            System.out.println("r2 is inside r1");
        }
        else if((x1 - (width1 / 2) > x + (width / 2) || x1 + (width1 / 2) < x - (width1 / 2)) &&
                ((y1 - (height1 / 2) > y + (height / 2) || y1 + (height1 / 2) < y - (height / 2)))){
            System.out.println("r2 does not overlap r1");
        }
        else{
            System.out.println("r2 overlaps r1");
        }

    }
}
