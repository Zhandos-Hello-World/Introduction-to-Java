package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter the year from 2000 to 2020: ");
        int year = str.nextInt();
        if(year >= 2000 && year <= 2020)
            System.out.print(year + " " + numberOfDaysInAYear(year) + " days");
    }
    public static int numberOfDaysInAYear(int year){
        boolean a = false;
        if(year % 4 == 0){
            a = true;
        }

        if(a){
            return 366;
        }
        else{
            return 365;
        }
    }
}
