/*
(Using two files) Write a program that prompts the user to enter the name of an
author and prints the titles of their books. You can use the method of Programming Exercise 12.14.
Assume that you have a file "authors" and a file "books" created from Programming Exercise 12.19.
*/
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class Main{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Write author's name: ");
		String name = input.nextLine();
		System.out.print(writeInFile(name, new File("Authors.txt"), new File("Book.txt")));

	}
	public static String writeInFile(String name, File authors, File book){
		String bookName = name + "'s book is not found or " + name + " is absent";
		boolean attendance = false;
		try(Scanner findAuthor = new Scanner(authors);
			Scanner findBook = new Scanner(book)){
			int index = 0;
			while(findAuthor.hasNextLine()){
				if(findAuthor.nextLine().contains(name)){
					attendance = true;
					break;
				}
				index++;
			}
			if(attendance){
				int i = 0;
				while(findBook.hasNextLine()){
					if(index == i){
						bookName = findBook.nextLine(); 
						break;
					}
					findBook.nextLine();
					i++;
				}
			}
			return bookName;
		}
		catch(FileNotFoundException ex){
			bookName = "Error";
			return bookName;
		}
	}
}