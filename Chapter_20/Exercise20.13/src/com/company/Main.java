package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

    }
}
class help<T>{
    T max;
    public T getMax(ArrayList<T> arr){
        max = Collections.max(arr, new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                if(o1.o2){

                }
            }
        });
        return max;
    }
}