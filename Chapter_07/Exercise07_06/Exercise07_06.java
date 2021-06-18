/*
(The Sieve of Eratosthenes) The Sieve of Eratosthenes is an algorithm that finds all
prime numbers up to a given limit, n. It works by creating an array of Booleans,
flag, of size n+1, initializing the array to true (assuming every number is a
prime number in the beginning), and iteratively traversing the numbers from 2
to n, setting the values of indices that are multiples of other numbers to false.
Write a program using the algorithm above, and display all the prime numbers
up to 50.	
*/

public class Exercise07_06{
	public static void main(String[]args){
        int n = 50;
        sieveOfEratosthenes(n);
	}
   	public static void sieveOfEratosthenes(int n) {
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;

        for (int p = 2; p * p <= n; p++) {
            if (prime[p] == true) {
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }

        for (int i = 2; i <= n; i++) {
            if (prime[i] == true)
                System.out.print(i + " ");
        }
    }
}