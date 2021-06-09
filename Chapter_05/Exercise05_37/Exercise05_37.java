/*
(Decimal to binary) Write a program that prompts the user to enter a decimal
integer then displays its corresponding binary value. Don’t use Java’s Integer.toBinaryString(int)
 in this program.

*/
import java.util.Scanner;

public class Exercise05_37{

   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Decimal to movable: ");
        int num = input.nextInt();
        String result = "";
        if(num > 0){
            while(num != 0){
                result += String.valueOf(num % 2);
                num /= 2;
            }
            String resultReverse = "";
            for(int i = result.length() - 1; i >= 0; i--){
                resultReverse += String.valueOf(result.charAt(i));
            }
            System.out.println(Integer.parseInt(resultReverse));
        }
        else if(num == 0){
            System.out.println(0);
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
