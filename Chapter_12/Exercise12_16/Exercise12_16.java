/*
(Replace text) Listing 12.16, ReplaceText.java, gives a program that replaces
text in a source file and saves the change into a new file. Revise the program to
save the change into the original file. For example, invoking

	java Exercise12_16 file oldString newString

replaces oldString in the source file with newString.
*/
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.PrintWriter;

public class Exercise12_16{
	public static void main(String[]args) throws FileNotFoundException{
		if(args.length != 3){
			System.out.print("Usage: java Main file oldString newString");
			System.exit(1);
 		}
		File file = new File(args[0]);


		if(!file.exists()){
			System.out.print("Source file is not found!!!");
			System.exit(1);
		}
		ArrayList<String> list = new ArrayList<>();
		try (Scanner input = new Scanner(file)) {
			while (input.hasNext()) {
				String s1 = input.nextLine();
				list.add(s1.replaceAll(args[1], args[2]));
			}
		}
		try (PrintWriter output = new PrintWriter(file)) {
			for (int i = 0; i < list.size(); i++) {
				output.println(list.get(i));
			}
		}
	}
}