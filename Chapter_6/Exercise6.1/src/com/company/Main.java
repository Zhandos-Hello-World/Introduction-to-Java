package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.print("The first 100 pentagon number ");
        for(int i = 1; i <= 100; i++){
            System.out.println(getPentagonalNumber(i));
        }
    }
    public static int getPentagonalNumber(int n){
        return n * (3 * n - 1) / 2;
    }
}
