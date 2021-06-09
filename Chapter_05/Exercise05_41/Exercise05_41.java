/*
(Occurrence of max numbers) Write a program that reads integers, finds the largest
of them, and counts its occurrences. Assume the input ends with number 0. Suppose you entered 3 5 2 5 5 5 0;
the program finds that the largest is 5 and the occurrence count for 5 is 4.
(Hint: Maintain two variables, max and count. max stores the current max number
and count stores its occurrences. Initially, assign the first number to max and 1 to
count. Compare each subsequent number with max. If the number is greater than
max, assign it to max and reset count to 1. If the number is equal to max, increment
count by 1.)

    Enter numbers: 3 5 2 5 5 5 0
    The largest number is 5
    The occurrence count of the largest number is 4

*/
import java.util.Scanner;
public class Exercise05_41{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int num, max = 0, count = 0;
        do{
            num = input.nextInt();
            count++;
            if(max < num){
                count = 0;
                max = num;
            }
        }
        while(num != 0);
        System.out.println("The largest number is "  + max);
        System.out.println("The occurrence count of the largest number is " + (--count));
    }
}
