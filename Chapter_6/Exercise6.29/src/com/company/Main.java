package com.company;

public class Main {

    public static void main(String[] args) {
        int d = 2, i = 0;
        while(i < 1000){
            if(isPrime(d) && isPrime(d+2)){
                System.out.println("(" + d + ", " + (int)(d + 2)+ ")");
                i++;
            }
            d++;
        }
    }
    public static boolean isPrime(int number){
            boolean t = true;
            for(int i = 1; i < number; i++){
                if(i != 1 && number % i == 0){
                    t = false;
                    break;
                }
            }
            return t;
        }
    }

