package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int a = str.nextInt();
        int[] arr = new int[a];
        System.out.print("Enter 4 scores: ");
        for(int i = 0; i < a; i++){
            arr[i] = str.nextInt();
        }
        char grade;
        int best = 0;
        for(int i = 0; i < a; i++){
            if(best < arr[i]){
                best = arr[i];
            }
        }
        for(int i = 0; i < a; i++){
            if(arr[i] >= best - 10)grade = 'A';
            else if(arr[i] >= best - 20)grade = 'B';
            else if(arr[i] >= best - 30)grade = 'C';
            else if(arr[i] >= best - 40)grade = 'D';
            else{
                grade = 'F';
            }
            System.out.println("Student " + i + " score is " + arr[i] + " and grade is " + grade);
        }

    }
}
