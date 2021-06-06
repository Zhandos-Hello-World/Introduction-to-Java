/*
(Find the number of days in a month) Write a program that prompts the user to enter
the month and year and displays the number of days in the month. For example, if
the user entered month 2 and year 2012, the program should display that February
2012 has 29 days. If the user entered month 3 and year 2015, the program should
display that March 2015 has 31 days.

*/
import java.util.Scanner;

public class Exercise03_11{
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a month:");
        int month = str.nextInt();
        System.out.print("Enter an year:");
        int year = str.nextInt();
        boolean TrueFalse = false;
        if(year % 4 == 0) {
            TrueFalse = true;
        }
        switch (month){
            case 1: System.out.print("January " + year + " had 31");
            case 2:if(TrueFalse){
                    System.out.println("February " + year + " had 29");break;
                }
                else{
                    System.out.println("February " + year + " had 28");break;
                }
            case 3: System.out.println("March " + year + " had 31");break;
            case 4: System.out.println("April " + year + " had 30");break;
            case 5: System.out.println("May " + year + " had 31");break;
            case 6: System.out.println("June " + year + " had 30");break;
            case 7: System.out.println("July " + year + " had 31");break;
            case 8: System.out.println("August " + year + " had 31");break;
            case 9: System.out.println("September " + year + " had 30");break;
            case 10: System.out.println("October " + year + " had 31");break;
            case 11: System.out.println("November " + year + " had 30");break;
            case 12: System.out.println("December " + year + " had 31");break;
            default: System.out.println("Error");break;
                }
            }
    }
