package com.company;
import java.util.Scanner;
public class Main {

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
