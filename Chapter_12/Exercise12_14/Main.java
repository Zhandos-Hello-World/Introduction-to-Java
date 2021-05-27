/*
(Reading in a sorted file) Write a method public static int
readInFile(String line, File file) that returns the position number
of a line in the file filename or −1 if there is no such line or file.
We assume that this file contains names of people with a name per line.
Names (and hence lines) are listed in ascending alphabetical order in the file.
We can not find the same line twice
*/
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
public class Main{
    public static void main(String[]args) throws FileNotFoundException{
        Scanner scanner = new Scanner(System.in);
        System.out.print("What word do you need to find?");
        String word = scanner.nextLine().trim();
        if(args.length != 1){
            System.out.print("Usage: java Main Text.txt");
            System.exit(1);
        }
        File filePath = new File(args[0]);
        if(!filePath.exists()){
            System.out.print(args[0] + " file is not found");
            System.exit(1);
        }

        System.out.print("Line is " + readInFile(word, filePath));

    }
    public static int readInFile(String line, File file) throws FileNotFoundException{
        int index = 0;
        boolean check = false;
        try(Scanner input = new Scanner(file)){
            while(input.hasNextLine()){
                if(input.nextLine().toLowerCase().contains(line.toLowerCase())){
                    check = true;
                    break;
                }
                index++;
            }
            return check ? index : -1;
        }
    }
}