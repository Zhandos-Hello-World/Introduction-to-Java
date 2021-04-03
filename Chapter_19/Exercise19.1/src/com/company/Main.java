package com.company;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        GenericStack<String> s = new GenericStack<>();
        s.push("Hello");
        s.push("Hi");
        s.push("How are you?");
        System.out.println(s.toString());
        GenericStack<Integer> i = new GenericStack<>();
        i.push(3);
        i.push(4);
        System.out.println(i.toString());
        GenericStack<Number> numbers = new GenericStack<>();
        numbers.push(32);
        numbers.push(15.2);
        numbers.push(131.3f);
        numbers.push(new BigInteger("42222222333333344"));
        System.out.println(numbers.peek());
        System.out.println(numbers.toString());
        numbers.pop();
        System.out.print(numbers.toString());
    }
}
class GenericStack<E>{
    private E[]stack;
    private int i = 0;
    public int getSize(){
        if(stack == null){
            return 0;
        }
        return stack.length;
    }
    public E peek(){
        return stack[stack.length - 1];
    }
    public void push(E o){
        i++;
        E[]temp = (E[])new Object[i];
        for(int i = 0; i < this.i - 1; i++){
            temp[i] = stack[i];
        }
        temp[this.i - 1] = o;
        stack = temp;
    }
    public E pop(){
        E o = stack[getSize() - 1];
        E[] temp = (E[])new Object[getSize() - 1];
        for(int i = 0; i < getSize() - 1; i++){
            temp[i] = stack[i];
        }
        stack = temp;
        return o;
    }
    public boolean isEmpty(){
        return stack.length == 0;
    }
    @Override
    public String toString(){
        String str = "[";
        String q = ", ";
        for(int i = 0; i < getSize(); i++) {
            if(i == getSize() - 1){
                q = "]";
            }
            str = str.concat(stack[i] + q);
        }
        return "stack: " + str;
    }
}
