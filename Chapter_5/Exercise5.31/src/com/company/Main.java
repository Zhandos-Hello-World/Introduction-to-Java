package com.company;
import java.util.Scanner;
import java.util.Locale;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.print("Enter the initial deposit amount: ");
        double amount = str.nextDouble();
        System.out.print("Enter annual percentage yield: ");
        double percent = str.nextDouble() / 1200.0;
        System.out.print("Enter maturity period (number of months): ");
        double month = str.nextDouble();
        System.out.println("Month CD Value");
        double res = amount;
        double output;
        for(int i = 1; i <= month; i++){
            res = amount + amount * percent;
            output = res * 100;
            output = Math.round(output);
            output /= 100;
            if(i >= 10 && i <= 100){
                System.out.println(i + "    " + output);
            }
            else if(i < 10){
                System.out.println(i + "     " + output);

            }
            else{
                System.out.println(i + "   " + output);
            }
            amount = res;
        }
    }
}
