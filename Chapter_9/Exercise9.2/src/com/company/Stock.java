package com.company;

public class Stock {
    String symbol;
    String name;
    static double previousClosingPrice;
    static double currentPrice;
    Stock(String symbol, String name){
        this.name = name;
        this.symbol = symbol;
    }
    double getChangePercent(){
        double res = ((currentPrice / previousClosingPrice) * 100) - 100;
        return (int)(res * 100) / 100.0;
    }
}
