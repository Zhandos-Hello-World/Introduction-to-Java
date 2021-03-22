package com.company;

public class Main {

    public static void main(String[] args) {
        for(double i = 10000; i < 100000; i*=2){
            System.out.println(calc(i));
        }
    }
    public static double calc(double t){
        double res = 0;
        double divisorRes = 1;
        for(int i = 0; i <= t; i++){
            double c = factorial(i, divisorRes);
            res += 1 / c;
        }
        return res;
    }
    public static double factorial(int i, double d){
        double q = 1;
        if(i == 0 && i == 1){
            return d = 1;
        }
        else{
            for(int t = 1; t <= i; t++){
                q *= t;
            }
            d = q;
            return d;
        }

    }
}
