package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	    Scanner str = new Scanner(System.in);
	    str.useLocale(Locale.US);
	    System.out.print("Enter a point with two coordinates: ");
	    double x = str.nextDouble();
	    double y = str.nextDouble();
	    double r = Math.sqrt(200);
	    double res = Math.sqrt(x*x + y*y);
	    if(res <= 10 && res >= 0){
	        System.out.print("Point (" +x+","+y+") is in the circle" );
        }
	    else{
			System.out.print("Point (" +x+","+y+") is not in the circle" );
		}

    }
}
