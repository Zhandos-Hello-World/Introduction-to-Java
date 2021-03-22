package com.company;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        try{
            while(true){
                list.add((int)(Math.random()));
            }
        }
        catch(OutOfMemoryError ex){
            System.out.print(ex.getMessage() + " and it's problem");
        }
    }
}
