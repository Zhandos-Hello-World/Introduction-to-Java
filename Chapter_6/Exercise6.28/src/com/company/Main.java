package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("p            2^p-1");
        System.out.println("------------------");
        for(int p = 2; p <= 31; p++){
            if(isPrime(p)){
                System.out.print(p + "            ");
                System.out.print((int)(Math.pow(2, p) - 1));
                System.out.println();
            }
        }
    }
    public static boolean isPrime(int number){
        boolean a = true;
        for(int i = 1; i < number; i++){
            if(i != 1 && number % i == 0){
                a = false;
                break;
            }
        }
        return a;
    }
}
