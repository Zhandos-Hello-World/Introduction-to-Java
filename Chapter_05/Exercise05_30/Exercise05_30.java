/*
(Financial application: compound value) Suppose you save $100 each month
in a savings account with annual interest rate 3.75%. The monthly interest rate
is 0.0375 / 12 = 0.003125. After the first month, the value in the account
becomes

100 * (1 + 0.003125) = 100.3125

After the second month, the value in the account becomes
    100 + 100.3125) * (1 + 0.003125) = 200.938
After the third month, the value in the account becomes
    (100 + 200.938) * (1 + 0.003125) = 301.878
and so on.
Write a program that prompts the user to enter an amount (e.g., 100), the annual
interest rate (e.g., 3.75), and the number of months (e.g., 6) and displays the
amount in the savings account after the given month.

*/
import java.util.Scanner;
public class Exercise05_30{

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter an amount: (e.g., 100): ");
        double amount = str.nextDouble();
        double tempAmount = amount;
        System.out.print("Enter the annual interest rate (e.g., 3.75): ");
        double annualInterestRate = str.nextDouble() / 1200.0;
        System.out.print("Enter number of months: (e.g., 6): ");
        int month = str.nextInt();
        
        amount = tempAmount * (1 + annualInterestRate);
        for(int i = 0; i < month - 1; i++){
            amount = (tempAmount + amount) * (1 + annualInterestRate);
        }
        System.out.printf("Amount after the " + month + " month the value in the account becomes %1.3f", amount);

    }
}
