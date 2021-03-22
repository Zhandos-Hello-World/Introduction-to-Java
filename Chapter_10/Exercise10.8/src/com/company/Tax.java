package com.company;

public class Tax {
    private int filingStatus;
    private int[][] brackets = {{8350, 33950, 82250, 171550, 372950},
            {16700, 67900, 137050, 20885, 372950},
            {8350, 33950, 68525, 104425, 186475},
            {11950, 45500, 117450, 190200, 372950}};
    private double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
    private double taxableIncome;


    Tax(){

    }
    Tax(int filingStatus, int[][] brackets, double[]rates, double taxableIncome){

    }


    double getTaxableIncome(){
        return taxableIncome;
    }
}
