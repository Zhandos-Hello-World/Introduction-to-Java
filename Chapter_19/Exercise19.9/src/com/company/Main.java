package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            int random = (int)(Math.random() * 1000 + 0);
            list.add(random);
        }
        sort(list);
        for(Integer value:list){
            System.out.println(value);
        }
    }
    public static <E extends Comparable<E>> void sort(ArrayList<E> list){
        boolean check = true;
        while(check){
            check = false;
            for(int i = 1; i < list.size(); i++){
                if(list.get(i).compareTo(list.get(i - 1)) < 0){
                    check = true;
                    Object []tempArr = list.toArray();
                    E temp = (E) tempArr[i];
                    tempArr[i] = tempArr[i - 1];
                    tempArr[i - 1] = temp;
                    list.clear();
                    for(int j = 0; j < tempArr.length; j++){
                        list.add((E)tempArr[j]);
                    }
                }
            }
        }
    }
}
