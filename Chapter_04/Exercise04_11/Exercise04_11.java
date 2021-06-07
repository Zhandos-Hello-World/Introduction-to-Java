/*
(Binary to decimal) Write a program that prompts the user to enter binary digits
and displays its corresponding decimal value. Here are some sample runs:

    Enter binary digits (0000 to 1111): 0111
    The decimal value is 7

    Enter binary digits (0000 to 1111): 1001
    The decimal value is 9

    Enter binary digits (0000 to 1111): 1100
    The decimal value is 12

*/
import java.util.Scanner;
public class Exercise04_11 {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a decimal value (0 to 15): ");
        byte a = str.nextByte();
        if(a >= 0 && a <= 15){
            if(a <= 9) {
                System.out.print("The hex value is " + a);
            }
            else{
                String s = "";
                switch(a){
                    case 10:s = "A";break;
                    case 11:s = "B";break;
                    case 12:s = "C";break;
                    case 13:s = "D";break;
                    case 14:s = "E";break;
                    case 15:s = "F";break;
                }
                System.out.print("The hex value is " + s);
            }
        }
        else{
            System.out.print(a + " is an invalid input");
        }

    }
}
