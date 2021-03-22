package com.company;
public class Main {

    public static void main(String[] args) {
        java.util.Scanner str = new java.util.Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s1 = str.nextLine();
        System.out.print("Enter the second string: ");
        String s2 = str.nextLine();
        String temp;
        if(s2.length() > s1.length()){
            temp = s1;
            s1 = s2;
            s2 = temp;
        }
        int t = 0;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) == ' '){
                String word = s1.substring(t, i);
                for(int j = 0; j < )
            }
        }

    }
}
