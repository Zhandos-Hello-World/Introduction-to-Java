/*
(Perfect number) A positive integer is called a perfect number if it is equal to the
sum of all of its positive divisors, excluding itself. For example, 6 is the first perfect
number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2 + 1. There
are four perfect numbers 6 10,000. Write a program to find all these four numbers.
*/
import java.util.Scanner;
public class Exercise05_33{

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = str.nextInt();
        int sum = 0;
        if(num >= 2 && num <= 10000){
            for(int i = 1; i < num; i++){
                if(num % i == 0){
                    sum += i;
                }
            }
        System.out.print("This is" + ((sum != num) ? " not": "") + " perfect number");
        }
    }
}
