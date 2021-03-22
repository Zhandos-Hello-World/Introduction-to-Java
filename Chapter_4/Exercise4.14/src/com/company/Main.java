package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        char a = str.nextLine().toUpperCase().charAt(0);
        if(a >= 'A' && a <= 'F'){
            int w = 0;
            switch (a){
                case 'A':w = 4;break;
                case 'B':w = 3;break;
                case 'C':w = 2;break;
                case 'D':w = 1;break;
                case 'F':w = 0;break;
            }
            System.out.print("The numeric value for grade " + a +" is " + w);

        }
        else{
            System.out.print(a  + " is an invalid grade");
        }

    }
}
