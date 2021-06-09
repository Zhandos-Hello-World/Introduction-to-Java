/*
(Financial application: loan amortization schedule) The monthly payment for a given
loan pays the principal and the interest. The monthly interest is computed by 
multiplying the monthly interest rate and the balance (the remaining principal). The principal
paid for the month is therefore the monthly payment minus the monthly interest.
Write a program that lets the user enter the loan amount, number of years, and interest
rate then displays the amortization schedule for the loan. Here is a sample run:


    Loan Amount: 10000
    Number of Years: 1
    Annual Interest Rate: 7

    Monthly Payment: 865.26
    Total Payment: 10383.21

    Payment#    Interest    Principal   Balance
    1           58.33       806.93      9193.07
    2           53.62       811.64      8381.43
    ...
    11          10.00       855.26       860.27
    12           5.01       860.25         0.01




The balance after the last payment may not be zero. If so, the last payment should be
the normal monthly payment plus the final balance.
Hint: Write a loop to display the table. Since the monthly payment is the same for each
month, it should be computed before the loop. The balance is initially the loan amount.
For each iteration in the loop, compute the interest and principal, and update the balance.
The loop may look as follows:

for (i = 1; i <= numberOfYears * 12; i++) {
 interest = monthlyInterestRate * balance;
 principal = monthlyPayment – interest;
 balance = balance – principal;
 System.out.println(i + "\t\t" + interest
 + "\t\t" + principal + "\t\t" + balance);
}


*/
import java.util.Scanner;
public class Exercise05_22{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double balance = input.nextDouble();
        System.out.print("Number of Years: ");
        double numberOfYears = input.nextDouble();
        System.out.print("Annual Interest Rate: ");
        double monthlyInterestRate = input.nextDouble() / 1200.0;

        double monthlyPayment = balance * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;
        System.out.println();


        System.out.println("Monthly Payment: " + (int)(monthlyPayment * 100) / 100.0);
        System.out.println("Total Payment: " + (int)(totalPayment * 100) / 100.0 + "\n");


        System.out.printf("%-13s%-13s%-14s%7s\n", "Payment#", "Interest", "Principal", "Balance");

        for (int i = 1; i <= numberOfYears * 12; i++) {
            double interest = monthlyInterestRate * balance;
            double principal = monthlyPayment - interest;
            balance -= principal;
            System.out.printf("%-13d%-13.2f%-13.2f%8.2f\n", i, interest, principal, balance);

        }
    }
}