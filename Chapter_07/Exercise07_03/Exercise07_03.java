/*
(Count occurrence of numbers) Write a program that reads the integers between
1 and 50 and counts the occurrences of each. Assume the input ends with 0. Here
is a sample run of the program:

	Enter the integers between 1 and 50: 2 5 6 5 4 3 23 43 2 0
	2 occurs 2 times
	3 occurs 1 time
	4 occurs 1 time
	5 occurs 2 times
	6 occurs 1 time
	23 occurs 1 time
	43 occurs 1 time


Note if a number occurs more than one time, the plural word "times" is used in
the output.
*/

import java.util.Scanner;

public class Exercise07_03{

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 50: ");
        int[]arr = new int[50];
        for(int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
            if(arr[i] == 0){
                break;
            }
        }
        while(indexOfMin(arr) != -1){
            int frequency = 0;
            int currentMinIndex = indexOfMin(arr);
            int num = arr[currentMinIndex];
            for(int j = arr.length - 1; j >= 0; j--){
                if(arr[currentMinIndex] == arr[j] && arr[j] != 0){
                    frequency++;
                    arr[j] = 0;
                }
            }
            System.out.println(num + " occurs " + frequency + " times");
        }
    }


    public static int indexOfMin(int[]arr){
        int minIndex = arr.length - 1;
        int min = arr[arr.length - 1];
        boolean checkEmpty = false;
        for(int i = arr.length - 1; i >= 0; i--){
            if(min >= arr[i] && arr[i] != 0){
                min = arr[i];
                minIndex = i;
                checkEmpty = true;
            }
            if(min == 0 && arr[i] != 0){
                min = arr[i];
                minIndex = i;
                checkEmpty = true;
            }
        }
        return checkEmpty ? minIndex : -1;
    }
}