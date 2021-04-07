package com.company;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> lis = new LinkedList<>();
        for(int i = 0; i < 5000000; i++){
            lis.add(i);
        }
        Long before = System.currentTimeMillis();
        Iterator<Integer> lisIterator= lis.iterator();
        while(lisIterator.hasNext()){
            System.out.println(lisIterator.next());
        }
        Long after = System.currentTimeMillis();
        System.out.println("Iterator: " + (long)(after - before) + " milliseconds");
        before = System.currentTimeMillis();
        for(int i = 0; i < 5000000; i++){
            lis.get(i);
        }
        after = System.currentTimeMillis();
        System.out.println("get(index): " + (long)(after - before) + " milliseconds");
        // iterator is faster than for each
    }
}
