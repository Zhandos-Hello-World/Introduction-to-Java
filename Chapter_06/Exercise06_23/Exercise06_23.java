/*
(Occurrences of a specified character) Write a method that finds the number of
occurrences of a specified character in a string using the following header:

    public static int count(String str, char a)


For example, count("Welcome", 'e') returns 2. Write a test program that
prompts the user to enter a string followed by a character then displays the number
of occurrences of the character in the string.
*/

import java.util.Scanner;

public class Exercise06_23{

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = str.nextLine();
        System.out.print("What letter should be considered? ");
        char a = str.next().charAt(0);
        System.out.print(count(s, a));

    }
    public static int count(String str, char a){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(a == str.charAt(i)){
                count++;
            }
        }
        return count;
    }
}
