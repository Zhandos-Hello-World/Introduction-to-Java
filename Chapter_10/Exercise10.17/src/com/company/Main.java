package com.company;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BigDecimal longMaxValue = new BigDecimal(Long.MAX_VALUE);
        long start = (long) Math.sqrt(Long.MAX_VALUE);
        BigDecimal n = new BigDecimal(start);
        int count = 0;


        while (count < 10) {

            BigDecimal squared = n.multiply(n);
            if (squared.compareTo(longMaxValue) > 0) {
                count++;
                System.out.println(count+": " + n + " squared = " + squared);
            }
            n = n.add(BigDecimal.ONE);
        }
    }

}
