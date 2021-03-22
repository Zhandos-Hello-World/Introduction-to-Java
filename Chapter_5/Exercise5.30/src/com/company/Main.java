package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        double res = 0;
        System.out.print("Enter an amount: ");
        double loanAmount = str.nextDouble();
        double amount = loanAmount;
        double a = loanAmount;
        System.out.print("Enter the annual interest rate (e.g., 5): ");
        double percent = str.nextDouble();
        System.out.print("Enter number of months: ");
        double month = str.nextDouble();
        double percentRes = (percent / 100) % 12;
        int l = 1;
        for(int i = 1; i < month; i++){
            a = amount * (1 + percentRes);
            if(i == 1){
                System.out.print(l + ") ");
                System.out.println(a);
                res += a;
                l++;
            }
            amount = (loanAmount + a) * (1 + percentRes);
            res += amount;
            System.out.print(l + ") ");
            System.out.printf("%.3f", amount);
            System.out.println();
            l++;
        }
        System.out.println();
        System.out.print("Total score: " + res);

    }
}
