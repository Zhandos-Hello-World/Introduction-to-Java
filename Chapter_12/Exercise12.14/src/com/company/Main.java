package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
public class Main {

    public static void main(String[] args) {
        File file = new File("E:\\Import\\JavaExamples\\Chapter_12\\Exercise12.14\\src\\com\\company\\Text");
        try{
            Scanner s = new Scanner(file);
            double numbers = 0.0, size = 0.0;
            while(s.hasNext()){
                numbers += s.nextDouble();
                size++;
            }
            s.close();
            System.out.print(numbers / size);
        }
        catch (FileNotFoundException ex){
            System.out.print(ex.getMessage());
        }
    }
}
