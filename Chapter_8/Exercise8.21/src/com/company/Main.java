package com.company;
import java.util.Scanner;
import java.util.Locale;
import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.print("Enter the number of cities: ");
        int numberOfCities = str.nextInt();
        double [][]Cities = new double[numberOfCities][2];
        System.out.print("Enter the coordinates of the cities: ");
        for(int i = 0; i < Cities.length; i++){
            for(int j = 0; j < Cities[i].length; j++){
                Cities[i][j] = str.nextDouble();
            }
        }

    }
}
