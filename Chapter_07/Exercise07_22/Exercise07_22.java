/*
(Count the number of vowels in a string) Write a program that prompts the user to enter
a string, and counts and displays the number of both lowercase and uppercase vowels
in the string.
*/

public class Exercise07_22{
	public static void main(String[]args){
		if(args.length != 1){
			System.out.print("Usage: java Exercise07_22 word");
			System.exit(1);
		}
		String word = args[0];
		int vowelUpperCase = 0, vowellowerCase = 0;
		for(int i = 0; i < word.length(); i++){
			char t = word.charAt(i);
			if(t == 'A' || t == 'E' || t == 'O' || t == 'Y' || t == 'U' || t == 'I'){
				vowelUpperCase++;
			}
			else if(t == 'a' || t == 'e' || t == 'o' || t == 'y' || t == 'u' || t == 'i'){
				vowellowerCase++;
			}
		}
		System.out.println("Vowels in the UpperCase: " + vowelUpperCase);
		System.out.println("Vowels in the LowerCase: " + vowellowerCase);
		System.out.println("Common vowel: " + (vowelUpperCase + vowellowerCase));

	}
}