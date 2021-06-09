/*
(Reverse a string) Write a program that prompts the user to enter a string and
displays the string in reverse order.
*/

import java.util.Scanner;

public class Exercise05_46{

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = str.nextLine();
        for(int i = a.length() - 1; i >= 0; i--)
            System.out.print(a.charAt(i));
    }
}
