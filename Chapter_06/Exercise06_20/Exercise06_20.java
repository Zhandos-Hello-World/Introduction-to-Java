/*
(Count the letters in a string) Write a method that counts the number of letters in
a string using the following header:

    public static int countLetters(String s)

Write a test program that prompts the user to enter a string and displays the number of letters in the string.
*/
import java.util.Scanner;
public class Exercise06_20{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println(countLetters(s));
    }
    public static int countLetters(String s){
        String temp = s.toLowerCase();
        int count = 0;
        for(int i = 0; i < temp.length(); i++) {
            if(temp.charAt(i) >= 'a' && temp.charAt(i) <= 'z'){
                count++;
            }
        }
        return count;
    }
}
