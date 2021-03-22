package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String a = str.nextLine();
        int d1 = Integer.parseInt(String.valueOf(a.charAt(0)));
        int d2 = Integer.parseInt(String.valueOf(a.charAt(1)));
        int d3 = Integer.parseInt(String.valueOf(a.charAt(2)));
        int d4 = Integer.parseInt(String.valueOf(a.charAt(3)));
        int d5 = Integer.parseInt(String.valueOf(a.charAt(4)));
        int d6 = Integer.parseInt(String.valueOf(a.charAt(5)));
        int d7 = Integer.parseInt(String.valueOf(a.charAt(6)));
        int d8 = Integer.parseInt(String.valueOf(a.charAt(7)));
        int d9 = Integer.parseInt(String.valueOf(a.charAt(8)));
        int sum = (d1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
        if(sum == 1){
            System.out.println("The ISBN-10 number is " + a);
        }
        else{
            System.out.println("The ISBN-10 number is " + a + "X");
        }
    }
}