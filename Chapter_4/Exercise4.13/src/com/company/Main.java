package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String a = str.nextLine().toLowerCase();
        char d = a.charAt(0);
        if(d >= 'a' && d <= 'z'){
            if(d == 'a' || d == 'e' || d == 'u' || d == 'y' || d == 'o' || d == 'i'){
                System.out.print( d + " is a vowel");
            }
            else{
                System.out.print(d + " is a constant");
            }
        }
        else{

            System.out.print(d + " is an invalid input");
        }

    }
}
