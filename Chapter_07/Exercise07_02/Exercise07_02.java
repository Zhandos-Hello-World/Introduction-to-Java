/*
(Comparing numbers) Write a program that reads 11 integers, compares each
integer with the 11th integer, and displays whether the integers are "greater",
"smaller", or "equal" to the 11th integer
*/
import java.util.Scanner;

public class Exercise07_02{

	public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 11 integers: ");
        int[]arr = new int[11];
        for(int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(i + ") " + max11th(arr, i) + " than " + arr[10]);
        }

    }
    public static String max11th(int[]arr, int index){
        if(arr[index] > arr[10]){
            return "greater";
        }
        else if(arr[index] < arr[10]){
            return "smaller";
        }
        return "equal";
    }
}