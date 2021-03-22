package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        for(int n_1 = 1; n_1 < 7; n_1++){
            for(int n_2 = n_1 + 1; n_2 <= 7; n_2++){
                System.out.println(n_1 + "  " + n_2);
                count++;
            }
        }
        System.out.print("The total number of all combinations is " + count);
    }
}
