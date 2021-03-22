package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter an integer, the input ends if it is 0: ");
        int q = 0;
        int w = 0;
        double sum = 0;
        while(true){
            double a = str.nextDouble();
            if(a == 0.0){
                break;
            }
            else if(a < 0.0){
                q++;
            }
            else{
                w++;
            }
            sum += a;
        }
        if(q == 0 && w == 0){
            System.out.print("No numbers are entered except 0");
        }
        else{
            System.out.println("The number of positives is " + w);
            System.out.println("The number of negative is " + q);
            System.out.println("The total is " + sum);
            System.out.print("The average is " + (double)(sum / (q + w)));
        }

    }
}
