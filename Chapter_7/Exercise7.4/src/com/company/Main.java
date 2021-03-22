package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int high = 0;
        int medium = 0;
        while (true){
            int a = str.nextInt();
            if(a >= 0 && a <= 100){
                if(a >= 50){
                    high++;
                }
                else{
                    medium++;
                }
            }
            else if(a < 0){
                break;
            }
        }
        System.out.println("High score is: " + high);
        System.out.print("Medium score is: " + medium);
    }
}
