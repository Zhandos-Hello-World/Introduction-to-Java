/*
(Conversions between mile and kilometer) Write a class that contains the following two methods:
    
    public static double mileToKilometer(double mile)
    public static double kilometerToMile(double kilometer)

The formula for the conversion is:
1 mile = 1.6 kilometers
Write a test program that invokes these methods to display the following tables:

Miles     Kilometers    |    Kilometers     Miles
____________________________________________________
1         1.609         |    20             12.430
2         3.218         |    25             15.538
...
9         14.481        |    60             37.290
10        16.090        |    65             40.398
*/

public class Exercise06_08{

    public static void main(String[] args) {
        System.out.printf("%-10s%-14s%5s%-15s%-7s\n", "Milies", "Kilometers", "|     ", "Kilometers", "Milies");
        System.out.println("____________________________________________________");
        for(int mile = 1, km = 20; mile <= 10; mile++, km += 5){
            System.out.printf("%-10d%-14.3f%5s%-15d%-7.3f\n", mile, mileToKilometer(mile), "|     ", km, kilometerToMile(km));
        }
    }
    public static double mileToKilometer(double mile){
        return mile * 1.609;
    }
    public static double kilometerToMile(double kilometer){
        return kilometer / 1.609;
    }
}
