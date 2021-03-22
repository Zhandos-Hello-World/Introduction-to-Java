package com.company;

public class Main {

    public static void main(String[] args) {
        double l = 0;
        String s = "                 ";
        System.out.println("Kilograms     Pounds");
        for(double i = 1.0; i < 199.0; i+=2.0){
            l = i * 2.2;
            String result = String.format("%.1f",l);
            if(i > 9){
                s = "                ";
            }
            if(i > 99){
                s = "               ";
            }
            System.out.println((int)(i) + s + result);
        }
    }
}
