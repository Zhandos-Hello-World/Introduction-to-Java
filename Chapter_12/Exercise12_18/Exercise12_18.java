/*
(Add package statement) Suppose you have Java source files under the directories chapter1, chapter2, . . . , chapter34. Write a program to insert the
statement package chapteri; as the first line for each Java source file under
the directory chapteri. Suppose chapter1, chapter2, . . . , chapter34
are under the root directory srcRootDirectory. The root directory and
chapteri directory may contain other folders and files. Use the following
command to run the program:

	java Exercise12_18 srcRootDirectory
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.PrintWriter;

public class Exercise12_18{
	public static void main(String[]args){
		if(args.length != 1){
			System.out.print("Usage: java Exercise12_18 srcRootDirectory");
			System.exit(1);
		}
		ArrayList<Integer> numbersOfTheChapter = new ArrayList<>();
		String directory = args[0];
		for(int i = 1; i <= 34; i++){
			File temp = new File(directory.concat("\\chapter" + i));
			if(temp.exists()){
				numbersOfTheChapter.add(i);
			}
		}
		numbersOfTheChapter.trimToSize();
		Scanner input;
		PrintWriter output;

		//chapteri
		File directChapterI = new File(directory.concat("\\chapteri"));
		if(!directChapterI.exists()){
			directChapterI.mkdir();
		} 


		try{
			for(int i = 0; i < numbersOfTheChapter.size(); i++){
				input = new Scanner(new File(directory.concat("\\chapter" + numbersOfTheChapter.get(i))));
				output = new PrintWriter(directChapterI.getName().concat("chapter" + numbersOfTheChapter.get(i)));
				while(input.hasNextLine()){
					output.println(input.nextLine());
				}
			}
		}
		catch(FileNotFoundException ex){
			System.out.print(ex.getMessage());
		}
		
		
	}
}