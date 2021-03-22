package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.print("Enter three points for p0, p1, and p2: ");
        double px0 = str.nextDouble();
        double py0 = str.nextDouble();
        double px1 = str.nextDouble();
        double py1 = str.nextDouble();
        double px2 = str.nextDouble();
        double py2 = str.nextDouble();
        String p0 = "(" + px0 + ", " + py0 + ")";
        String p1 = "(" + px1 + ", " + py1 + ")";
        String p2 = "(" + px2 + ", " + py2 + ")";
        if(px0 < px1){
            if(px2 > px0 && px2 < px1 && py2 > py0 && py2 < py1){
                System.out.print(p2 + " is on the line segment from " + p0 + " to " + p1);
            }
            else{
                System.out.print(p2 + " is not on the line segment from " + p0 + " to " + p1);
            }
        }

        }
    }

