package com.company;

public class Main {

    public static void main(String[] args) {
        double num_1 = 1;
        double num_2 = 2;
        double res = 0;
        while(num_1 <= 624){
            res += 1.0 / (Math.sqrt(num_1) + Math.sqrt(num_2));
            num_2++;
            num_1++;
        }
        System.out.print(res);
    }
}
