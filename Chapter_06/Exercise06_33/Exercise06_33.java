/*
(Current date and time) Invoking System.currentTimeMillis() returns the
elapsed time in milliseconds since midnight of January 1, 1970. Write a program
that displays the date and time. Here is a sample run:

*/
public class Exercise06_33{

    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
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

        if (currentHour+5 >= 24) {
            currentHour = currentHour+8-24;
        }
        System.out.println("Current data is " + currentYear +
                "-"+getMonth(currentMonths)+"-"+currentDay+ "\nCurrent time is " +
                currentHour+":"+currentMinute+":"+currentSecond+" (GMT+5)");

    }
    public static String getMonth(int month){
        switch(month){
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default:return "null";
        }
    }
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}