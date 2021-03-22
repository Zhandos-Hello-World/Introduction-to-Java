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
        double res = (px1 - px0) * (py2 - py0) - (px2 - px0) * (py1 - py0);
        String p0 = "(" + px0 + ", " + py0 + ")";
        String p1 = "(" + px1 + ", " + py1 + ")";
        String p2 = "(" + px2 + ", " + py2 + ")";
        if(res > 0){
            if(px0 < px1){
                System.out.println(p2 + " is on the left side of the line from " + p0 + " to " + p1);
            }
            else{
                System.out.println(p2 + " is on the left side of the line from " + p1 + " to " + p0);
            }
        }
        else if(res == 0){
            if(px0 < px1){
                System.out.println(p2 + " is on the line from " + p0 + " to " + p1);
            }
            else{
                System.out.println(p2 + " is on the line from " + p1 + " to " + p0);
            }
        }
        else{
            if(px0 > px1){
                String temp;
                temp = p0;
                p0 = p1;
                p1 = temp;
            }
            System.out.println(p2 + " is on the right side of the line from " + p0 + " to " + p1);
        }


    }
}
