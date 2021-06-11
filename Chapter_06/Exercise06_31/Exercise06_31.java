/*
(Financial: credit card number validation) Credit card numbers follow certain
patterns. A credit card number must have between 13 and 16 digits. It must start
with
■■ 4 for Visa cards
■■ 5 for Master cards
■■ 37 for American Express cards
■■ 6 for Discover cards
In 1954, Hans Luhn of IBM proposed an algorithm for validating credit card
numbers. The algorithm is useful to determine whether a card number is entered
correctly, or whether a credit card is scanned correctly by a scanner. Credit card
numbers are generated following this validity check, commonly known as the
Luhn check or the Mod 10 check, which can be described as follows (for illustration, consider the card number 4388576018402626):
1. Double every second digit from right to left. If doubling of a digit results in a
two-digit number, add up the two digits to get a single-digit number.
2. Now add all single-digit numbers from Step 1.
4 + 4 + 8 + 2 + 3 + 1 + 7 + 8 = 3 7
3. Add all digits in the odd places from right to left in the card number.
6 + 6 + 0 + 8 + 0 + 7 + 8 + 3 = 3 8
4. Sum the results from Step 2 and Step 3.
3 7 + 3 8 = 7 5
5. If the result from Step 4 is divisible by 10, the card number is valid; otherwise,
it is invalid. For example, the number 4388576018402626 is invalid, but the
number 4388576018410707 is valid.
Write a program that prompts the user to enter a credit card number as a long
integer. Display whether the number is valid or invalid. Design your program to
use the following methods:

    public static boolean isValid(long number)

    public static int sumOfDoubleEvenPlace(long number)

    public static int getDigit(int number)

    public static int sumOfOddPlace(long number)

    public static boolean prefixMatched(long number, int d)

    public static int getSize(long d)

    public static long getPrefix(long number, int k)


Here are sample runs of the program: (You may also implement this program by
reading the input as a string and processing the string to validate the credit card.)

    Enter a credit card number as a long integer:
     4388576018410707
    4388576018410707 is valid


    Enter a credit card number as a long integer:
     4388576018402626
    4388576018402626 is invalid
*/
import java.util.Scanner;
public class Exercise06_31{

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a credit card number as a long integer: ");
        long creditNumber = str.nextLong();
        if(isValid(creditNumber)){
            System.out.print(creditNumber + " is valid");
        }
        else{
            System.out.print(creditNumber + " is invalid");
        }
    }
    public static boolean isValid(long number){
        int num1 = sumOfDoubleEvenPlace(number);
        int num2 = sumOfOddPlace(number);
        int sum = num1 + num2;
        if(sum % 10 == 0 && getSize(number) >= 13 && getSize(number) <= 16 &&
            (prefixMatched(number, 4) || prefixMatched(number, 5) ||
                prefixMatched(number, 37) || prefixMatched(number, 6))){
            return true;
        }
        else{
            return false;
        }
   }
    public static boolean prefixMatched(long number, int d){
        return (int)getPrefix(number, d) == d;

    }
    public static long getPrefix(long number, int k){
        long check = number / (long)Math.pow(10, getSize(number) - 2);
        return ((check == 37) ? check : check / 10);
    }

    //working method
    public static int sumOfDoubleEvenPlace(long number){
        long range = (long)(Math.pow(10, getSize(number)));
        long res = 0, sum, temp;
        for(long l = 100, x = 10; l <= range; l *= 100, x *= 100){
            temp = (int)((number % l) / x) * 2;
            sum = getDigit((int)temp);
            res += sum;
        }
        return (int)res;
    }
    // working method
    public static int getDigit(int number){
        if(number >= 10){
            int num1 = number / 10;
            int num2 = number % 10;
            return num1 + num2;
        }
        else{
            return number;
        }
    }
    // working method
    public static int sumOfOddPlace(long number){
        long range = (long) Math.pow(10, getSize(number));
        long findNum, sum = 0;
        for(long l = 10, x = 1; l <= range; l *= 100, x *= 100){
            findNum = (number % l) / x;
            sum += findNum;
        }
        return (int)sum;
      }

    // working method
    public static int getSize(long d){
        int count = 0;
        while (d != 0) {
            count++;
            d /= 10;
        }
        return count;
    }
}
