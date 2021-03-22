package com.company;
public class Main {

    public static void main(String[] args) {
        for(int i = 100; i <= 1000; i += 10){
            if(i % 5 == 0 && i % 6 == 0){
                System.out.println(i);
            }
        }
    }
}
