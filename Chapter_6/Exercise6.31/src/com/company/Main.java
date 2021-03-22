package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a credit card number as a long integer: ");
        long creditNumber = str.nextLong();
        if(isValid(creditNumber)){
            System.out.print(creditNumber + " is valid");
        }
        else{
            System.out.print(creditNumber + " is invalid");
        }
    }
    public static boolean isValid(long number){
        int num1 = sumOfDoubleEvenPlace(number);
        int num2 = sumOfOddPlace(number);
        int sum = num1 + num2;
        if(sum % 10 == 0 && getSize(number) >= 13 && getSize(number) <= 16 &&
            (prefixMatched(number, 4) || prefixMatched(number, 5) ||
                prefixMatched(number, 37) || prefixMatched(number, 6))){
            return true;
        }
        else{
            return false;
        }
   }
    public static boolean prefixMatched(long number, int d){
        if((int)getPrefix(number, d) == d){
            return true;
        }
        else{
            return false;
        }
    }
    public static long getPrefix(long number, int k){
        long check = number / (long)Math.pow(10, getSize(number) - 2);
        if(check == 37){
            return check;
        }
        else{
            check /= 10;
            return check;
        }

    }

    //working method
    public static int sumOfDoubleEvenPlace(long number){
        long range = (long)(Math.pow(10, getSize(number)));
        long res = 0, sum, temp;
        for(long l = 100, x = 10; l <= range; l *= 100, x *= 100){
            temp = (int)((number % l) / x) * 2;
            sum = getDigit((int)temp);
            res += sum;
        }
        return (int)res;
    }
    // working method
    public static int getDigit(int number){
        if(number >= 10){
            int num1 = number / 10;
            int num2 = number % 10;
            return num1 + num2;
        }
        else{
            return number;
        }
    }
    // working method
    public static int sumOfOddPlace(long number){
        long range = (long) Math.pow(10, getSize(number));
        long findNum, sum = 0;
        for(long l = 10, x = 1; l <= range; l *= 100, x *= 100){
            findNum = (number % l) / x;
            sum += findNum;
        }
        return (int)sum;
      }

    // working method
    public static int getSize(long d){
        long number = d;
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}
