package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;
public class Main {

    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.print("Enter the number of the points: ");
        int size = str.nextInt();
        System.out.print("Enter the coordinates of the points: ");
        for(int i = 0; i < size; i++){
            double num = str.nextDouble();
            list.add(num);
        }
        System.out.print("The total area is " + getArea(list));

    }
    public static double getArea(ArrayList<Double> list){
        double num1 = 0.0;
        double num2 = 0.0;
        for(int i = 0, j = 3; j <= list.size(); i+=2, j+=2){
            if(j == list.size()){
                if(list.get(i) * list.get(1) < 0){
                    num1 -= list.get(i) * list.get(1);
                }
                else{
                    num1 += list.get(i) * list.get(1);
                }
            }
            else{
                if((list.get(i) * list.get(j)) < 0){
                    num1 -= (list.get(i) * list.get(j));
                }
                else{
                    num1 += (list.get(i) * list.get(j));
                }
            }
        }
        for(int i = 2, j = 1; j < list.size(); i+=2, j+=2){
            if(j == list.size() - 1){
                if(list.get(j) * list.get(0) < 0){
                    num2 -= list.get(j) * list.get(0);
                }
                else{
                    num2 += list.get(j) * list.get(0);
                }
            }
            else{
                if(list.get(i) * list.get(j) < 0){
                    num2 -= list.get(i) * list.get(j);
                }
                else{
                    num2 += (list.get(i) * list.get(j));
                }
            }
        }
        return (Math.abs(num1) + Math.abs(num2)) / 2.0;


    }
}
