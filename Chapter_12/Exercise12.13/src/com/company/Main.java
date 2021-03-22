package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean check = false;
        File file = new File
                ("E:\\Import\\JavaExamples\\Chapter_12\\Exercise12.13\\src\\com\\company\\Text");
        try{
            Scanner s = new Scanner(file);
            ArrayList<String> save = new ArrayList<>();
            while(s.hasNext()){
                save.add(s.nextLine());
            }
            int character = 0, words = 0;
            for(int i = 0; i < save.size(); i++){
                Scanner q = new Scanner(save.get(i));
                while(q.hasNext()){
                    q.next();
                    words++;
                }
                character += save.get(i).length();
            }
            s.close();
            System.out.println(character + " characters");
            System.out.println(words + " words");
            System.out.println(save.size() + " line");

        }
        catch (FileNotFoundException ex){
            System.out.print(ex.getMessage());
        }
    }
}
