/*

(Emirp) An emirp (prime spelled backward) is a nonpalindromic prime number
whose reversal is also a prime. For example, 17 is a prime and 71 is a prime, so
17 and 71 are emirps. Write a program that displays the first 120 emirps. Display
10 numbers per line, separated by exactly one space, as follows:
13 17 31 37 71 73 79 97 107 113
149 157 167 179 199 311 337 347 359 389

*/

public class Exercise06_27{
    public static void main(String[]args) {
        printEmirpNum(120);
    }
    public static void printEmirpNum(int length){
        int number = 2, count = 1;
        while(count != length){
            if(isNotPalindrome(number) && isPrime(number) && isPrime(reverse(number))){
                System.out.print(number + " ");
                count++;
                if(count % 10 == 0){
                    System.out.println();
                }
            }
            number++;
        }
    }


    public static boolean isNotPalindrome(int num){
        return num != reverse(num);
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