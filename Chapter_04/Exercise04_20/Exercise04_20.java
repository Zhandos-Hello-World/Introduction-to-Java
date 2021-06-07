/*
(Process a string) Write a program that prompts the user to enter a string and displays its length and its last character.
*/
import java.util.Scanner;
public class Exercise04_20 {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String a = str.nextLine();
        System.out.print("String length is " + a.length() + " and index 1 is " + a.charAt(0));
    }
}
