package com.company;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        ArrayList<Number> list = new ArrayList<>();
        list.add(2);
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        sort(list);
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    public static void sort(ArrayList<Number> list){
        boolean check = true;
        while(check){
            check = false;
            for(int i = 1; i < list.size(); i++){
                if(list.get(i).doubleValue() < list.get(i - 1).doubleValue()){
                    Number temp = list.get(i);
                    Number temp1 = list.get(i - 1);
                    list.remove(i - 1);
                    list.add(i - 1, temp);
                    list.remove(i);
                    list.add(i, temp1);
                    check = true;
                }
            }
        }
    }
}
