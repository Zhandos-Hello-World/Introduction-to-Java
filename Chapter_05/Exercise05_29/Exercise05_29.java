/*
(Display calendars) Write a program that prompts the user to enter the year and
first day of the year and displays the calendar table for the year on the console. For
example, if the user entered the year 2013, and 2 for Tuesday, January 1, 2013,
your program should display the calendar for each month in the year, as follows:



*/
import java.util.Scanner;
public class Exercise05_29{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Year: ");
        int year = input.nextInt();

        System.out.print("Month: ");
        int month = input.nextInt();


        int codeMonth = 0;
        if(month == 1 || month == 10){
            codeMonth = 1;
        }
        else if(month == 5){
            codeMonth = 2;
        }
        else if(month == 8){
            codeMonth = 3;
        }
        else if(month == 2 || month == 3 || month == 11){
            codeMonth = 4;
        }
        else if(month == 6){
            codeMonth = 5;
        }
        else if(month == 12 || month == 9){
            codeMonth = 6;
        }
        int q = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? 1 : 0;
        q += (month == 2) ? 1:0;
        int codeYear = (6 + (year % 100) + ((year % 100) / 4)) % 7;
        int dayOfWeek = (1 + codeMonth + codeYear) % 7;
        dayOfWeek += (q == 2) ? 2:0;
        dayOfWeek = (dayOfWeek == 0) ? 7:dayOfWeek;
        dayOfWeek -= 1;


        System.out.println(dayOfWeek);

        String monthStr = "";
        switch (month){
            case 1: monthStr = "January";break;
            case 2: monthStr = "February";break;
            case 3: monthStr = "March";break;
            case 4: monthStr = "April";break;
            case 5: monthStr = "May";break;
            case 6: monthStr = "June";break;
            case 7: monthStr = "July";break;
            case 8: monthStr = "August";break;
            case 9: monthStr = "September";break;
            case 10: monthStr = "October";break;
            case 11: monthStr = "November";break;
            case 12: monthStr = "December";break;
        }

        //find max day of month and check for leap year
        int maxDay = 0;
        boolean leap = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            maxDay = 31;
        }
        else if(month == 4 || month == 6 || month == 9 || month == 11){
            maxDay = 30;
        }
        else if(leap && month == 2){
            maxDay = 29;
        }
        else if(month == 2){
            maxDay = 28;
        }

        int currentDay = 1;
        System.out.printf("%26s\n", monthStr);
        System.out.println("__________________________________________________");
        System.out.printf("%5s%7s%7s%7s%7s%7s%7s\n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
        for(int i = 0; i < 6; i++){
            for(int j = 1; j <= 7; j++){
                if(j <= dayOfWeek && i == 0){
                    System.out.printf("%" + ((j == 1) ? 5:7) +"s", "");
                }
                else if(currentDay <= maxDay){
                    System.out.printf("%" + ((j == 1) ? 5:7) +"s", "" + currentDay);
                    currentDay++;
                }
            }
            System.out.println();
        }
    }
}