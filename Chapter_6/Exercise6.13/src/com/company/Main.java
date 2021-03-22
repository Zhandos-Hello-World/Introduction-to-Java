package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("i          m(i)");
        System.out.println("------------------------------");
        for(int i = 1; i <= 20; i++){
            if(i >= 10)
                System.out.print(i + "         ");
            else
                System.out.print(i + "          ");
            System.out.println(calc(i));
        }

    }
    public static double calc(int number){
        return (double)number / (double) (number + 1);
    }
}
