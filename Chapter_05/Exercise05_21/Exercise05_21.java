/*
(Financial application: compare loans with various interest rates) Write a program
that lets the user enter the loan amount and loan period in number of years and
displays the monthly and total payments for each interest rate starting from 5% to
10%, with an increment of 1/4. Here is a sample run:

Loan Amount: 10000
Number of Years: 5
Interest Rate      Monthly Payment      Total Payment
5.000%                 188.71             11322.74
5.250%                 189.86             11391.59
5.500%                 191.01             11460.70
...
9.750%                 211.24             12674.55
10.000%                212.47             12748.23
*/
import java.util.Scanner;
public class Exercise05_21{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        int numberOfYears = input.nextInt();

        System.out.printf("%-19s%-21s%-13s\n","Interest Rate",  "Monthly Payment", "Total Payment");
        for (double i = 5.0; i <= 8; i += 0.125) {
            double monthlyInterestRate = i / 1200;
            double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
            System.out.printf("%-23.3f%-19.2f%-8.2f\n", i, monthlyPayment, (monthlyPayment * 12) * numberOfYears);
        }
    }
}
