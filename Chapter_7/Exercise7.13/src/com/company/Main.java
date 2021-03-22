package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.print(getRandom());
    }
    public static int getRandom(){
        return (int)(Math.random() * 53) + 1;
    }
}
