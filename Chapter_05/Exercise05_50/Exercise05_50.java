/*
Print multiplication table) Write a program that uses for, while, and do-while loop
statements to display the multiplication table. Here is a sample run:
*/
import java.util.Scanner;
public class Exercise05_50{

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = str.nextLine();
        if(a.equals("Welcome to Java")){
            for(int i = 1; i <= 9; i++){
                for(int j = 1; j <= 9; j++){
                    System.out.printf("%-9s", j + "*" + i + "= " + (i * j) + "  ");
                }
                System.out.println();
            }
        }
    }
}
