package com.company;

public class Main {

    public static void main(String[] args) {
        double res_1 = 0;
        double res_2 = 0;
        for(double i = 1; i <= 50000; i++){
            res_1 += 1 / i;
        }
        for(double i = 50000; i >= 1; i--){
            res_2 += 1 / i;
        }
        System.out.println(res_1);
        System.out.print(res_2);
    }
}
