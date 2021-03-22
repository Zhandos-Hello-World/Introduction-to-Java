package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Locale;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        ArrayList<Double> list = new ArrayList<>();
        System.out.print("Enter 5 numbers: ");
        for(int i = 0; i < 5; i++){
            double number = str.nextDouble();
            list.add(number);
        }
        System.out.print("Sum is: " + sum(list));


    }
    public static double sum(ArrayList<Double> list){
        double sum = 0.0;
        for(int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }
        return sum;
    }
}
