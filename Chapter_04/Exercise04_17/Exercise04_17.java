/*
(Days of a month) Write a program that prompts the user to enter the year and the
first three letters of a month name (with the first letter in uppercase) and displays
the number of days in the month. If the input for month is incorrect, display a 
message as presented in the following sample runs:


    Enter a year: 2001
    Enter a month: Jan
    Jan 2001 has 31 days


    Enter a year: 2016
    Enter a month: jan
    jan is not a correct month name
*/

import java.util.Scanner;
public class Exercise04_17{

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = str.nextInt();
        System.out.print("Enter a month: ");
        String month = str.next().substring(0, 3).toLowerCase();
        boolean w = false;
        int q = 0;
        if(month.equals("jan") || month.equals("mar") || month.equals("may")
                || month.equals("jul") || month.equals("aug") || month.equals("oct") || month.equals("dec")){
            q = 31;
            w = true;
        }
        else if(month.equals("feb") || month.equals("apr") || month.equals("jun") ||
                month.equals("sep") || month.equals("nov")){
            if(month.equals("feb") && year % 4 == 0){
                q = 29;
            }
            else{
                q = 30;
            }
            w = true;
        }
        else{
            System.out.print("wrong input");
        }
        if(w){
            char j = month.toUpperCase().charAt(0);
            String monthOutput1 = j + month.toLowerCase().substring(1);
            System.out.print(monthOutput1 + " " + year + " has " + q + " days");
        }
    }
}
