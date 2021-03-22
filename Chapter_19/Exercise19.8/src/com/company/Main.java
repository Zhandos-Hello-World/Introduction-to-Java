package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 100; i ++){
            list.add(i);
        }
        shuffle(list);
        for(Integer value:list){
            System.out.println(value);
        }
    }
    public static <E> void shuffle(ArrayList<E> list){
        ArrayList<Integer> temp = new ArrayList<>();
        int i = 0;
        while(i < list.size()){
            int random = (int)(Math.random() * (list.size() / 2) + 0);
            boolean check = true;
            for(int j = 0; j < temp.size(); j++){
                if(random == temp.get(j)){
                    check = false;
                }
            }
            if(check){
                E temp1 = list.get(random);
                E temp2 = list.get(random + (list.size() / 2 - 1));
                list.remove(random);
                list.remove(random + (list.size() / 2 - 1));
                list.add(random, temp2);
                list.add(random + (list.size() / 2 - 1), temp1 );
                temp.add(random);
                i++;
            }
        }

    }
}
