/*
(Conversion from Cº to Fº and Fº to Cº) Write a program that displays the following
two tables side by side:
Celsius Fahrenheit | Fahrenheit Celsius
0       32.000     | 20         −6.667
2       35.600     | 25         −3.889
...
98      208.400    | 265        129.444
100     212.000    | 270        132.222


*/


public class Exercise05_05 {
    public static void main(String[] args){
        System.out.printf("%-8s%-11s%-2c%-11s%-8s", "Celsius", "Fahrenheit", '|', "Fahrenheit", "Celsius\n");
        for(int celsiusI = 0, fahrenheitI = 20; celsiusI <= 100; celsiusI+=2, fahrenheitI += 5){
            System.out.printf("%-8d%10.3f%-3s%-11d%7.3f\n", celsiusI, celsiusI * (9 / 5.0) + 32.0, " |", fahrenheitI, (fahrenheitI - 32) *(5 / 9.0));
        }
    }
}
