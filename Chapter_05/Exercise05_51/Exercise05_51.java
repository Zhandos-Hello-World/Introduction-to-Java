/*
(Longest common prefix) Write a program that prompts the user to enter two
strings and displays the largest common prefix of the two strings. Here are some
sample runs:

    Enter the first string: Welcome to C++
    Enter the second string: Welcome to programming
    The common prefix is Welcome to

    Enter the first string: Atlanta
    Enter the second string: Macon
    Atlanta and Macon have no common prefix

*/
import java.util.Scanner;
public class Exercise05_51 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String s2 = input.nextLine();


        String result = "", temp = "";
        for(int i = 0; i < s2.length(); i++){
            if(s2.charAt(i) != ' '){
                temp += String.valueOf(s2.charAt(i));
            }
            else{
                if(s1.contains(temp) && !result.contains(temp)){
                    result += temp + " ";
                    temp = "";
                }
            }
        }
        if(result.equals("")){
            System.out.print(s1 + " and " + s2  + " have no common prefix");
        }
        else{
            System.out.print("The common prefix is " + result);
        }
    }
}