/*
(Financial: compare costs) Suppose you shop for rice in two different packages.
You would like to write a program to compare the cost. The program prompts the
user to enter the weight and price of each package and displays the one with the
better price. Here is a sample run:

	Enter weight and price for package 1: 50 24.59
	Enter weight and price for package 2: 25 11.99
	Package 2 has a better price.

	Enter weight and price for package 1: 50 25
	Enter weight and price for package 2: 25 12.5
	Two packages have the same price.

*/
import java.util.Scanner;


public class Exercise03_33{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight and price for package 1: ");
        double weight = input.nextDouble();
        double num = input.nextDouble();
        System.out.print("Enter weight and price for package 2: ");
        double weight1 = input.nextDouble();
        double num1 = input.nextDouble();
        if(num > num1){
            double res = (weight / weight1) * num1;
            if(res < num){
                System.out.print("Package 2 has a better price.");
            }
            else if(res == num){
                System.out.println("Two packages have the same price.");
            }
            else{
                System.out.print("Package 1 has a better price. ");
            }
        }
        else{
            double res = (weight1 / weight) * num;
            if(res < num){
                System.out.print("Package 2 has a better price.");
            }
            else if(res == num){
                System.out.println("Two packages have the same price.");
            }
            else{
                System.out.print("Package 1 has a better price.");
            }
        }
    }
}
