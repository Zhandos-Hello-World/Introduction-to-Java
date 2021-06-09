/*
(Demonstrate cancellation errors) A cancellation error occurs when you are
manipulating a very large number with a very small number. The large number
may cancel out the smaller number. For example, the result of 100000000.0 +
0.000000001 is equal to 100000000.0. To avoid cancellation errors and obtain
more accurate results, carefully select the order of computation. For example, in
computing the following series, you will obtain more accurate results by computing from right to left rather than from left to right:

1/n

Write a program that compares the results of the summation of the preceding
series, computing from left to right and from right to left with n = 50000

*/
public class Exercise05_23{

    public static void main(String[] args) {
        double res_1 = 0;
        double res_2 = 0;
        for(double i = 1; i <= 50000; i++){
            res_1 += 1 / i;
        }
        for(double i = 50000; i >= 1; i--){
            res_2 += 1 / i;
        }
        System.out.println("From left to right: " + res_1);
        System.out.print("From right to left: " + res_2);
    }
}
