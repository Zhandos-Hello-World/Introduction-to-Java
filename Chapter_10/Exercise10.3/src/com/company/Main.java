package com.company;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(3);
        int number = 3;
        MyInteger num = new MyInteger(3);
        System.out.print(myInteger.equals(num));
    }
}
