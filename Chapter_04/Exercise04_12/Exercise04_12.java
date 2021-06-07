/*
(Hex to binary) Write a program that prompts the user to enter a hex digit and
displays its corresponding binary number. For an incorrect input, display invalid
input. Here is a sample run:

    Enter a hex digit: B
    The binary value is 1011

    Enter a hex digit: G
    G is an invalid input

*/
import java.util.*;
public class Exercise04_12 {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        char a = str.next().toLowerCase().charAt(0);
        int number = (int)(a);
        System.out.print("The binary value is " + number);

    }
}
