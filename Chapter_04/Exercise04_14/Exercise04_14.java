/*
(Convert letter grade to number) Write a program that prompts the user to enter a
letter grade A, B, C, D, or F and displays its corresponding numeric value 4, 3, 2,
1, or 0. For other input, display invalid grade. Here is a sample run:

    Enter a letter grade: B
    The numeric value for grade B is 3

    Enter a letter grade: T
    T is an invalid grade
*/
import java.util.Scanner;
public class Exercise04_14 {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        char a = str.nextLine().toUpperCase().charAt(0);
        if(a >= 'A' && a <= 'F'){
            int w = 0;
            switch (a){
                case 'A':w = 4;break;
                case 'B':w = 3;break;
                case 'C':w = 2;break;
                case 'D':w = 1;break;
                case 'F':w = 0;break;
            }
            System.out.print("The numeric value for grade " + a +" is " + w);

        }
        else{
            System.out.print(a  + " is an invalid grade");
        }

    }
}
