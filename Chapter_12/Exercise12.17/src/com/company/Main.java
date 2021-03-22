package com.company;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        File file = new File("E:\\Import\\JavaExamples\\Chapter_12\\Exercise12.17\\src\\com\\company\\Text");
        try{
            ArrayList<String> list = new ArrayList<>();
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                list.add(scanner.next());
            }
            scanner.close();
            String []words = new String[list.size()];
            for(int i =0 ; i < list.size(); i++){
                words[i] = list.get(i);
            }
            game(words);
        }
        catch (FileNotFoundException ex){
            System.out.print(ex.getMessage());
        }
    }
    public static void game(String []words){
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
