package com.company;

public class IllegalTriangleException extends Exception{
    IllegalTriangleException(){
    }
    String message(){
        return "Triangle Error";
    }
}
