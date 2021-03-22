package com.company;
import java.util.Scanner;
public class Main {

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
