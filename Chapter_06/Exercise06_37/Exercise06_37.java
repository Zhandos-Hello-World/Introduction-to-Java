/*
(Format an integer) Write a method with the following header to format the integer with the specified width.

    public static String format(int number, int width)

The method returns a string for the number with one or more prefix 0s. The size of the
string is the width. For example, format(34, 4) returns 0034 and format(34,
5) returns 00034. If the number is longer than the width, the method returns the
string representation for the number. For example, format(34, 1) returns 34.
Write a test program that prompts the user to enter a number and its width, and
displays a string returned by invoking format(number, width).

*/
import java.util.Scanner;
public class Exercise06_37{

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = str.nextInt();
        System.out.print("Enter a width: ");
        int width = str.nextInt();
        System.out.print("Result is " + format(number, width));
    }
    public static String format(int number, int width){
        if (width >= 1) {
            if(width == 1){
                return String.valueOf(number);
            }
            else if(width == getSize(number)){
                return String.valueOf(number);
            }
            else{
                StringBuilder num = new StringBuilder();
                num.append("0".repeat(Math.max(0, width - getSize(number))));
                num.append(String.valueOf(number));
                return String.valueOf(num);
            }
        }
        else{
            return "Invalid input";
        }
    }
    public static int getSize(int number){
        int count = 0;
        while(number != 0){
            number /= 10;
            count ++;
        }
        return count;
    }
}
