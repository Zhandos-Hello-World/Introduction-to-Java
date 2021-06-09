/*
(Display prime numbers between 2 and 1,200) Modify Listing 5.15 to display all
the prime numbers between 2 and 1,200, inclusive. Display eight prime numbers
per line. Numbers are separated by exactly one space.

*/

public class Exercise05_20{

    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 196; // Number of primes to display
        final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
        int count = 0; // Count the number of prime numbers
        int number = 2; // A number to be tested for primeness
        System.out.println("The first 50 prime numbers are \n");
        while (true) {
            boolean isPrime = true;
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) { // If true, number is not prime
                isPrime = false; // Set isPrime to false
                break; // Exit the for loop
                }
            }
            if(number >= 1200){
                break;
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
