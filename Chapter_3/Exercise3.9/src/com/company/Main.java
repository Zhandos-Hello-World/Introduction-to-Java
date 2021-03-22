package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
	    Scanner str = new Scanner(System.in);
	    System.out.print("Enter the first 9 digits of an ISBN as integer: ");
	    int a = str.nextInt();
	    int d1 = (a / 100000000);
	    int d2 = (a / 10000000) % 10;
	    int d3 = (a / 1000000) % 10;
	    int d4 = (a / 100000) % 10;
	    int d5 = (a / 10000) % 10;
	    int d6 = (a / 1000) % 10;
	    int d7 = (a / 100) % 10;
	    int d8 = (a % 100) / 10;
	    int d9 = (a % 10);
		int sum = (d1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
		if(sum == 1){
			System.out.println("The ISBN-10 number is " + a);
		}
		else{
			System.out.println("The ISBN-10 number is " + a + "X");
		}
    }
}
