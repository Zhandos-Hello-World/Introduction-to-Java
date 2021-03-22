package com.company;

public class Main {

    public static void main(String[] args) {
        int i = 1, d = 1;

        while(i != 100){
            if(check(d) && isPrime(d)){
                if(i % 10 == 0){
                    System.out.println();
                }
                System.out.print(d + " ");
                i++;
            }
            d++;
        }
    }
    public static boolean check(int num){
        int n = num;
        int r,sum=0;
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        return isPrime(sum) && isPrime(num) && sum != num;
    }
    public static boolean isPrime(int num){
        boolean t = true;
        for(int i = 1; i < num; i++){
            if(i != 1 && num % i == 0){
                t = false;
                break;
            }
        }
        return t;
    }

}
