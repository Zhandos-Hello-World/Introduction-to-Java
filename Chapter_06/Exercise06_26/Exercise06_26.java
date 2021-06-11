/*
(Palindromic prime) A palindromic prime is a prime number and also palindromic.
For example, 131 is a prime and also a palindromic prime, as are 313 and 757.
Write a program that displays the first 120 palindromic prime numbers. Display
10 numbers per line, separated by exactly one space, as follows:
2 3 5 7 11 101 131 151 181 191
313 353 373 383 727 757 787 797 919 929

*/

public class Exercise06_26 {
    public static void main(String[]args) {
        printPalindromePrimeNum(120);
    }
    public static void printPalindromePrimeNum(int length){
        int number = 2, count = 1;
        while(count != length){
            if(isPalindrome(number) && isPrime(number)){
                System.out.print(number + " ");
                count++;
                if(count % 10 == 0){
                    System.out.println();
                }
            }
            number++;
        }
    }


    public static boolean isPalindrome(int num){
        return num == reverse(num);
    }
    public static int reverse(int num){
        int divide = 10;
        String result = "";
        while(num != 0){
            result += String.valueOf(num % divide);
            num /= divide;
        }
        return Integer.parseInt(result);
    }
    public static boolean isPrime(int num){
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}