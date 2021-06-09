/*
(Decimal to octal) Write a program that prompts the user to enter a decimal
integer and displays its corresponding octal value. Don’t use Java’s Integer
.toOctalString(int) in this program.
*/
import java.util.Scanner;
public class Exercise05_38{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Decimal to octal: ");
        int num = input.nextInt();
        if(num > 0){
            String result = "";
            while(num != 0){
                result += String.valueOf(num % 8);
                num /= 8;
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
