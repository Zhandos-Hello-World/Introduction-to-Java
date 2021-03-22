package com.company;

public class Main {

    public static void main(String[] args) {
        StackOfIntegers num1 = new StackOfIntegers(120);
        int []arr = num1.primeNumberData();
        num1.displayPrimeNumber();
        System.out.println();
        num1.displayPrimeNumber(300);
    }
}
