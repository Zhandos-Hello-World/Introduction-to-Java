package com.company;

public class Main {

    public static void main(String[] args) {
        double pay = 10000.0;
        int sum = 0;
        int one = 0;
        double res;
        for(int i = 1; i <= 14; i++){
            res = pay * 1.05;
            if(i == 11){
                one = (int)res;
            }
            if(i > 10){
                sum += (int)res;
            }
            pay = res;
        }
        System.out.print(sum + "       " + one);
    }
}
