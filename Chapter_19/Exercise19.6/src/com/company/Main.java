package com.company;

public class Main {

    public static void main(String[] args) {
        Integer[][]list = new Integer[10][10];
        int q = 0;
        for(int i = 0; i < list.length; i++){
            for(int j = 0; j < list[i].length; j++){
                list[i][j] = q;
                q += 10;
            }
        }
        System.out.print(max(list));
    }
    public static <E extends Comparable<E>> E max(E[][] list){
        E max = list[0][0];
        for(int i = 0; i < list.length; i++){
            for(int j = 0; j < list[i].length; j++){
                if(list[i][j].compareTo(max) > 0){
                    max = list[i][j];
                }
            }
        }
        return max;
    }
}
