/*
(Count characters, words, and lines in a file) Write a program that will count
the number of characters, words, and lines in a file. Words are separated by
whitespace characters. The file name should be passed as a command-line
argument, as shown in Figure 12.13.
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class Exercise12_13{
	public static void main(String[]args) throws FileNotFoundException{
		if(args.length != 1){
			System.out.print("Usage: java Exercise12_13 Loan.java");
		}
		File filepath = new File(args[0]);
		if(!filepath.exists()){
			System.out.print(args[0].concat(" is not found!!!"));
			System.exit(1);
		}

		try(Scanner input = new Scanner(filepath)){
			ArrayList<String> list = new ArrayList<>();
			while(input.hasNext()){
				list.add(input.nextLine());
			}
			int sizeOfWords = 0;
			int sizeOfChar = 0;
			int sizeOfLines = list.size();
			for(int i = 0; i < list.size(); i++){
				for(int j = 0; j < list.get(i).length(); j++){
					if(list.get(i).charAt(j) == ' '){
						sizeOfWords++;
					}
					else{
						sizeOfChar++;
					}
				}
				sizeOfWords++;
			}
			System.out.println(sizeOfChar + " characters");
			System.out.println(sizeOfWords + " words");
			System.out.println(sizeOfLines + " lines");
		}

	}
}