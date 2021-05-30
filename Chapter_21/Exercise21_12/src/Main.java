/*
(Name for both genders) Write a program that prompts the user to enter one of the
filenames described in Programming Exercise 12.31 and displays the names that
are used for both genders in the file. Use sets to store names and find common
names in two sets. Here is a sample run:

 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[]args)throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a file name for baby name ranking: ");
        String path = input.next();
        LinkedHashSet<String> nameM = new LinkedHashSet<>();
        LinkedHashSet<String> nameF = new LinkedHashSet<>();


        File file = new File(path);
        if(!file.exists()){
            System.out.print("File is not found 0_0");
            System.exit(1);
        }
        try(Scanner scanner = new Scanner(file)){
            while(scanner.hasNext()){
                //skip rank
                scanner.nextInt();
                nameM.add(scanner.next());

                //skip number
                scanner.next();

                nameF.add(scanner.next());

                //skip number
                scanner.next();
            }
        }
        LinkedHashSet<String> both = new LinkedHashSet<>(nameM);
        both.retainAll(nameF);
        System.out.println(both.size() + " names used for both gender");
        System.out.print("They are ");
        both.forEach(e ->{
            System.out.print(e + " ");
        });
    }
}
