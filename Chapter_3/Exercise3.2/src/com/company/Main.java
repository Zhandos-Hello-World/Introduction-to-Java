package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis() / 7 % 10);
        int number3 = (int) (System.currentTimeMillis() / 7 % 10);
        Scanner input = new Scanner(System.in);
        int answer = number1 + number2 + number3;
        System.out.print("What is " + number1 + " + " + number2 + " + "+number3 +"? ");
        int number = input.nextInt();
        System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 + number3 == answer));
    }
}
