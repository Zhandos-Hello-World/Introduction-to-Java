/*
(Writing in a sorted file) Write a method public static int
writeInFile(String name, File file) that writes name at its correct
position in file so that it fulfills the assumptions given in Programming Exercise 12.14.
The method returns the line position of the name.
*/
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.PrintWriter;

public class Main{
	public static void main(String[]args) throws FileNotFoundException{
		Scanner scanner = new Scanner(System.in);
		System.out.print("What word do you need to write?");
		String name = scanner.nextLine();
		if(args.length != 1){
			System.out.print("Usage: java Main text.txt");
			System.exit(1);
		}
		File filepath = new File(args[0]);
		if(!filepath.exists()){
			System.out.print(args[0] + " file is not found");
			System.exit(1);
		}
		System.out.print("Added in the " + writeInFile(name, filepath) + " index");
	}
	public static int writeInFile(String name, File file) throws FileNotFoundException{
		ArrayList<String> list = new ArrayList<>();
		try(Scanner input = new Scanner(file)){
			while(input.hasNextLine()){
				list.add(input.nextLine());
			}
		}
		list.add(name);
		try(PrintWriter pw = new PrintWriter(file)){
			for(int i = 0; i < list.size(); i++){
				pw.println(list.get(i));
			}
		}
		return list.size();
	}
}