/*
(Estimate p) p can be computed using the following summation:

Write a method that returns m(i) for a given i and write a test program that
displays the following table:
*/
public class Exercise06_14{

    public static void main(String[] args) {
        System.out.printf("%-15s%-7s\n", "i", "m(i)");
        System.out.println("______________________");
        for(int i = 1; i <= 901; i += 100){
            System.out.printf("%-14d%7.4f\n", i, calc(i));
        }
    }
    public static double calc(int number){
        double res = 0;
        for(double i = 1; i <= number; i ++){
            double math = (Math.pow(-1, i + 1)) / (2 * i - 1);
            res += math;
        }
        return res * 4;
    }
}