/*
(Conversion from Cº to Fº) Write a program that displays the following table (note
that farenheit = celsius * 9/5 + 32):
Celsius Fahrenheit
0 32.0
2 35.6
...
98 208.4
100 212.0 


*/
public class Exercise05_03{
    public static void main(String[] args) {
        System.out.printf("%-11s%-11s\n", "Celsius", "Fahrenheit");
        for(int i = 0; i <= 100; i+=2){
            System.out.printf("%-11d%10.1f\n", i, i * (9 / 5.0) + 32.0);
        }
    }
}
