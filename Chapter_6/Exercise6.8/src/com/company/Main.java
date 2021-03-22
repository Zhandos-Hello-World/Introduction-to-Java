package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Celsius          Fahrenheit          |          Fahrenheit          Celsius");
        System.out.println("---------------------------------------------------------------------------");
        for(double i = 40.0, l = 120; i >= 31.0; i--, l -= 10){
            System.out.print(i + "             ");
            System.out.print(celsiusToFahrenheit(i));
            if(celsiusToFahrenheit(i) >= 100)
                System.out.print("                          ");
            else
                System.out.print("                           ");

            System.out.print(l);
            if(l >= 100)
                System.out.print("               ");
            else
                System.out.print("                ");
            System.out.print(fahrenheitToCelsius(l));
            System.out.println();
        }
    }

    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return optimizationResult(fahrenheit);
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (fahrenheit - 32) * (5.0 / 9);
        return optimizationResult(celsius);
    }
    public static double optimizationResult(double res){
        res *= 10;
        res = Math.round(res);
        res /= 10;
        return res;
    }
}
