package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner str = new Scanner(System.in);
	    System.out.print("A is:");
	    int a = str.nextInt();
	    System.out.print("B is:");
	    int b = str.nextInt();
	    System.out.print("C is:");
	    int c = str.nextInt();
	    if(a + b > c){
	    	int res = a + b + c;
	        System.out.print("Triangle perimeter is equal in: " + res);
        }
	    else{
	        System.out.print("The input is invalid");
        }
    }
}
