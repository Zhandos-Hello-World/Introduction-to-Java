package com.company;
import java.util.*;
public class Main {

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
