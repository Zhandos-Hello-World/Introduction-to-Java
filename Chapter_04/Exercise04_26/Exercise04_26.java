/*
(Financial application: monetary units) Rewrite Listing 2.10, ComputeChange.java,
to fix the possible loss of accuracy when converting a float value to an int value.
Read the input as a string such as "11.56". Your program should extract the dollar
amount before the decimal point, and the cents after the decimal amount using the
indexOf and substring methods. 

*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);

       System.out.print("Enter an amount in double, for example 11.56: ")

       double amount = input.nextDouble();

       int remainingAmount = (int)(amount * 100);

    }
}
