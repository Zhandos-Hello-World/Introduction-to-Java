/*
(Check SSN) Write a program that prompts the user to enter a Social Security
number in the format DDD-DD-DDDD, where D is a digit. Your program should
check whether the input is valid. Here are sample runs:

    Enter a SSN: 232−23−5435
    232−23−5435 is a valid social security number

    Enter a SSN: 23−23−5435
    23−23−5435 is an invalid social security number
*/
import java.util.Scanner;
import static java.lang.Character.isDigit;
public class Exercise04_21{

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String a = str.nextLine();
        String d1 = a.substring(0, 3);
        String d2 = a.substring(4, 6);
        String d3 = a.substring(7);
        if(a.charAt(3) == '-' && a.charAt(6) == '-'){
            if(!isDigit(Integer.parseInt(d1)) && !isDigit(Integer.parseInt(d2))&&
                    !isDigit(Integer.parseInt(d3))){
                System.out.print(a + " is a valid social security number");
            }
            else{
                System.out.print(a + " is an invalid social security number");
            }
        }
        else{
            System.out.print(a + " is an invalid social security number");
        }
    }

}
