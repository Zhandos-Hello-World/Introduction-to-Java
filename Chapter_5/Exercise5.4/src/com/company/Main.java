package com.company;
public class Main {

    public static void main(String[] args) {
        System.out.println("Miles     Kilometers");
        String s = "              ";
        for(int i = 1; i <= 10; i++){
            double l = i * 1.609;
            String res = String.format("%.3f", l);
            if(i > 9){
                s = "             ";
            }
            System.out.println(i + s + res);
        }
    }
}
