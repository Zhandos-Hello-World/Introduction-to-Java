/*
(Compute e) You can approximate e using the following series:

Write a program that displays the e value for i = 10000, 20000, ..., and
100000. (Hint: Because i! = i * (i - 1) * c * 2 * 1, then



Initialize e and item to be 1 and keep adding a new item to e. The new item is
the previous item divided by i for i = 2, 3, 4, . . . .)

*/

public class Exercise05_26{

    public static void main(String[] args) {
        for(double i = 10000.0; i <= 100000.0; i+=10000.0){
            double e = 1;
            int divisor = 1;
            for(double j = 1; j <= i; j++){
                divisor *= j;
                e += 1 / (double)(divisor);
            }
            System.out.println("For " + i + " is " + e);
        }
    }
}
