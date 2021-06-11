/*
(Twin primes) Twin primes are a pair of prime numbers that differ by 2. For
example, 3 and 5 are twin primes, 5 and 7 are twin primes, and 11 and 13 are
twin primes. Write a program to find all twin primes less than 1,200. Display the
output as follows:
(3, 5)
(5, 7)
...

*/

public class Exercise06_29{

    public static void main(String[] args) {
        int d = 2, i = 0;
        while(i < 1200){
            if(isPrime(d) && isPrime(d+2)){
                System.out.println("(" + d + ", " + (int)(d + 2)+ ")");
                i++;
            }
            d++;
        }
    }
    public static boolean isPrime(int number){
        for(int i = 2; i < number; i++)
            if(number % i == 0)
                return false; 

        return true;
    }
}

