package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter list1: ");
        int n1 = str.nextInt();
        int []list1 = new int[n1];
        for(int i = 0; i < n1; i++){
            list1[i] = str.nextInt();
        }
        System.out.print("Enter list2: ");
        int n2 = str.nextInt();
        int []list2 = new int[n2];
        for(int i = 0; i < n2; i++){
            list2[i] = str.nextInt();
        }
        int []resultSort = merge(list1, list2);
        System.out.print("The merged list is ");
        for(int value:resultSort){
            System.out.print(value + " ");
        }
    }
    public static int[] merge(int[] list1, int[] list2){
        int []res = new int[list1.length + list2.length];
        int x1 = 0, x2 = 0;
        for(int i = 0; i < res.length; i++){
            if(i >= list1.length){
                res[i] = list2[x2];
                x2++;
            }
            else{
                res[i] = list1[x1];
                x1++;
            }
        }
        Arrays.sort(res);
        return res;
    }
}
