package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int a = str.nextInt();
        int b = str.nextInt();
        int c = str.nextInt();
        if(a >= b && b >= c){
            System.out.println(c + " " + b + " " + a);
        }
        else if(b >= a && a >= c){
            System.out.println(c + " " + a + " " + b);
        }
        else if(c >= a && a >= b){
            System.out.println(b + " " + a + " " + c);
        }
        else if(a >= c && c >= b){
            System.out.println(b + " " + c + " " + a);
        }
        else if(b >= c && c >= a){
            System.out.println(a + " " + c + " " + b);
        }
        else if(c >= b && b >= a){
            System.out.println(a + " " + b + " " + c);
        }
    }
}
