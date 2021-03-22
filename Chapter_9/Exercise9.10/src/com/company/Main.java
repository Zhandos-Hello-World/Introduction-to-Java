package com.company;
import java.util.Scanner;
import  java.util.Locale;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.print("Enter a, b, c: ");
        double a = str.nextDouble();
        double b = str.nextDouble();
        double c = str.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        if(equation.getRoot1() == 0 && equation.getRoot1() == equation.getRoot2()){
            System.out.print("The equation has no roots.");
        }
        else if(equation.getDiscriminant() == 0){
            System.out.printf("The equation has one root %.6f", equation.getRoot1());
        }
        else{
            System.out.printf("The equation has two roots %.6f", equation.getRoot1());
            System.out.printf(" and %.6f", equation.getRoot2());
        }
    }
}
