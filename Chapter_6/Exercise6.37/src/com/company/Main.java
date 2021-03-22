package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = str.nextInt();
        System.out.print("Enter a width: ");
        int width = str.nextInt();
        System.out.print("Result is " + format(number, width));
    }
    public static String format(int number, int width){
        if (width >= 1) {
            if(width == 1){
                return String.valueOf(number);
            }
            else if(width == getSize(number)){
                return String.valueOf(number);
            }
            else{
                StringBuilder num = new StringBuilder();
                num.append("0".repeat(Math.max(0, width - getSize(number))));
                num.append(String.valueOf(number));
                return String.valueOf(num);
            }
        }
        else{
            return "Invalid input";
        }
    }
    public static int getSize(int number){
        int count = 0;
        while(number != 0){
            number /= 10;
            count ++;
        }
        return count;
    }
}
