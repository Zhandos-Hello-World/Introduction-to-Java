package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        double weight = str.nextInt();
        if(weight > 0){
            if(weight > 0 && weight <= 1){
                System.out.print("3.5 dollars");
            }
            else if(weight > 1 && weight <=3){
                System.out.print("5.5 dollars");
            }
            else if(weight > 3 && weight <= 10){
                System.out.print("8.5 dollars");
            }
            else if(weight > 10 && weight <= 20){
                System.out.print("10.5 dollars");
            }
            else if(weight > 20 && weight < 50){
                System.out.print("35.5 dollars");
            }
            else{
                System.out.print("the package cannot be shipped");
            }
        }
        else{
            System.out.print("Error");
        }

    }
}
