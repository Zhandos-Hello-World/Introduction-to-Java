/*
(Business application: checking ISBN) Use loops to simplify Programming
Exercise 3.9.
*/
import java.util.Scanner;
public class Exercise05_36 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int ISBN = input.nextInt();
        int checksum = 0;
        for(int i = 9, divide = 1; i >= 1; i--, divide*=10){
            checksum += (i * ((ISBN / divide) % 10));
        }
        System.out.print("The ISBN-10 number is " + ISBN + ((checksum %= 11) == 10 ? "X": "" + checksum));
    }
}
