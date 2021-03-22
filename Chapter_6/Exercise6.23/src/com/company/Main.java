package com.company;
import java.util.Scanner;
public class Main {

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
