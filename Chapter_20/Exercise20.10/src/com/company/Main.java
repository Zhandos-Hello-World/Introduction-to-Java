package com.company;

import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        PriorityQueue<String> q1 = new PriorityQueue<>();
        q1.add("George");
        q1.add("Jim");
        q1.add("John");
        q1.add("Blake");
        q1.add("Kevin");
        q1.add("Michael");
        System.out.print(q1);
    }
}
