package com.company;

public class Main {

    public static void main(String[] args) {
        BMI person1 = new BMI("Zhandos", 18, 145, 70);
        System.out.print(person1.getStatus());
    }
}
