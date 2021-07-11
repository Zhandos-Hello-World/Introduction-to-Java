/*
(Game: lottery) Revise Programming Exercise 3.15 to add an additional $2,000
award if two digits from the user input are in the lottery number. (Hint: Sort
the three digits in the lottery number and three digits in the user input into two
lists, and use the Collection’s containsAll method to check whether the
two digits in the user input are in the lottery number.)
*/

import java.util.Scanner;
public class Exercise20_08{
    public static void main(String[] args) {
        int lottery = (int)(Math.random() * 1000);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (three digits): ");
        int guess = input.nextInt();
        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;

        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;
        System.out.println("The lottery number is " + lottery);

        if (guess == lottery)
            System.out.println("Exact match: you win $10,000");
        else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2)
            System.out.println("Match all digits: you win $3,000");
        else if(guessDigit1 == lotteryDigit1
                || guessDigit1 == lotteryDigit2
                || guessDigit2 == lotteryDigit1
                || guessDigit2 == lotteryDigit2)
            System.out.println("Match one digit: you win $1,000");
        else
            System.out.println("Sorry, no match");

    }
}