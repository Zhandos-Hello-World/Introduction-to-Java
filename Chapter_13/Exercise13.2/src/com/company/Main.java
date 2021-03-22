package com.company;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        shuffle(list);
        for(Number i : list){
            System.out.print(i + " ");
        }
    }
    public static void shuffle(ArrayList<Number> list){
        for(int i = 0; i < list.size() - 1; i++){
            int switchValue = (int) (Math.random() * list.size());
            Number temp = list.get(switchValue);
            list.set(switchValue, list.get(i));
            list.set(i, temp);
        }
    }
}
