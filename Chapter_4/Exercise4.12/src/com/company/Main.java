package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        char a = str.next().toLowerCase().charAt(0);
        int number = (int)(a);
        System.out.print("The binary value is " + number);

    }
}
