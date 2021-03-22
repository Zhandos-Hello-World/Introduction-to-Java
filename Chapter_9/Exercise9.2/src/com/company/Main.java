package com.company;

public class Main {

    public static void main(String[] args) {
        Stock company1 = new Stock("ORCL", "Oracle Corporation");
        Stock.previousClosingPrice = 34.5;
        Stock.currentPrice = 34.35;
        System.out.print(company1.getChangePercent());
    }
}
