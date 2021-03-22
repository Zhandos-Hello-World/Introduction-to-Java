package com.company;

public class Main {

    public static void main(String[] args) {
        int i = 1;
        while (true){
            if(Math.pow(i, 2) > 12000){
                System.out.print(i);
                break;
            }
            i++;
        }

    }
}
