/*
(Sort characters in a string) Write a method that returns a sorted string using the
following header:

	public static String sort(String s)

For example, sort("acb") returns abc.
Write a test program that prompts the user to enter a string and displays the sorted
string
*/
import java.util.Scanner;
public class Exercise07_34{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter word: ");
		String word = input.next();
		System.out.print("This word is sorted: " + sort(word));
	}
    public static String sort(String s){
        char []list = s.toCharArray();
        boolean check = true;
        while(check){
            check = false;
            for(int i = 1; i < list.length; i++){
                if(list[i] < list[i - 1]){
                    char temp = list[i];
                    list[i] = list[i - 1];
                    list[i - 1] = temp;
                    check = true;
                }
            }
        }
        String result = "";
        for(char element:list){
            result += String.valueOf(element);
        }
        return result;
    }
}