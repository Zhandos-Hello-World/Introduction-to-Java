package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter year: (e.g., 2012): ");
        double year = str.nextDouble();
        System.out.print("Enter month: 1-12: ");
        double m = str.nextDouble();
        System.out.print("Enter the day of the month: 1-31: ");
        double q = str.nextDouble();
        double j = year / 100;
        double k = year % 100;
        double h = (q + ((26 * (m + 1)) / 10)  + k + (k/4) + (j / 4) + (5 * j)) % 7;
        String s = "";
        /*
        0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4:
            Wednesday, 5: Thursday, 6: Friday
         **/
        switch((int)h){
            case 0: s = "Saturday";break;
            case 1: s = "Sunday";break;
            case 2: s = "Monday";break;
            case 3: s = "Tuesday";break;
            case 4: s = "Wednesday";break;
            case 5: s = "Thursday";break;
            case 6: s = "Friday";break;
        }
        System.out.print("Day of the week is " + s);
    }
}
