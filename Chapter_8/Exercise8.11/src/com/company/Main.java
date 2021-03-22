package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String a = "";
        System.out.print("Enter a number between 0 and 511: ");
        int w = str.nextInt();
        if(w >= 0 && w <= 511){
            for(int i = w; i >= 1; i /= 2){
                a = a.concat(String.valueOf(i % 2));
            }
        }
        int x = 0;
        for(int i = 0; i < 9 - a.length(); i++){
            if(x % 3 == 0 && x != 0){
                System.out.println();
            }
            System.out.print("H ");
            x++;
        }
        for(int i = a.length() - 1; i >= 0; i--){
            if(x % 3 == 0){
                System.out.println();
            }
            if(a.charAt(i) == '0'){
                System.out.print("H ");
            }
            else if(a.charAt(i) == '1'){
                System.out.print("T ");
            }
            x++;

        }
    }
}
