package com.company;

public class Main {

    public static void main(String[] args) {
        int c = 0;
        for(int i = 101; i < 2100; i++){
            if(i % 4 == 0){
                if(i % 100 != 0){
                    System.out.print(i + " ");
                    c++;
                }
                else{
                    if(i % 400 == 0){
                        System.out.print(i + " ");
                        c++;
                    }
                }
            }
            if(c == 10){
                System.out.println();
                c = 0;
            }
        }
    }
}
