/*
(Compute p) You can approximate p by using the following series:
Write a program that displays the p value for i = 10000, 20000, …, and
100000.

*/

public class Exercise05_25 {

    public static void main(String[] args) {
        for(int i = 10000; i <= 100000; i+=10000){
            double pi = 0;
            for(int j = 1; j <= i; j++){
                pi += 4 * (Math.pow(-1, j + 1)) / (2 * j - 1);
            }
            System.out.println("i = " + i + ", pi = " + pi);
        }
    }
}
