/*
(Vowel or consonant?) Write a program that prompts the user to enter a letter and
check whether the letter is a vowel or consonant. For a nonletter input, display
invalid input. Here is a sample run:

    Enter a letter: B
    B is a consonant

    Enter a letter: a
    a is a vowel

    Enter a letter: #
    # is an invalid input

*/
import java.util.Scanner;
public class Exercise04_13{

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String a = str.nextLine().toLowerCase();
        char d = a.charAt(0);
        if(d >= 'a' && d <= 'z'){
            if(d == 'a' || d == 'e' || d == 'u' || d == 'y' || d == 'o' || d == 'i'){
                System.out.print( d + " is a vowel");
            }
            else{
                System.out.print(d + " is a constant");
            }
        }
        else{

            System.out.print(d + " is an invalid input");
        }

    }
}
