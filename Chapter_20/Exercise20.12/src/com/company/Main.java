package com.company;

import java.util.ArrayList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> e = new MyStack<Integer>(new Integer[]{1, 2, 3, 4, 5});
        for(int i = 0; i < 5; i++){
            System.out.print(e.pop() + " ");
        }
        ArrayList<Integer> q = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            q.add(i);
        }
        Stack<Integer> e1 = new MyStack<Integer>(q);
        System.out.println(e1);
    }
}
class MyStack<E> extends Stack<E>{
    MyStack(){
    }
    MyStack(Object[]list){
        for(int i = 0; i < list.length; i++){
            push((E) list[i]);
        }
    }
    MyStack(ArrayList<E> list){
        for(int i = 0; i < list.size(); i++){
            push(list.get(i));
        }
    }
}