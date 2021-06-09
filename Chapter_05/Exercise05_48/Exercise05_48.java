/*
(Process string) Write a program that prompts the user to enter a string and displays
the characters at even positions. Here is a sample run:
    Enter a string: Beijing Chicago
    ejnhcg
*/
import java.util.Scanner;
public class Exercise05_48{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = input.nextLine();
        for(int i = 0; i < a.length(); i++){
            if(i % 2 != 0 && a.charAt(i) != ' '){
                System.out.print(a.charAt(i));
            }
        }
    }
}

