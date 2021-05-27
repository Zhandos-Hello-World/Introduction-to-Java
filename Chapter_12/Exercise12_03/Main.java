/*
(InputMismatchException) The previous program works well as  long
as the user enters an integer. Otherwise, you may get another kind of
exception. For instance, if you use nextInt() of Scanner, you could have an
InputMismatchException. Modify it to prevent users entering anything
other than an integer.
*/
import java.util.*;
public class Main{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		try{
			int number = input.nextInt();
		}catch(InputMismatchException ex){
			System.out.print("Wrong input!");
		}
	}
}