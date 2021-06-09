/*
(Find the factors of an integer) Write a program that reads an integer and displays
all its smallest factors in an increasing order. For example, if the input integer is
120, the output should be as follows: 2, 2, 2, 3, 5


*/
import java.util.Scanner;
public class Exercise05_16  {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int divisor = 2;
        while(!(number <= 1) && divisor <= number){
            if(number % divisor == 0){
                System.out.print(divisor + " ");
                number /= divisor;
            }
            else{
                divisor++;
            }
        }
    }
}
