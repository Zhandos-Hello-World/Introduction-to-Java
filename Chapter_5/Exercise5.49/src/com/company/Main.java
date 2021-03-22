package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = str.nextLine().toLowerCase();
        int count = 0;
        int count_2 = 0;
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) != ' '){
                if(a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i'
                        || a.charAt(i) == 'o' || a.charAt(i) == 'u' ){
                    count++;
                }
            else{
                    count_2++;
                }
            }
        }
        System.out.println("The number of vowels is " + count);
        System.out.print("The number of consonants is " + count_2);
    }
}
