/*
(Find the Unicode of a character) Write a program that receives a character and
displays its Unicode. Here is a sample run:

    Enter a character: E
    The Unicode for the character E is 69

*/
import java.util.Scanner;
public class Exercise04_09{

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String a = str.next().toUpperCase();
        char d = a.charAt(0);
        int res = (int)d;
        System.out.print("The Unicode for the character " + d + " is " + res);


    }
}
