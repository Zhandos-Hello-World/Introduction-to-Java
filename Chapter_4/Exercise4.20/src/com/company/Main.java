package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String a = str.nextLine();
        System.out.print("String length is " + a.length() + " and index 1 is " + a.charAt(0));
    }
}
