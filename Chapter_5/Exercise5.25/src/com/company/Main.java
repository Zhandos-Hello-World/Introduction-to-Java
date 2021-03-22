package com.company;

public class Main {

    public static void main(String[] args) {
        for(int i = 10000; i < 100000; i*=2){
            System.out.println(calc(i));
        }

    }
    public static double calc(double range){
        double pi = 0;
        for(int i = 1; i <= range; i++){
            pi += (Math.pow(-1, i + 1)) / (2 * i - 1);
        }
        return 4 * pi;
    }
}
