package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String s = str.nextLine().toLowerCase();
        System.out.println(countLetters(s));
    }
    public static int countLetters(String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            for(char c = 'a'; c <= 'z'; c++) {
               if(c == s.charAt(i)){
                   count++;
               }
            }
        }
        return count;
    }
}
