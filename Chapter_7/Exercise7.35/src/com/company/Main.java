package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Add any words you wish in this array
        String[] words = {"write", "that", "hello", "love", "goals", "read", "live"};
        Scanner str = new Scanner(System.in);
        for(int i = 0; i < words.length; i++){
            String word = words[i];
            boolean check = true;
            int range = word.length();
            String output = "";
            for(int j = 0; j < range; j ++){
                output = output.concat("*");
            }
            while(check){
                System.out.print("(Guess) Enter a letter in word " + output + " > ");
                char a = str.next().charAt(0);
                boolean q = false;
                for(int y = 0; y < word.length(); y++){
                    if(a == word.charAt(y)){
                        q = true;
                    }
                }
                for(int y = 0; y < output.length(); y++){
                    if(a == output.charAt(y)){
                        q = false;
                    }
                }
                if(q){
                    for(int y = 0; y < word.length(); y++){
                        if(a == word.charAt(y)){
                            output = exchange(y, a, output);
                        }
                    }
                }
                else{
                    System.out.print("     " + a + " is already in the word\n");
                }
                int t = 0;
                for(int y = 0; y < output.length(); y++){
                    if(output.charAt(y) == '*'){
                        t = 1;
                    }
                }
                if(t == 0){
                    check = false;
                }
            }
            System.out.print("The word is program. You missed 1 time\n" +
                    "Do you want to guess another word? Enter y or n>");
            char answer = str.next().charAt(0);
            if(answer == 'n'){
                break;
            }
        }
    }
    public static String exchange(int y, char a, String output){
        String save1 = output.substring(0, y);
        String save2 = output.substring(y + 1);
        return save1 + String.valueOf(a) + save2;
    }
}
