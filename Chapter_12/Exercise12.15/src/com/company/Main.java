package com.company;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.File;
public class Main {

    public static void main(String[] args) {
        try{
            PrintWriter pw = new PrintWriter
                ("E:\\Import\\JavaExamples\\Chapter_12\\Exercise12.15\\src\\com\\company\\Exercise12_15.txt");
            int i = 0;
            while(i < 100){
                int number = (int)(Math.random() * (int)(Math.pow(2, 63)) + 0);
                pw.println(number);
                i++;
            }
            pw.close();
            File file = new File
                ("E:\\Import\\JavaExamples\\Chapter_12\\Exercise12.15\\src\\com\\company\\Exercise12_15.txt");
            Scanner scanner = new Scanner(file);
            int []save = new int[100];
            i = 0;
            while(scanner.hasNext()){
                save[i] = scanner.nextInt();
                i++;
            }
            boolean check = true;
            while(check){
                check = false;
                for(int j = 1; j < save.length; j++){
                    if(save[j - 1] > save[j]){
                        int temp = save[j - 1];
                        save[j - 1] = save[j];
                        save[j] = temp;
                        check = true;
                    }
                }
            }
            for(int value:save){
                System.out.println(value);
            }
        }
        catch (FileNotFoundException ex){
            System.out.print(ex.getMessage());
        }
    }
}
