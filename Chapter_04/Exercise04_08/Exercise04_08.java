/*
(Find the character of an ASCII code) Write a program that receives a character
and displays its ASCII code (an integer between 0 and 127). Here is a sample run:

    Enter a character: E
    The ASCII code for character E is 69

*/
import java.util.Scanner;

public class Exercise04_08 {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter an ASCII code: ");
        int a = str.nextInt();
        char res = (char)a;
        System.out.print("The character for ASCII code " + a + " is " + res);
    }
}
