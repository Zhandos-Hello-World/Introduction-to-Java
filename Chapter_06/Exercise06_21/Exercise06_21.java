/*
(Phone keypads)  The international standard letter/number mapping for telephones 
is given in Programming Exercise 4.15. Write a method that returns a number,
given an uppercase letter, as follows:
    
    public static int getNumber(char uppercaseLetter)

Write a test program that prompts the user to enter a phone number as a string. The input
number may contain letters. The program translates a letter (uppercase or lowercase)
to a digit and leaves all other characters intact. Here are sample runs of the program:

    Enter a string: 1-800-Flowers
    1-800-3569377

    Enter a string: 1800flowers
    18003569377
*/
import java.util.Scanner;
public class Exercise06_21{

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = str.nextLine().toUpperCase();
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) >= 'A' && a.charAt(i) <= 'Z'){
                System.out.print(getNumber(a.charAt(i)));
            }
            else{
                System.out.print(a.charAt(i));
            }
        }
    }
    public static int getNumber(char uppercaseLetter){
        int q;
        if(uppercaseLetter <= 'C')q = 2;
        else if(uppercaseLetter <= 'F')q = 3;
        else if(uppercaseLetter <= 'I')q = 4;
        else if(uppercaseLetter <= 'L')q = 5;
        else if(uppercaseLetter <= 'O')q = 6;
        else if(uppercaseLetter <= 'S')q = 7;
        else if(uppercaseLetter <= 'V')q = 8;
        else q = 9;
        return q;
    }
}
