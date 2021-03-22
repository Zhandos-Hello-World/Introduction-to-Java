package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = str.nextLine();
        int num = a.length() - 1;
        while (num >= 0){
            System.out.print(a.charAt(num));
            num--;
        }
    }
}
