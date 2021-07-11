/*
(Replace text) Revise Programming Exercise 12.16 to replace a string in a file with
a new string for all files in the specified directory using the following command:

java Exercise12_22 dir oldString newString

for example: java Exercise12_22 dir.txt Kotlin Java
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
public class Exercise12_22{
    public static void main(String[]args){
        if(args.length != 3){
            System.out.print("Usage: java Exercise12_22 dir oldString newString");
            System.exit(1);
        }
        File filePath = new File(args[0]);
        StringBuilder text = new StringBuilder();
        try{
            Scanner input = new Scanner(filePath);
            while(input.hasNextLine()){
                text.append(input.nextLine() + "\n");
            }
            input.close();
            int index = replaceFindIndex(text.toString(), args[1]);
            if(index != -1){
                text.replace(index, index + args[1].length(), args[2]);
                PrintWriter pw = new PrintWriter(filePath);
                pw.print(text);
                pw.close();
            }
            else{
                System.out.print("oldString is not found.");
            }

        }
        catch(FileNotFoundException ex){
            System.out.print("File is not found");
        }

    }
    public static int replaceFindIndex(String text, String oldString){
        int index = -1;
        for(int i = 0; i < text.length(); i++){
            int count = 0;
            for(int j = 0; j < oldString.length(); j++){
                if(text.charAt(i) == oldString.charAt(j)){
                    count++;
                }
                else{
                    break;
                }
            }
            if(count == oldString.length() - 1){
                index = i;
                break;
            }
        }
        return index;
    }
}