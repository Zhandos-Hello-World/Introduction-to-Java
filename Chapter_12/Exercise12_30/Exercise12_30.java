/*
(Occurrences of each letter) Write a program that prompts the user to enter a
file name and displays the occurrences of each letter in the file. Letters are case
insensitive. Here is a sample run:
*/
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
public class Exercise12_30{
	public static void main(String[]args) throws FileNotFoundException{
		Scanner str = new Scanner(System.in);
		System.out.print("Enter a filename: ");
		String pathStr = str.next();
		File filePath = new File(pathStr);
		if(filePath.exists()){
			try(Scanner input = new Scanner(filePath)){
				while(input.hasNextLine()){
					String temp = input.nextLine();
					for(int i = 0; i < temp.length(); i++){
						if((temp.charAt(i) >= 'a' && temp.charAt(i) <= 'z') || (temp.charAt(i) >= 'A' && temp.charAt(i) <= 'Z')){
							System.out.println("Number of " + temp.charAt(i) + "s: " + (int)temp.charAt(i));
						}
					}
					System.out.println("");
				}
			}
		}
		else{
			System.out.print("File is not found");
		}
	}
}