/*
(Conversions between pounds and kilograms) Write a class that contains the
following two methods:

    public static double poundToKilogram(double pound)
    public static double kilogramToPound(double kilogram)

The formula for the conversion is:

pound = 0.453 * kilogram
kilogram = 2.204 * pound

Write a test program that invokes these methods to display the following tables:

Kilograms    Pounds    |    Pounds    Kilograms
1            2.2       |    20        9.09
3            6.6       |    25        11.36
...
197          433.4     |    510       231.82
199          437.8     |    515       234.09
*/


public class Exercise06_09{

    public static void main(String[] args) {
        System.out.printf("%-13s%-10s%-5c%-10s%-9s\n", "Kilograms", "Pounds", '|', "Pounds", "Kilograms");        
        for(int km = 1, pounds = 20; km < 200; km++, pounds+=5){
            System.out.printf("%-13d%-10.1f%-5c%-10d%-9.2f\n", km, kilogramToPound(km), '|', pounds, poundToKilogram(pounds));
        }
    }
    public static double poundToKilogram(double pound){
        return pound * 0.453;
    }
    public static double kilogramToPound(double kilogram){
        return kilogram * 2.2;
    }
}
