package com.company;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        System.out.println("Feet        Meters        |        Meters        Feet");
        System.out.println("-----------------------------------------------------");
        for(double foot = 1, meters = 20; foot <= 10; foot++, meters += 5){
            System.out.print(foot);
            if(foot >= 10){
                System.out.print("        ");
            }
            else{
                System.out.print("         ");
            }
            DecimalFormat f = new DecimalFormat(".000");
            if(footToMeter(foot) < 1){
                System.out.print("0");
            }
            System.out.print(f.format(footToMeter(foot)));
            System.out.print("        |         ");
            System.out.print(meters);
            if(meters >= 100){
                System.out.print("         ");
            }
            else{
                System.out.print("          ");
            }
            System.out.print(meterToFoot(meters));
            System.out.println();
        }
    }
    public static double footToMeter(double foot){
        return 0.305 * foot;
    }
    public static double meterToFoot(double meter){
        return 3.279 * meter;
    }
}
