/*
(Convert milliseconds to hours, minutes, and seconds)
 Write a method that converts milliseconds to hours, minutes, and seconds using the following header:
public static String convertMillis(long millis)
The method returns a string as hours:minutes:seconds. For example,
convertMillis(5500) returns a string 0:0:5, convertMillis(100000)
returns a string 0:1:40, and convertMillis(555550000) returns a string
154:19:10. Write a test program that prompts the user to enter a long integer for
milliseconds and displays a string in the format of hours:minutes:seconds.

*/
import java.util.Scanner;
public class Exercise06_25{

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        long a = str.nextLong();
        System.out.print(convertMillis(a));
    }
    public static String convertMillis(long millis){
        long totalSeconds = millis / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        return currentHour + ":" + currentMinute + ":" + currentSecond;
    }
}
