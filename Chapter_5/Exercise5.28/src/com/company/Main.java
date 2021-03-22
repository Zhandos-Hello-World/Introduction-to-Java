package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int q = 0;
        System.out.print("Year: ");
        int year = str.nextInt();
        if(year % 4 == 0){
            if(year % 100 != 0){
                q += 1;
            }
            else{
                if(year % 400 == 0){
                    q += 1;
                }
            }
        }
        System.out.print("Month: ");
        int month = str.nextInt();
        int month_1 = month;
        if (month == 2) {
            q += 1;
        }


        if(month == 1 || month == 10){
            month = 1;
        }
        else if(month == 5){
            month = 2;
        }
        else if(month == 8){
            month = 3;
        }
        else if(month == 2 || month == 3 || month == 11){
            month = 4;
        }
        else if(month == 6){
            month = 5;
        }
        else if(month == 12 || month == 9){
            month = 6;
        }
        else if(month == 4 || month == 7){
            month = 0;
        }
        System.out.print("Day: ");
        int day = str.nextInt();
        int resYear = (6 + (year % 100) + ((year % 100) / 4)) % 7;
        int res = (day + month + resYear) % 7;
        if(q == 2 && day <= 29 && day >= 1){
            res += 1;
        }
        String s;
        if(q == 2){
            res++;
        }
        switch (res){
            case 0: s = "Saturday"; break;
            case 1: s = "Sunday"; break;
            case 2: s = "Monday"; break;
            case 3: s = "Tuesday"; break;
            case 4: s = "Wednesday"; break;
            case 5: s = "Thursday"; break;
            case 6: s = "Friday"; break;
            default: s = "";
        }
        String s_2;
        switch (month_1){
            case 1: s_2 = "January";break;
            case 2: s_2 = "February";break;
            case 3: s_2 = "March";break;
            case 4: s_2 = "April";break;
            case 5: s_2 = "May";break;
            case 6: s_2 = "Jule";break;
            case 7: s_2 = "July";break;
            case 8: s_2 = "August";break;
            case 9: s_2 = "September";break;
            case 10:s_2 = "October";break;
            case 11:s_2 = "November";break;
            case 12:s_2 = "December";break;
            default:s_2 = ""; break;
        }
        System.out.print(s_2 + " " + day + ", " + year + " is " + s);
    }
}
