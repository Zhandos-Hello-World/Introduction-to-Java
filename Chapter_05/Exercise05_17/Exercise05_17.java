/*
(Display pyramid) Write a program that prompts the user to enter an integer from
1 to 15 and displays a pyramid, as shown in the following sample run:
Enter the number of lines: 7
 7 6 5 4 3 2 1 2 3 4 5 6 7
 6 5 4 3 2 1 2 3 4 5 6
 5 4 3 2 1 2 3 4 5
 4 3 2 1 2 3 4
 3 2 1 2 3
 2 1 2
 1

*/
import java.util.Scanner;
public class Exercise05_17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int num = input.nextInt();

        if(num >= 1 && num <= 15){
            for(int i = num; i >= 1; i--){
                for(int j = i; j > 1; j--){
                    System.out.print(j + " ");
                }
                for(int j = 1; j <= i; j++){
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }
}
