package com.company;

import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Hello");
        list.add("Hi");
        list.add("Hi");
        list.add("Goodbye");
        list.add("Goodbye");
        list.add("bye");
        list.add("bye");
	    System.out.print(removeDuplicates(list));
    }
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
        for(int i = 0; i < list.size(); i++){
            for(int j = i + 1; j < list.size(); j++){
                if(list.get(i) == list.get(j)){
                    list.remove(j);
                }
            }
        }
        return list;
    }
}
