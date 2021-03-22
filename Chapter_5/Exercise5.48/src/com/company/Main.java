package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = str.nextLine();
        for(int i = 0; i < a.length(); i++){
            if((i + 1) % 2 != 0){
                System.out.print(a.charAt(i));
            }
        }
    }
}

