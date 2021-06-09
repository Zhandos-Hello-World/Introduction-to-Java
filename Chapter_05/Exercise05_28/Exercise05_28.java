/*
(Display the first days of each month) Write a program that prompts the user to
enter the year and first day of the year, then displays the first day of each month in
the year. For example, if the user entered the year 2013, and 2 for Tuesday, January
1, 2013, your program should display the following output:

January 1, 2013 is Tuesday
...
December 1, 2013 is Sunday

*/

import java.util.Scanner;

public class Exercise05_28{

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Year: ");
        int year = str.nextInt();
        int q = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? 1 : 0;
        System.out.print("Month: ");
        int month = str.nextInt();
        int month_1 = month;
        q += (month == 2) ? 1:0;

        switch(month){
            case 1: month = 1;break;
            case 2: month = 4;break;
            case 3: month = 4;break;
            case 4: month = 0;break;
            case 5: month = 2;break;
            case 6: month = 5;break;
            case 7: month = 0;break;
            case 8: month = 3;break;
            case 9: month = 6;break;
            case 10: month = 1;break;
            case 11: month = 4;break;
            case 12: month = 6;break;
        }

        System.out.print("Day: ");
        int day = str.nextInt();
        int resYear = (6 + (year % 100) + ((year % 100) / 4)) % 7;
        int res = (day + month + resYear) % 7;
        if(q == 2 && day <= 29 && day >= 1){
            res++;
        }
        String s = "";
        res += (q == 2) ? 1:0;

        switch (res){
            case 0: s = "Saturday"; break;
            case 1: s = "Sunday"; break;
            case 2: s = "Monday"; break;
            case 3: s = "Tuesday"; break;
            case 4: s = "Wednesday"; break;
            case 5: s = "Thursday"; break;
            case 6: s = "Friday"; break;
        }

        String s_2 = "Invalid number of month";
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
        }
        System.out.print(s_2 + " " + day + ", " + year + " is " + s);
    }
}
