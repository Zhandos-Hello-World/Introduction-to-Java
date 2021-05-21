/*
(Display words in descending alphabetical order) Write a program that reads
words from a text file and displays all the words (duplicates allowed) in
descending alphabetical order. The words must start with a letter. The text file
is passed as a command-line argument.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[]args) throws FileNotFoundException {
        if(args.length != 1){
            System.out.println("Usage: java Main Text.txt");
            System.exit(1);
        }
        try(Scanner input = new Scanner(new File(args[0]))){
            ArrayList<String> list = new ArrayList<>();
            while(input.hasNext())list.add(input.next());
            Collections.sort(list);
            list.forEach(System.out::println);
        }
    }
}
