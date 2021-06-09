/*
Sum a series) Write a program to sum the following series:
*/

public class Exercise05_24 {

    public static void main(String[] args) {
        double res = 0;
        for(double i = 1.0; i <= 97.0; i += 2.0){
            res += i / (i + 2.0);
        }
        System.out.print(res);
    }
}
