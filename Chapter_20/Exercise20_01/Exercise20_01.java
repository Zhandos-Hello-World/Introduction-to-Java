/*
(Display words in descending alphabetical order) Write a program that reads
words from a text file and displays all the words (duplicates allowed) in
descending alphabetical order. The words must start with a letter. The text file
is passed as a command-line argument.
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;

public class Exercise20_01{
	public static void main(String[]args)throws FileNotFoundException{
		if(args.length != 1){
			//for example: java Exercise20_01 Revolution.txt
			System.out.print("Usage: java Exercise20_01 TextFile.txt");
			System.exit(1);
		}
		
		ArrayList<String> list = new ArrayList<>();
		try(Scanner scan = new Scanner(new File(args[0]))){
			while(scan.hasNext()){
				String temp = scan.next();
				if(temp.toLowerCase().charAt(0) > 'a' && temp.toLowerCase().charAt(0) < 'z'){
					list.add(temp);
				}
			}
			Collections.sort(list);
			for(String word:list){
				System.out.println(word);
			}
		}

	}
}