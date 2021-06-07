/*
(Financial application: payroll) Write a program that reads the following information and prints a payroll statement:
Employee’s name (e.g., Smith)
Number of hours worked in a week (e.g., 10)
Hourly pay rate (e.g., 9.75)

Federal tax withholding rate (e.g., 20%)
State tax withholding rate (e.g., 9%)
A sample run is as follows:


    Enter employee’s name: Smith
    Enter number of hours worked in a week: 10
    Enter hourly pay rate: 9.75
    Enter federal tax withholding rate: 0.20
    Enter state tax withholding rate: 0.09
    Employee Name: Smith
    Hours Worked: 10.0
    Pay Rate: $9.75
    Gross Pay: $97.5
    Deductions:
    Federal Withholding (20.0%): $19.5
    State Withholding (9.0%): $8.77
    Total Deduction: $28.27
    Net Pay: $69.22

*/
import java.util.Scanner;
public class Exercise04_23{

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String name = str.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        double hoursWorked = str.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double pay = str.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double rateF = str.nextDouble() * 10;
        System.out.print("Enter state tax withholding rate: ");
        double rateS = str.nextDouble() * 10;
        System.out.println();
        System.out.println("Employee Name: " + name);
        System.out.println("Hours worked: " + hoursWorked);
        System.out.println("Pay rate: $" + pay);
        System.out.println("Gross pay: $" + pay * hoursWorked);
        System.out.println("Deductions:");
        System.out.println("  Federal Withholding (20.0%): $" + (float)(pay * rateF));
        System.out.println("  State Withholding (9.0%): $" + (float)(pay * rateS));
        System.out.println("  Total Deduction: $" + (float)((pay * rateF) + (pay * rateS)));
        System.out.print("Net Pay: $" + (float)((pay * hoursWorked) - ((pay * rateF) + (pay * rateS))));
    }
}
