package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int max = 0;
        int c = 0;
        while(true){
            int number = str.nextInt();
            if(number == 0){
                break;
            }
            else{
                if(max < number){
                    max = number;
                    c = 0;
                }
                else if(max == number){
                    c++;
                }
            }
        }
        c += 1;
        System.out.println("The largest number is "  + max);
        System.out.println("The occurrence count of the largest number is " + c);
    }
}
