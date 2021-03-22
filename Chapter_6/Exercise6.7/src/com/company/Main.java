package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("The amount invested: ");
        double investmentAmount = str.nextDouble();
        System.out.print("Annual interest rate: ");
        double monthlyInterestRate = str.nextDouble() / 1200;
        int years = (int)monthlyInterestRate / 12;
        System.out.println("Years    Future Value");
        for(int i = 1; i <= 30; i++){
            if(i >= 10)
                System.out.print(i + "       ");
            else
                System.out.print(i  + "        ");
            System.out.println(futureInvestmentValue(investmentAmount, monthlyInterestRate, i));
        }


    }
    public static double optimizationOutput(double res){
        res *= 100;
        res = Math.round(res);
        res /= 100;
        return res;
    }

    public static double futureInvestmentValue(
            double investmentAmount, double monthlyInterestRate, int years){
        double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), years*12);
        double result = optimizationOutput(futureInvestmentValue);
        return result;

    }
}
