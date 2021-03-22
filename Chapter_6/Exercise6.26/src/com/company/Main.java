package com.company;

public class Main {

    public static void main(String[] args) {
        int i = 1;
        int d = 1;
        while(i != 100){
            if(palindrome(d) && primeNumber(d)){
                if(i % 10 == 0)
                    System.out.println();
                System.out.print(d + " ");
                i++;
            }
                d++;
        }
    }
    public static boolean palindrome(long number){
        long sum = 0, r, temp = number;
        while(number > 0){
            r = number % 10;
            sum = (sum * 10) + r;
            number /= 10;
        }
        return temp == sum;
    }
    public static boolean primeNumber(long number){
        boolean s = true;
        for(int i = 1; i < number; i++){
            if (number % i == 0 && i != 1) {
                s = false;
                break;
            }
        }
        return s;
    }
}
