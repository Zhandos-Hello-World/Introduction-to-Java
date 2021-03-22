package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.PrintWriter;

class Main{
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("E:\\Import\\JavaExamples\\Chapter_12\\Exercise12.12\\src\\com\\company\\TestJ.java");
        Scanner scanner = new Scanner(file);
        ArrayList<String> save = new ArrayList<>();
        while(scanner.hasNext()){
            save.add(scanner.nextLine());
        }
        scanner.close();
        ArrayList<String> output = new ArrayList<>();
        for(int i = 0; i < save.size(); i++){
            if(i != save.size() - 1){
                for(int j = 0; j < save.get(i + 1).length(); j++){
                    if(save.get(i + 1).charAt(j) != '{' ||){

                    }
                }
            }
        }
        PrintWriter pw = new PrintWriter(file);
        for(int i = 0; i < output.size(); i++){
            pw.println(output.get(i));
        }
        pw.close();

    }
}