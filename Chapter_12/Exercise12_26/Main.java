/*
(Create a directory) Write a program that prompts the user to enter a directory
name and creates a directory using the File’s mkdirs method. The program
displays the message "Directory created successfully" if a directory is created
or "Directory already exists" if the directory already exists.
*/
import java.io.File;
public class Main{
	public static void main(String[]args){
		if(args.length != 1){
			System.out.print("Usage: java Main Folder");
			System.exit(1);
		}
		File path = new File(args[0]);
		if(path.exists()){
			System.out.print("Directory already exists");
		}
		else{
			if(path.mkdirs()){
				System.out.print("Directory created successfully");
			}
		}
	}
}