/*
 (Summation) Write a program to compute the following summation:
*/

public class Exercise05_35{

    public static void main(String[] args) {
        double num = 1;
        double res = 0;
        while(num <= 999){
            res += 1 / (Math.sqrt(num) + Math.sqrt(++num));
        }
        System.out.print("Sum is " + res);
    }
}
