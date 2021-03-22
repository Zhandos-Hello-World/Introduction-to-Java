package com.company;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        System.out.println("p      2^p - 1");
        BigInteger number = new BigInteger("1");
        for(int i = 2; i <= 102; i++){
            number = new BigInteger((long)Math.pow(2, i) - 1     + "");
            System.out.println(i + "      " + number);
        }

    }
}
