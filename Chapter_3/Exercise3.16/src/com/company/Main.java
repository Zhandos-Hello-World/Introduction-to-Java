package com.company;

public class Main {

    public static void main(String[] args) {
        int width = (int)(Math.random() * (100) + 0);
        int height = (int)(Math.random() * (200) + 0);
        System.out.println("Height:" + height + "  Width:" + width);
        System.out.println("(" + width + "," + height + ")");
    }
}
