package com.company;

public class Main {

    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 168; // Number of primes to display
        final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
        int count = 0; // Count the number of prime numbers
        int number = 2; // A number to be tested for primeness
        System.out.println("The first 50 prime numbers are \n");
        while (count < NUMBER_OF_PRIMES) {
            boolean isPrime = true;
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) { // If true, number is not prime
                isPrime = false; // Set isPrime to false
                break; // Exit the for loop
                }
            }
            if (isPrime) {
                count++;
                 if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                     System.out.println(number);
                 }
                 else
                    System.out.print(number + " ");
            }
            number++;
        }

    }
}
