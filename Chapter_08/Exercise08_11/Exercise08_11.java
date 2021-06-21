/*
(Game: nine heads and tails) Nine coins are placed in a 3-by-3 matrix with some
face up and some face down. You can represent the state of the coins using a
3-by-3 matrix with values 0 (heads) and 1 (tails). Here are some examples:

    0 0 0   1 0 1   1 1 0   1 0 1   1 0 0
    0 1 0   0 0 1   1 0 0   1 1 0   1 1 1
    0 0 0   1 0 0   0 0 1   1 0 0   1 1 0

Each state can also be represented using a binary number. For example, the preceding matrices correspond to the numbers

    000010000 101001100 110100001 101110100 100111110

There are a total of 512 possibilities, so you can use decimal numbers 0, 1, 2,
3, . . . , and 511 to represent all states of the matrix. Write a program that prompts
the user to enter a number between 0 and 511 and displays the corresponding
matrix with the characters H and T. Here is a sample run:

    Enter a number between 0 and 511: 7
    H H H
    H H H
    T T T
*/
import java.util.Scanner;
public class Exercise08_11{

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String a = "";
        System.out.print("Enter a number between 0 and 511: ");
        int w = str.nextInt();
        if(w >= 0 && w <= 511){
            for(int i = w; i >= 1; i /= 2){
                a += String.valueOf(i % 2);
            }
        }
        int x = 0;
        for(int i = 0; i < 9 - a.length(); i++){
            if(x % 3 == 0 && x != 0){
                System.out.println();
            }
            System.out.print("H ");
            x++;
        }
        for(int i = a.length() - 1; i >= 0; i--){
            if(x % 3 == 0){
                System.out.println();
            }
            if(a.charAt(i) == '0'){
                System.out.print("H ");
            }
            else if(a.charAt(i) == '1'){
                System.out.print("T ");
            }
            x++;
        }
    }
}
