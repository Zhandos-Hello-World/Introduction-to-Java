/*
(Remove text) Write a program that removes all the occurrences of a specified
string from a text file. For example, invoking
 
   java Exercise12_11 John filename

removes the string John from the specified file. Your program should get the
arguments from the command line.
*/

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
public class Exercise12_11{
	public static void main(String[]args) throws FileNotFoundException{
		if(args.length != 1){
			System.out.print("Usage: java Exercise12_11 John.txt filename.txt");
			System.exit(1);
		}
		try(PrintWriter delete = new PrintWriter(new File(args[0]))){
			delete.print("");
		}
	}
}