/*
(Game: heads or tails) Write a program that lets the user guess whether the flip of
a coin results in heads or tails. The program randomly generates an integer 0 or 1,
which represents head or tail. The program prompts the user to enter a guess, and
reports whether the guess is correct or incorrect.

*/
import java.util.Scanner;

public class Exercise03_14{
	
    public static void main(String[] args) {
    	int num;
	    Scanner str = new Scanner(System.in);
	    System.out.print("heads or tails h/t:");
	    String s = str.nextLine().toLowerCase();
	    char a = s.charAt(0);
	    int q = (int)(Math.random() * (1 - 0 + 1) + 0);
    	if(a == 'h'){
    		num = 0;
			if(num == q){
				System.out.println("You won");
			}
			else{
				System.out.println("You lose");
			}
		}
    	else if(a == 't'){
    		num = 1;
			if(num == q){
				System.out.println("You won");
			}
			else{
				System.out.println("You lose");
			}
		}
    	else{
    		System.out.print("Error");
		}
    }
}
