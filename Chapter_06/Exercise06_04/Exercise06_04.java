/*
(Display an integer reversed) Write a method with the following header to display
an integer in reverse order:

    public static void reverse(int number)

For example, reverse(3456) displays 6543. Write a test program that prompts
the user to enter an integer then displays its reversal.


*/
import java.util.Scanner;
public class Exercise06_04{

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = str.nextInt();
        reverse(num);
    }
    public static void reverse(int number){
        String strNumber = "";
        while(number != 0){
            strNumber += String.valueOf(number % 10);
            number /= 10;
        }
        System.out.println("Reverse number is: " + strNumber);
    }

}
