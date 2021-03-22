package com.company;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;

import static java.util.Calendar.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter full year (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter month as a number between 1 and 12: ");
        int month = input.nextInt();
        input(year, month);

    }
    public static void input(int year, int month){
        System.out.println("        " + converterMonth(month) + ", " + year);
        System.out.println("------------------------------");
        System.out.print(find(year, month));

    }
    public static int find(int year, int month){
        Calendar date = getInstance();
        date.set(year, month, 1);
        MONTH = year;
        return date.getFirstDayOfWeek();
    }




    public static String converterMonth(int month){
        String s = "";
        switch (month - 1){
            case 0:s = "January";break;
            case 1:s = "February";break;
            case 2:s = "March";break;
            case 3:s = "April";break;
            case 4:s = "May";break;
            case 5:s = "June";break;
            case 6:s = "July";break;
            case 7:s = "August";break;
            case 8:s = "September";break;
            case 9:s = "October";break;
            case 10:s = "November";break;
            case 11:s = "December";break;
        }
        return s;
    }
}