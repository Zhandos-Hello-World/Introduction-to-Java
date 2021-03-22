package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long a = str.nextLong();
        System.out.print(sumDigits(a));

    }

    public static int rangeNumber(long n){
        int count = 0;
        for(int i = 1; i <= n; i *= 10){
            int x = (int)(n / i);
            if(x < 10){
                break;
            }
            count ++;
        }
        return count;
    }
    public static int sumDigits(long n){
        int range = (int)Math.pow(10, rangeNumber(n));
        int num = 0;
        for(long i = range; i >= 1; i /= 10){
            num += (int)(n / i) % 10;
        }
        return num;
    }
}
