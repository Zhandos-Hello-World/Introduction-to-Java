package com.company;
import java.beans.beancontext.BeanContextServiceRevokedEvent;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter ten integers: ");
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            int number = str.nextInt();
            list.add(number);
        }
        removeDuplicate(list);

    }
    public static void removeDuplicate(ArrayList<Integer> list){
        ArrayList<Integer> list1 = new ArrayList<>();
        boolean isOne = false;
        for(int i = 0; i < list.size(); i++){
            boolean check = true;
            if(isOne){
                for(int j = 0; j < list1.size(); j++){
                    if(list1.get(j) == list.get(i)){
                        check = false;
                        break;
                    }
                }
            }
            if(check){
                isOne = true;
                list1.add(list.get(i));
            }
        }
        list.clear();
        System.out.print("The distinct integers are ");
        for(int value:list1){
            System.out.print(value + " ");
        }
        list1.clear();
    }
}
