package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner str = new Scanner(System.in);
	    System.out.print("Enter a letter: ");
	    char a = str.nextLine().toUpperCase().charAt(0);
	    if(a >= 'A' && a <= 'Z'){
	    	int q;
			if(a <= 'C')q = 2;
			else if(a <= 'F')q = 3;
			else if(a <= 'I')q = 4;
			else if(a <= 'L')q = 5;
			else if(a <= 'O')q = 6;
			else if(a <= 'S')q = 7;
			else if(a <= 'V')q = 8;
			else q = 9;
			System.out.print("The corresponding number is " + q);
		}
	    else{
	    	System.out.print(a + " is an invalid input");
		}
    }
}
