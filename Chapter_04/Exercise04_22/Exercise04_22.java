/*
(Check substring) Write a program that prompts the user to enter two strings, and
reports whether the second string is a substring of the first string.

    Enter string s1: ABCD
    Enter string s2: BC
    BC is a substring of ABCD

    Enter string s1: ABCD
    Enter string s2: BDC
    BDC is not a substring of ABCD

*/
import java.util.Scanner;
public class Exercise04_22 {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter string s1: ");
        String s1 = str.nextLine().toUpperCase();
        System.out.print("Enter string s2: ");
        String s2 = str.nextLine().toUpperCase();
        if(s1.contains(s2)){
            System.out.print(s2 + " is a substring of " + s1);
        }
        else{
            System.out.print(s2 + " is a not substring of " + s1);
        }
}}
