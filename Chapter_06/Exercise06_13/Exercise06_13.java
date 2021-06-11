/*
(Sum series) Write a method to compute the following series:

Write a test program that displays the following table:
I        m(i)
1        0.3333
2        0.8333
...
19       14.7093
20       15.6184
*/
public class Exercise06_13 {

    public static void main(String[] args) {
        System.out.printf("%-10c%-8s\n", 'I', "m(i)");
        System.out.println("_________________");
        double sum = 0;
        for(int i = 1; i <= 20; i++){
           System.out.printf("%-9d%8.4f\n", i, calc(i) + sum);
           sum += calc(i);
        }
    }
    public static double calc(int number){
        return (double)number / (double) (number + 2);
    }
}
