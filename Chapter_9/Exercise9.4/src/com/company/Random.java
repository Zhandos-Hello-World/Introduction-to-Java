package com.company;

public class Random {
    Random(int q){
    }
    void nextInt(int a){
        int i = 0;
        while(i < 50){
            System.out.print((int)(Math.random() * (a + 1) + 0) + " ");
            i++;
        }
    }
}
