package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner fis = new Scanner(new File("File.txt"));
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        while(fis.hasNext()){
            j++;
            stack.add(fis.nextInt());
        }
        for(int i = 0; i < j; i++){
            System.out.print(stack.pop() + " ");
        }
    }
}
