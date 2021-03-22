package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = str.nextInt();
        String[]arr = {"monkey", "rooster", "dog", "pig", "rat",
                        "ox", "tiger", "rabbit", "dragon", "snake",
                        "horse", "sheep"};
        int x = year % 12;
        System.out.print(arr[x]);
    }
}
