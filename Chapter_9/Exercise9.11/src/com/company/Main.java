package com.company;
import java.util.Scanner;
import java.util.Locale;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = str.nextDouble();
        double b = str.nextDouble();
        double c = str.nextDouble();
        double d = str.nextDouble();
        double e = str.nextDouble();
        double f = str.nextDouble();
        LinearEquation equation1 = new LinearEquation(a, b, c, d, e,f);
        if(equation1.isSolvable()){
            System.out.print("x is " + equation1.getX() + " and y is " + equation1.getY());
        }
        else{
            System.out.print("The equation has no solution ");
        }
    }
}
