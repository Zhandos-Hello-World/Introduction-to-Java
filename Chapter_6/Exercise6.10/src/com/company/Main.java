package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("The first 170 prime numbers are \n");
        int number = f(1000);
        printPrimeNumbers(number);
    }
    public static int f(int number){
        int count = 1;
        boolean a = true;
        for(int i = 1; i < number; i++){
            for(int j = 1; j < i; j++){
                if(i % j == 0 && j != 1){
                    a = false;
                }
            }
            if(a){
                count++;
            }
            a = true;
        }
        return count;
    }
    public static void printPrimeNumbers(int numberOfPrimes) {
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        int number = 0;

        while (count < numberOfPrimes) {
            if (isPrime(number)) {
                count++;
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    System.out.printf("%-5s\n", number);
                }
                else
                    System.out.printf("%-5s", number);
            }
            number++;
        }
    }
    public static boolean isPrime(int number){
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
