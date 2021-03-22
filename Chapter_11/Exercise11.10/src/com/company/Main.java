package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        MyStack c1 = new MyStack();
        Scanner str = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            String s = str.next();
            c1.push(s);
        }

    }
}
