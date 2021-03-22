package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int a = str.nextInt();
        int years = a / (60 * 24 * 365);
        int days = a / (60 * 24);
        days = days % years;
        System.out.print(a + " minutes is approximately " + years + " years and " + days + " days");
    }
}
