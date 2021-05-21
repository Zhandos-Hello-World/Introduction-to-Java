/*
(Create a text file) Write a program to create a file named Exercise17_01.txt if it
does not exist. Append new data to it if it already exists. Write 150 integers created randomly into the file using text I/O. Integers are separated by a space.
 */


import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> tempData = new ArrayList<>();
        File file = new File("Exercise17_01.txt");
        if(file.exists()){
            try(Scanner scanner = new Scanner(file)){
                while(scanner.hasNext()){
                    tempData.add(scanner.next() + " ");
                }
            }
        }
        for(int i = 0; i < 150; i++){
            tempData.add((int)(Math.random() * 150 + 0) + " ");
        }
        try(PrintWriter output = new PrintWriter(file)){
            for(int i = 0; i < tempData.size(); i++){
                output.print(tempData.get(i));
            }
        }

    }
}