/*
(Display current date and time) Listing 2.7, ShowCurrentTime.java, displays the
current time. Revise this example to display the current date and time. 
The calendar example in Listing 6.12, PrintCalendar.java, should give you some ideas on
how to find the year, month, and day.
*/

public class Exercise06_24{

    public static void main(String[] args) {
        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = totalHours % 24;

        long totalDays = totalHours / 24;

        int currentYear = 1970;

        while (totalDays >= 365) {
            if (isLeapYear(currentYear))
                totalDays -= 366;
            else
                totalDays -= 365;
            currentYear++;
        }

        int currentMonths = 1;
        while (totalDays >= 28) {
            if (currentMonths == 1 || currentMonths == 3 || currentMonths == 5 || currentMonths == 7
                    || currentMonths == 8 || currentMonths == 10 || currentMonths == 12) {
                totalDays -= 31;
                currentMonths++;
            } else if (currentMonths == 4 || currentMonths == 6 || currentMonths == 9 || currentMonths == 11) {
                totalDays -= 30;
                currentMonths++;
            } else if (isLeapYear(currentYear) && currentMonths == 2) {
                totalDays -= 29;
                currentMonths++;
            } else {
                totalDays -= 28;
                currentMonths++;
            }
        }

        long currentDay;
        if (totalDays == 0)
            currentDay = 1;
        else
            currentDay = totalDays + 1;

        // GMT+8
        if (currentHour+8 >= 24) {
            currentHour = currentHour+8-24;
        }

        // Display results
        System.out.println("Current data is " + currentYear +
                "-"+currentMonths+"-"+currentDay+ "\nCurrent time is " +
                currentHour+":"+currentMinute+":"+currentSecond+" (GMT+8)");
    }

    /** Determine if it is a leap year */
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}