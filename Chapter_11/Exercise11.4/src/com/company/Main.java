package com.company;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        boolean check = true;
        while(check){
            int n = str.nextInt();
            if(n == 0){
                check = false;
            }
            list.add(n);
        }
        System.out.println(max(list));
    }
    public static Integer max(ArrayList<Integer> list){
        int max = 0;
        int i = 0;
        while(list.get(i) != 0){
            if(max < list.get(i)){
                max = list.get(i);
            }
            i++;
        }
        return max;
    }
}
