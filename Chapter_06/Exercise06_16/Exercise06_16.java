/*
(Number of days in a year) Write a method that returns the number of days in a
year using the following header:

    public static int numberOfDaysInAYear(int year)

Write a test program that displays the number of days in the years between 2014
and 2034.

*/
import java.util.Scanner;
public class Exercise06_16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year from 2014 to 2034: ");
        int year = input.nextInt();
        if(year >= 2014 && year <= 2034)
            System.out.print(year + " " + numberOfDaysInAYear(year) + " days");
    }
    public static int numberOfDaysInAYear(int year){
        if (year % 400 == 0)
            return 366;

        if (year % 100 == 0)
            return 365;

        if (year % 4 == 0)
            return 366;
        
        return 365;
    }
}
