/*
(Check password) Some websites impose certain rules for passwords. Write a
method that checks whether a string is a valid password. Suppose the password
rules are as follows:
■■ A password must have at least ten characters.
■■ A password consists of only letters and digits.
■■ A password must contain at least three digits.
Write a program that prompts the user to enter a password and displays Valid
Password if the rules are followed or Invalid Password otherwise.


*/
import java.util.Scanner;
public class Exercise06_18{

    public static void main(String[]args){
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = str.next();
        System.out.print((checkPassword(password) ? "Valid":"Invalid") + " Password");
        checkPassword(password);
    }
    public static boolean checkPassword(String password){
        String pass = password.toLowerCase();
        return pass.length() > 10 && checkOnlyLetterAndDigit(pass) && checkThreeDigit(pass);
    }
    public static boolean checkOnlyLetterAndDigit(String pass){
        for(int i = 0; i < pass.length(); i++){
            if(!(pass.charAt(i) >= 'a' && pass.charAt(i) <= 'z' && pass.charAt(i) >= '0' && pass.charAt(i) <= '9')){
                return false;
            }
        }
        return true;
    }
    public static boolean checkThreeDigit(String pass){
        int count = 0;
        for(int i = 0; i < pass.length(); i++){
            if(pass.charAt(i) >= '0' && pass.charAt(i) <= '9'){
                count++;
            }
        }
        return count > 3;
    }
}