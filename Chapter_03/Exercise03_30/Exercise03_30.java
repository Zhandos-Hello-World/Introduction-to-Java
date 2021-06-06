/*
(Current time) Revise Programming Exercise 2.8 to display the hour using a
12-hour clock. Here is a sample run: 

	Enter the time zone offset to GMT: -5
	The current time is 4:50:34 AM


*/
import java.util.Scanner;
public class Exercise03_30{

    public static void main(String[] args) {
        Scanner str =  new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        int gmt = str.nextInt()+1;
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = (totalHours+gmt) % 24;
        if(currentHour > 12){
            currentHour %= 12;
        }
        System.out.println("The current time is " + currentHour  + ":" + currentMinute + ":" + currentSecond);

    }
}

