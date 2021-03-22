package com.company;

public class Main {

    public static void main(String[] args) {
        double res = 0;
        for(double i = 3.0, x = 1.0; i <= 99.0; i+=2.0, x +=2.0){
            res += x / i;
        }
        System.out.print(res);
    }
}
