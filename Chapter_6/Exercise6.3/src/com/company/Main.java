package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = str.nextInt();
        System.out.println("Reverse number is: " + reverse(num));
        if(isPalindrome(num)){
            System.out.print("This number is palindrome");
        }
        else{
            System.out.println("This number is not palindrome");
        }
    }
    public static int reverse(int number){
        int range = (int)Math.pow(10, rangeNum(number));
        int x = range;
        int sum;
        int res = 0;
        for(int i = 1; i <= range; i *= 10){
            sum = (number / i) % 10;
            res += (sum * x);
            x /= 10;
        }
        return res;
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
    public static boolean isPalindrome(int n){
        int r, sum = 0, temp;
        temp = n;
        while(n > 0){
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if(temp == sum){
            return true;
        }
        else{
            return false;
        }
    }



}
