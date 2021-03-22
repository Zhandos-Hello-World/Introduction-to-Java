package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("i               m(i)");
        System.out.println("--------------------");
        for(int i = 1; i <= 901; i += 100){
            if(i >= 100){
                System.out.print(i + "             ");
            }
            else{
                System.out.print(i + "               ");
            }
            System.out.printf("%.4f", calc(i));
            System.out.println();
        }
    }
    public static double calc(int number){
        double res = 0;
        double math;
        for(double i = 1; i <= number; i ++){
            math = (Math.pow(-1, i + 1)) / (2 * i - 1);
            res += math;
        }
        return res * 4;
    }
}
