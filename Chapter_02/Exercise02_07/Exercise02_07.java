/*
(Find the number of years) Write a program that prompts the user to enter the
minutes (e.g., 1 billion), and displays the number of years and remaining days for
the minutes. For simplicity, assume that a year has 365 days. Here is a sample run:

Enter the number of minutes: 1000000000
1000000000 minutes is approximately 1902 years and 214 days
*/

import java.util.Scanner;
public class Exercise02_07{

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int a = str.nextInt();
        int years = a / (60 * 24 * 365);
        int days = a / (60 * 24);
        days = days % years;
        System.out.print(a + " minutes is approximately " + years + " years and " + days + " days");
    }
}
