package com.company;

public class Main {

    public static void main(String[] args) {
	int i = 0;
	while(true){
	    if(Math.pow(i, 3) > 12000){
	        System.out.print(i-1);
	        break;
        }
	    i++;
    }
    }
}
