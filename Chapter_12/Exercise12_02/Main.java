/*
(ArrayIndexOutOfBoundsException) Using the two arrays shown below,
write a program that prompts the user to enter an integer between 1 and 12 and
then displays the months and its number of days corresponding to the integer
entered. Your program should display “wrong number” if the user enters a
wrong number by catching ArrayIndexOutOfBoundsException.
*/
import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String[] months = {"January", "February", "March", "April",
                "May", "June","July", "August", "September", "October","November", "December"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        try{
            int index = input.nextInt();
            System.out.print(months[index] + " has " + dom[index] + " days");
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.print("wrong number");
        }
    }
}