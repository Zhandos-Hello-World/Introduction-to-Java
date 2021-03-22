package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner str = new Scanner(System.in);
	    double []eqn = new double[3];
	    double [] roots = new double[2];
	    System.out.print("Enter a, b, c: ");
	    for(int i = 0; i < eqn.length; i++){
	        eqn[i] = str.nextDouble();
        }
	    int number = solveQuadratic(eqn, roots);
	    if(number == 0){
	        System.out.print("no roots");
        }
	    else{
	        for(int i = 0; i < number; i++){
	            System.out.println("Root " + (i + 1) + " is " + roots[i]);
            }
        }

    }
    public static int solveQuadratic(double[] eqn, double[] roots){
        double d = Math.pow(eqn[1], 2) - (4 * eqn[0] * eqn[2]);
        if(d < 0){
            return 0;
        }
        else if(d == 0){
            roots[0] = (-eqn[1]) / (2 * eqn[0]);
            return 1;
        }
        else{
            roots[0] = (-eqn[1] + Math.sqrt(d)) / (2 * eqn[0]);
            roots[0] = (-eqn[1] - Math.sqrt(d)) / (2 * eqn[0]);
            return 2;
        }
    }
}
