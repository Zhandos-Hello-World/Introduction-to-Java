package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        long a = str.nextLong();
        System.out.print(sqrt(a));
    }
    public static double sqrt(long n){
        long lastGuess = 1;
        long nextGuess = (lastGuess + n / lastGuess) / 2;
        while (nextGuess - lastGuess > 0.0001) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;
        }
        lastGuess = nextGuess;
        return nextGuess = (lastGuess + n / lastGuess) / 2;
    }
}
