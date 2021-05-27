/*
(Linking two files) Write a program that prompts the user to enter the name of
an author and the title of one their books. It writes the author’s name to a file
by using the method written in Programming Exercise 12.15. Their book’s title
is written at the end of a file Books.txt with the line number of the author’s
name in Authors.txt inserted before the title. Assume that the title is not
already stored in Books.txt and the author name is already in Authors.txt.
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class Main{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Write author's name: ");
		String name = input.nextLine();
		System.out.print("Author's name is written in the " + writeInFile(name, new File("Authors.txt")) + " index");
		System.out.print("\nWrite author's book: ");
		String book = input.nextLine();
		System.out.print("Author's book is written in the " + writeInFile(book, new File("Book.txt")) + " index");

	}
	public static int writeInFile(String name, File file){
		ArrayList<String> temp = new ArrayList<>();
		if(file.exists()){
			try{
				Scanner input = new Scanner(file);
				while(input.hasNext()){
					temp.add(input.nextLine());
				}
				PrintWriter output = new PrintWriter(file);
				for(int i = 0; i < temp.size(); i++){
					output.println(temp.get(i));
				}
				output.println(name);
				output.close();
				input.close();
			}
			catch(FileNotFoundException ex){
				System.out.print(ex.getMessage());
			}
		}
		else{
			try(PrintWriter output = new PrintWriter(file);){
				output.println(name);
			}catch(FileNotFoundException ex){
				System.out.print(ex.getMessage());
			}
		}
		return temp.size() + 1;
	}
}