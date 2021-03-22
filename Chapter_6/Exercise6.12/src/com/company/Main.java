package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("\nCharacters per 1 to Z");
        printChars('1', 'z', 10);
    }
    public static void printChars(char ch1, char ch2, int numberPerLine){
        for(char c = ch1, count = 1; c <= ch2; c++, count++){
            if(count % numberPerLine == 0){
                System.out.println(c);
            }
            else{
                System.out.print(c + " ");
            }
        }
    }
}
