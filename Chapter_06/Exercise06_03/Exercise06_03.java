/*
(Palindrome integer) Write the methods with the following headers:

    public static int reverse(int number)

    public static boolean isPalindrome(int number)

Use the reverse method to implement isPalindrome. A number is a palindrome if its reversal is the same as itself.
Write a test program that prompts the user to enter an integer and reports whether the integer is a palindrome.

*/
import java.util.Scanner;
public class Exercise06_03{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.print("This number is" + (isPalindrome1(num) ? " " : " not") + " palindrome");
    }
    public static boolean isPalindrome1(int number){
        return reverse(number) == number;
    }
    public static int reverse(int number){
        String strNumber = "";
        while(number != 0){
            strNumber += String.valueOf(number % 10);
            number /= 10;
        }
        return Integer.parseInt(strNumber);
    }
}
