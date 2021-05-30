/*
(Count consonants and vowels) Write a program that prompts the user to enter a
text file name and displays the number of vowels and consonants in the file. Use
a set to store the vowels A, E, I, O, and U.
 */

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[]args) throws IOException {
        if(args.length != 1){
            System.out.println("Usage: java Main Text.txt");
            System.exit(1);
        }

        File path = new File(args[0]);
        try(RandomAccessFile raf = new RandomAccessFile(path, "rw")){
            byte[]b = new byte[(int)(raf.length())];
            raf.read(b);

            Set<Character> set = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'));
            int count = 0;
            int consonants = 0;
            for(byte value:b){
                if(((char)(value) > 'a' && (char)(value) > 'z') || ((char)(value) > 'A' && (char)(value) > 'Z')){
                    if(set.contains((char)(value))){
                        count++;
                    }
                    else{
                        consonants++;
                    }
                }
            }
            System.out.println("Text has " + count + " vowels");
            System.out.println("Text has " + consonants + " consonants");
        }
    }
}
