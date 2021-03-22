package com.company;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        String numString = "" + 1;
        // creating a 50 digit decimal number
        for (int i = 0; i < 49; i++) {

            numString += "0";
        }

        BigDecimal hugeNum = new BigDecimal(numString);
        int hugeNumCount = 0;
        while (hugeNumCount < 10) {

            // check if huge number if divisible by 2 of 3
            BigDecimal remainder2 = hugeNum.remainder(new BigDecimal(2));
            BigDecimal remainder3 = hugeNum.remainder(new BigDecimal(3));
            if (remainder2.equals(BigDecimal.ZERO) || remainder3.equals(BigDecimal.ZERO)) {
                hugeNumCount++;
                System.out.println(hugeNumCount +": " + hugeNum);
            }
            hugeNum = hugeNum.add(BigDecimal.ONE);
        }
    }

}
