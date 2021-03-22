package com.company;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    double getA(){
        return a;
    }
    double getB(){
        return a;
    }
    double getC(){
        return c;
    }
    double getDiscriminant(){
        return Math.pow(b, 2) - (4 * a * c);
    }
    double getRoot1(){
        if(getDiscriminant() < 0){
            return 0;
        }
        else{
            return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
        }
    }
    double getRoot2(){
        if (getDiscriminant() < 0){
            return 0;
        }
        else{
            return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
        }
    }
}
