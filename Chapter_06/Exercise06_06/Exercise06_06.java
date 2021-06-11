/*
(Display patterns) Write a method to display a pattern as follows:
1
1 2
1 2 3
...
n n−1 ... 3 2 1
The method header is

    public static void displayPattern(int n)

*/
import java.util.Scanner;
public class Exercise06_06{

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a number from 1 to 9: ");
        int number = str.nextInt();
        displayPattern(number);
    }
    public static void displayPattern(int n){
        if(n >= 1 && n <= 9){
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= i; j++){
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }
}
