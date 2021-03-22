package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Miles     Kilometers | Kilometers     Miles");
        String q = "         ";
        String w = "      ";
        String e = "      ";
        for(int i = 1, d = 20; i <= 10; i++, d+=5){
            double l = i * 1.609;
            double l1 = d / 2.2;
            if(l >= 10.0 && i < 10){
                e = "     ";
            }
            if(l >= 10.0 && i >=10){
                q = "        ";
            }
            String s1 = String.format("%.3f", l);
            String s2 = String.format("%.3f", l1);
            System.out.println(i + q + s1 + e + "| " + d + "             " + s2);
        }
    }
}
