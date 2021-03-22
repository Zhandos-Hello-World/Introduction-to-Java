package com.company;
import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        for(int i = 0; i < 1000000; i++){
            int d = (int)(Math.random() * 2) + 1;
            switch (d){
                case 1:System.out.println("Head");break;
                case 2:System.out.println("Tail");break;
            }
        }
    }
}
