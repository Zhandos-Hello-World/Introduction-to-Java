package com.company;

public class LinearEquation {
    private double a, b, c, d, e, f;
    LinearEquation(double a, double b, double c, double d, double e, double f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    double getA(){
        return a;
    }
    double getB(){
        return b;
    }
    double getC(){
        return c;
    }
    double getD(){
        return d;
    }
    double getE(){
        return e;
    }
    double getF(){
        return f;
    }
    boolean isSolvable(){
        return (a * d) - (b * c) != 0;
    }
    double getX(){
        return ((e * d) - (b * f)) / ((a * d) - (b * c));
    }
    double getY(){
        return ((a * f) - (e * c)) / ((a * d) - (b * c));
    }

}
