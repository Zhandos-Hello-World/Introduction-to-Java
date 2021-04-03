package com.company;

import java.math.BigInteger;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        GenericStack<Number> numbers = new GenericStack<>();
        numbers.push(32);
        numbers.push(15.2);
        numbers.push(131.3f);
        numbers.push(new BigInteger("42222222333333344"));
        numbers.reverse();
        System.out.println(numbers.pop());
        System.out.println(numbers.toString());
    }
}

class GenericStack<E> extends ArrayList<E>{
    public E peek(){
        return get(size() - 1);
    }
    public E pop(){
        E o = get(size() - 1);
        remove(size() - 1);
        return o;
    }
    public int getSize(){
        return super.size();
    }
    public void push(E o){
        add(o);
    }
    public boolean isEmpty(){
        return super.isEmpty();
    }
    public void reverse(){
        ArrayList<E> temp = new ArrayList<>();
        for(int i = getSize() - 1; i >= 0; i--){
            temp.add(get(i));
        }
        clear();
        addAll(temp);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

