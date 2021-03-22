package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int a = str.nextInt();
        int k = 2;
        while(a != 1){
            if(a % k == 0){
                while(true){
                    if(a % k == 0){
                        System.out.print(k + " ");
                        a /= k;
                    }
                    else{
                        break;
                    }
                }
            }
            k++;
        }
    }
}
