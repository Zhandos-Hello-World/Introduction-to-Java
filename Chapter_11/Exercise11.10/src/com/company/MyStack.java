package com.company;
import java.util.ArrayList;

public class MyStack {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty(){
        return list.isEmpty();
    }
    public int getSize(){
        return list.size();
    }
    public Object peek(){
        return list.get(getSize() - 1);
    }
    public Object pop(){
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }
    public void push(Object o){
        list.add(o);
    }

    Object getArrList(){
        return list;
    }


    int[] getListWithArr(){
        int[]arr = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            arr[i] = Integer.parseInt(String.valueOf(list.get(i)));
        }
        return arr;
    }


    public void DisplayArr(){
        for(Object value : list){
            System.out.print(value + " ");
        }
    }

    @Override
    public String toString(){
        return "stack: " + list.toString();
    }
}

