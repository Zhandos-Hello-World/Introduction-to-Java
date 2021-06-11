/*
(Print calendar) Programming Exercise 3.21 uses Zeller’s 
congruence to calculate the day of the week. Simplify Listing 6.12, 
PrintCalendar.java, using Zeller’s
algorithm to get the start day of the month.

*/
import java.util.Scanner;
public class Exercise06_34{

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter year: (e.g., 2012): ");
        int year = str.nextInt();
        System.out.print("Enter month: 1-12: ");
        int month = str.nextInt();
        output(year, month);
    }
    public static int calc(int year, int m){
        int k = year % 100;
        int q = 1;
        int j = (year) / 100;
        return (int)(((q + ((26 * (m +1)) / 10) + k + (k / 4) + (j / 4) + 5 * (j))) % 7);
    }
    public static void output(int year, int month){
        String a;
        int dayWeek = calc(year, month);
        switch (dayWeek){
            case 0:a = "Saturday";break;
            case 1:a = "Sunday";break;
            case 2:a = "Monday";break;
            case 3:a = "Tuesday";break;
            case 4:a = "Wednesday"; break;
            case 5:a = "Thursday"; break;
            case 6:a = "Friday";break;
            default:a = "Error"; break;
        }
        System.out.print(a);
    }

}
