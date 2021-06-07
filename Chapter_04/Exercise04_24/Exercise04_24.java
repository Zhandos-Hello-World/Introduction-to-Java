/*
(Enter three countries) Write a program that prompts the user to enter three countries and displays them in descending order. Here is a sample run:
   
    Enter the first country: Germany
    Enter the second country: France
    Enter the third country: Switzerland
    The three countries in descending order are Switzerland
    Germany France

*/
import java.util.Scanner;
public class Exercise04_24 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String first = str.nextLine();
        System.out.print("Enter the second city: ");
        String second = str.nextLine();
        System.out.print("Enter the third city: ");
        String third = str.nextLine();
        char a = first.charAt(0);
        char b = second.charAt(0);
        char c = third.charAt(0);
        if(a > b && b > c){
            System.out.print("The three cities in alphabetical order are " + third + " " +  second + " " + first);
        }
        else if(a > c && c > b){
            System.out.print("The three cities in alphabetical order are " + second + " " +  third + " " + first);
        }
        else if(b > a && a > c){
            System.out.print("The three cities in alphabetical order are " + third + " " +  first + " " + second);
        }
        else if(b > c && c > a){
            System.out.print("The three cities in alphabetical order are " + first + " " +  third + " " + second);
        }
        else if (c > a && a > b){
            System.out.print("The three cities in alphabetical order are " + second + " " +  first + " " + third);
        }
        else if(c > b && b > a){
            System.out.print("The three cities in alphabetical order are " + first + " " +  second + " " + third);
        }
    }
}
