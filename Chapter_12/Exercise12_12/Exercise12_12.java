/*
(Reformat Java source code) Write a program that converts the Java source
code from the next-line brace style to the end-of-line brace style. For example,
the following Java source in (a) uses the next-line brace style. Your program
converts it to the end-of-line brace style in (b).

Your program can be invoked from the command line with the Java source-code
file as the argument. It converts the Java source code to a new format. For example, the following command converts the Java source-code file Test.java to
the end-of-line brace style.
java Exercise12_12 Test.java
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_12{
    private static ArrayList<String> list = new ArrayList<>();

    public static void main(String[]args) throws FileNotFoundException{
        if(args.length != 1){
            System.out.print("Usage: java Exercise12_12 Test.java");
            System.exit(1);
        }
        File sourceFile = new File(args[0]);
        if(!sourceFile.exists()){
            System.out.print("File is not found");
            System.exit(1);
        }

        try(Scanner input = new Scanner(sourceFile)){
            while(input.hasNext()){
                list.add(input.nextLine());
            }
            for(int i = 0; i < list.size(); i++){
                check(list.get(i), i);
            }
            for(int i = 0; i < list.size(); i++){
                while(list.get(i).trim().equals("")){
                    list.remove(i);
                }
            }
        }
        try(PrintWriter pw = new PrintWriter(sourceFile)){
            list.forEach(pw::println);
        }
    }

    public static void check(String line, int index){
        if(line.trim().length() == 1 && (line.trim().equals("{")) && index > 0){
            list.set(index - 1, list.get(index - 1).concat(line.trim()));
            list.remove(index);
        }
    }
}