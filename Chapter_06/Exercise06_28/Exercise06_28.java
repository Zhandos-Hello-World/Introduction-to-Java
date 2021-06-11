/*
(Mersenne prime) A prime number is called a Mersenne prime if it can be written
in the form 2 p - 1 for some positive integer p. Write a program that finds all
Mersenne primes with p … 31 and displays the output as follows:
p       2^p - 1
_______________
2       3
3       7
5       31
...
*/

public class Exercise06_28{
    
    public static void main(String[] args) {
        System.out.printf("%-8s%-7s\n", "p", "2^p - 1");
        System.out.println("_______________");
        for(int p = 2; p <= 31; p++){
            if(isPrime(p)){
                System.out.printf("%-8d%-7d\n", p, (int)Math.pow(2, p) - 1);
            }
        }
    }
    public static boolean isPrime(int number){
        for(int i = 2; i < number; i++)
            if(number % i == 0)
                return false;
        return true;
    }
}
