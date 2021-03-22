package com.company;

public interface Stack {
    boolean isEmpty();
    int getSize();
    Object peek();
    Object pop();
    void push(Object o);
    String toString();

}
