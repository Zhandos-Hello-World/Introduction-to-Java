package com.company;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter an integer m: ");
        int number = str.nextInt();
        System.out.println("The smallest number n for m * n to be a perfect square is " +
                findBigOddDivisor(number));
        System.out.print("m * n is " + findBigOddDivisor(number) * number);
    }
    public static int findBigOddDivisor(int n){
        ArrayList<Integer> list = new ArrayList<>();
        while(n != 1){
            if(n == 0){
                break;
            }
            for(int i = 2; i <= n; i++){
                if(n % i == 0){
                    n /= i;
                    list.add(i);
                    i -= 1;
                }
            }
        }
        int max = list.get(0);
        for(int value : list){
            if(max < value){
                max = value;
            }
        }
        return max;
    }
}
