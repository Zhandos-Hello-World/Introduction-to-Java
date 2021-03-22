package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100: ");
        int i = 0;
        int []arr = new int[100];
        while(i < 99){
            int a = str.nextInt();
            if(a == 0){
                break;
            }
            arr[i] = a;
            i++;
        }
        Arrays.sort(arr);
        int[] arr_2 = new int[i+1];
        int q = 0;
        for(int s = 0; s < arr.length; s++){
            if(arr[s] == 0){
                continue;
            }
            else{
                arr_2[q] = arr[s];
                q++;
            }
        }
        arr_2[i] = 0;
        q = 0;
        int number = 0;
        boolean ft = false;
        String t = " time";
        for(int l = 0; l < arr_2.length; l++){
            if(number != arr_2[l]){
                number = arr_2[l];
                if(ft){
                    if(q > 1){
                        t = " times";
                    }
                    else{
                        t = " time";
                    }
                    System.out.println(arr_2[l-1] + " occurs " + q + t);
                    q = 0;
                }
                ft = true;
                q++;
            }
            else if(number == arr_2[l]){
                q++;
            }
            else{
                System.out.print(arr_2[l]  + " occurs 1 times");
            }
        }


    }
}
