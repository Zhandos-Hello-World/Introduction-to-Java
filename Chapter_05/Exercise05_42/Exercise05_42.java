/*
(Financial application: find the sales amount) Rewrite Programming Exercise 5.39
as follows:
■■ Use a while loop instead of a do-while loop.
■■ Let the user enter COMMISSION_SOUGHT instead of fixing it as a constant.
*/
import java.util.Scanner;
public class Exercise05_42{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double commission = 0.0, balance, salesAmount = 0.01;
        System.out.print("Enter the commission sought: ");
        double commissionSought = input.nextDouble();
        while(salesAmount < commissionSought){
            balance = commission = 0.0;
            if (salesAmount >= 10000.01)
                commission += (balance = salesAmount - 10000) * 0.12;
            if (salesAmount >= 5000.01)
                commission += (balance -= balance - 5000) * 0.10;
            if (salesAmount >= 0.01)
                commission += balance * 0.08;
            salesAmount+=0.01;
        }
        System.out.printf(
                "Minimum sales to earn $%.0f: $%.0f\n", commissionSought, salesAmount);
    }
}