/*
(Financial application: compute CD value) Suppose you put $10,000 into a CD
with an annual percentage yield of 6.15%. After one month, the CD is worth

    10000 + 10000 * 6.15 / 1200 = 10051.25

After two months, the CD is worth
    
    10051.25 + 10051.25 * 6.15 / 1200 = 10102.76

After three months, the CD is worth

    10102.76 + 10102.76 * 6.15 / 1200 = 10154.53
and so on

Write a program that prompts the user to enter an amount (e.g., 10000), the annual
percentage yield (e.g., 6.15), and the number of months (e.g., 18) and displays a
table as shown in the sample run.
    
    Enter the initial deposit amount: 10000
    Enter annual percentage yield: 6.15
    Enter maturity period (number of months): 18

    Month   CD Value
    1       10051.25
    2       10102.76
    ...
    17      10907.90
    18      10963.81

*/
import java.util.Scanner;
public class Exercise05_31{

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter the initial deposit amount: ");
        double amount = str.nextDouble();
        System.out.print("Enter annual percentage yield: ");
        double percent = str.nextDouble() / 1200.0;
        System.out.print("Enter maturity period (number of months): ");
        double month = str.nextDouble();
        System.out.println("\nMonth   CD Value");
        double res = amount;
        double output;
        for(int i = 1; i <= month; i++){
            res = amount + amount * percent;
            System.out.printf("%-5d%11.2f\n", i, res);
            amount = res;
        }
    }
}
