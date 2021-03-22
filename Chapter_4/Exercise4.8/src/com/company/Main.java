package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter an ASCII code: ");
        int a = str.nextInt();
        char res = (char)a;
        System.out.print("The character for ASCII code " + a + " is " + res);

    }
}
