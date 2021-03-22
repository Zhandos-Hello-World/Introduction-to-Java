package com.company;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner str = new Scanner(System.in);
        System.out.print("Year: ");
        int year = str.nextInt();

        System.out.print("Month: ");
        int month = str.nextInt() - 1;
        int MaxDay = DayRange(month + 1, year);


        String[] arr = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        System.out.println("              " + arr[month] + " " + year);
        System.out.println("-------------------------------------------");
        System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
        month += 1;
        int x = 1;
        for(int i = 1, l = 1; i <= 35; i++){
            if(output(year, month, i) == 1){

            }
        }
    }
    public static int DayRange(int month, int year){
        boolean a = false;
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    a = true;
                }
                a = true;
            }
            a = true;
        }

        int day = 0;
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            day = 31;
        }
        else if(month == 4 || month == 6 || month == 9 || month == 11){
            day = 30;
        }
        else if(a && month == 2){
            day = 29;
        }
        else if(!a && month == 2){
            day = 28;
        }
        return day;
    }

    void function(){
        Calendar calendar = new GregorianCalendar(2020, 1, 2);
        System.out.println(calendar.get(Calendar.WEEK_OF_MONTH));
    }



    public static int output(int year, int month, int day){
        int q = 0;
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

        int resYear = (6 + (year % 100) + ((year % 100) / 4)) % 7;
        int res = (day + month + resYear) % 7;
        if(q == 2 && day <= 29 && day >= 1){
            res += 1;
        }
        String s;
        if(q == 2){
            res++;
        }
        return res;
    }

}