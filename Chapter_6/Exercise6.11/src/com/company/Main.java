package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sales Amount     Commission");
        System.out.println("---------------------------");
        for(int salesAmount = 10000; salesAmount <= 100000; salesAmount += 5000){
            if(salesAmount == 100000)
                System.out.print(salesAmount + "           ");
            else{
                System.out.print(salesAmount + "          ");
            }
            System.out.println(computeCommission(salesAmount));
        }
    }
    public static double computeCommission(double salesAmount){
        double COMMISSION_SOUGHT = salesAmount;
        double commission,balance;
        salesAmount = 0;
        do{
            balance = commission = 0;
            salesAmount += 0.01;
            if (salesAmount > 10000)
                commission += (balance = salesAmount - 10000) * 0.12;
            if (salesAmount > 5000)
                commission += (balance -= balance - 5000) * 0.10;
            if (salesAmount > 0)
                commission += balance * 0.08;
        }while (commission < COMMISSION_SOUGHT);
        return commission;
    }
}
