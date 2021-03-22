package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = str.nextInt();
        System.out.print("Reverse number is: ");
        reverse(num);
    }
    public static void reverse(int number){
        int range = (int)Math.pow(10, rangeNum(number));
        int x = range, sum, res = 0;
        for(int i = 1; i <= range; i *= 10){
            sum = (number / i) % 10;
            res += (sum * x);
            x /= 10;
        }
        System.out.print(res);
    }
    public static int rangeNum(int number){
        int count = 0;
        int x;
        for(int i = 1; i < number; i *= 10){
            x = number / i;
            if(x < 10){
                break;
            }
            count ++;
        }
        return count;
    }
}
