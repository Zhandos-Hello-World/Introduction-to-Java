package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String a = str.next().toUpperCase();
        char d = a.charAt(0);
        int res = (int)d;
        System.out.print("The Unicode for the character " + d + " is " + res);


    }
}
