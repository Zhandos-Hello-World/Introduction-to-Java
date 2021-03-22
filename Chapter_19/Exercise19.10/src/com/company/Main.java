package com.company;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            int random = (int)(Math.random() * 1000 + 0);
            list.add(random);
        }
        System.out.println(max(list));
    }
    public static <E extends Comparable<E>> E max(ArrayList<E> list){
        E e = list.get(0);
        for(int i = 0; i < list.size(); i++){
            if(e.compareTo(list.get(i)) < 0){
                e = list.get(i);
            }
        }
        return e;
    }
}
