/*
(Financial application: find the sales amount) You have just started a sales job in a
department store. Your pay consists of a base salary and a commission. The base salary
is $5,000. The scheme shown below is used to determine the commission rate.

Note that this is a graduated rate. The rate for the first $5,000 is at 6%, the next
$5000 is at 8%, and the rest is at 10%. If your sales amounts to $25,000, the commission is 
5,000 * 6% + 5,000 * 8% + 15,000 * 10% = 2,200. Your goal is to earn $30,000 a year. 
Write a program to find the minimum sales you have to generate in order to make $30,000.

*/
public class Exercise05_39 {
    public static void main(String[] args) {
        final double COMMISSION_SOUGHT = 30000;
        double salesAmount, commission, balance;
        salesAmount = 0;
        do{
            balance = commission = 0;
            salesAmount += 0.01;
            if (salesAmount > 10000)
                commission += (balance = salesAmount - 10000) * 0.10;
            if (salesAmount > 5000)
                commission += (balance -= balance - 5000) * 0.08;
            if (salesAmount > 0)
                commission += balance * 0.06;
        }while (commission < COMMISSION_SOUGHT);
        System.out.printf("Minimum sales to earn $30,000: $%.0f\n", salesAmount);
    }
}