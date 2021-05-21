/*
(Create Stack from list) Define a class MyStack that extends Stack to be
able to have its constructor use a list of objects instead of pushing each object
individually.
 */

import java.util.Stack;

public class Main {
    public static void main(String[]args){
        Integer[]integers = {23, 43, 64, 54};
        MyStack<Integer> myStack = new MyStack<>(integers);
        while(!myStack.isEmpty()){
            System.out.println(myStack.pop());
        }

    }
}
class MyStack<T> extends Stack<T>{
    MyStack(T...arr){
        for(T value:arr){
            push(value);
        }
    }
}
