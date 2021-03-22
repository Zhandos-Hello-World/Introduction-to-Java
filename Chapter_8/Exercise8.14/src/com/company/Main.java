package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter the size for the matrix: ");
        int range = str.nextInt();
        int[][]arr = new int[range][range];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                arr[i][j] = (int)(Math.random() * 2 + 0);
            }
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        if(!f(arr, 0, false) && !f(arr, 1, false)){
            System.out.println("No same numbers on a row");
        }
        else{
            if(f(arr, 0, false)){
                System.out.println("All 0s on row " + check(arr, 0, false));
            }
            else{
                System.out.println("No same numbers on a row(0s)");
            }
            if(f(arr, 1, false)){
                System.out.println("All 1s on row " + check(arr, 1, false));
            }
            else{
                System.out.println("No same numbers on a row(1s)");
            }
        }
        if(!f(arr, 1, true) && !f(arr, 0, true)){
            System.out.println("No same numbers on a column");
        }
        else{
            if(f(arr, 0, true)){
                System.out.println("All 0s on column " + check(arr, 0, true));
            }
            else{
                System.out.println("No same numbers on a column(0s)");
            }
            if(f(arr, 1, true)){
                System.out.println("All 1s on column " + check(arr, 1, true));
            }
            else{
                System.out.println("No same numbers on a column(1s)");
            }
        }

        if(checkDiagonal(arr, false)){
            System.out.println("Same numbers on the sub-diagonal");
        }
        else{
            System.out.println("No same numbers on the sub-diagonal");
        }
        if(checkDiagonal(arr, true)){
            System.out.println("Same numbers on the major diagonal");
        }
        else{
            System.out.println("No same numbers on the major diagonal");
        }


    }

    public static boolean checkDiagonal(int [][]arr, boolean a){
        if(a){
            boolean check = true;
            int num = 1;
            for(int i = 0; i < arr.length; i++){
                for(int j = i + 1; j < i + 2; j++){
                    if(num != j){
                        check = false;
                        break;
                    }
                }
            }
            if(check){
                return check;
            }
            else{
                for(int i = arr.length - 1; i >= 0; i --){
                    for(int j = 0; j < arr.length; j++){
                        if(num != arr[i][j]){
                            check = false;
                            return false;
                        }
                    }
                }
                return true;
            }
        }
        else{
            boolean check = true;
            int num = 0;
            for(int i = 0; i < arr.length; i++){
                for(int j = i + 1; j < i + 2; j++){
                    if(num != j){
                        check = false;
                        break;
                    }
                }
            }
            if(check){
                return check;
            }
            else{
                for(int i = arr.length - 1; i >= 0; i --){
                    for(int j = 0; j < arr.length; j++){
                        if(num != arr[i][j]){
                            check = false;
                            return false;
                        }
                    }
                }
                return true;
            }
        }

    }

    public static int check(int[][]arr, int t, boolean s){
        if(s){
            int q = 0;
            boolean a = false;
            int numIndex = 0;
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr.length; j++){
                    if(arr[j][i] == t)
                        q++;
                }
                if(q == arr.length){
                    numIndex = i;
                    a = true;
                    break;
                }
                q = 0;
            }
            return numIndex;
        }
        else{
            int q = 0;
            boolean a = false;
            int numIndex = 0;
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr.length; j++){
                    if(arr[i][j] == t)
                        q++;
                }
                if(q == arr.length){
                    numIndex = i;
                    a = true;
                    break;
                }
                q = 0;
            }
            return numIndex;
        }
    }
    public static boolean f(int[][]arr, int t, boolean s){
        if(s){
            int q = 0;
            boolean a = false;
            int numIndex = 0;
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr.length; j++){
                    if(arr[j][i] == t)
                        q++;
                }
                if(q == arr.length){
                    numIndex = i;
                    a = true;
                    break;
                }
                q = 0;
            }
            return a;
        }
        else{
            int q = 0;
            boolean a = false;
            int numIndex = 0;
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr.length; j++){
                    if(arr[i][j] == t)
                        q++;
                }
                if(q == arr.length){
                    numIndex = i;
                    a = true;
                    break;
                }
                q = 0;
            }
            return a;
        }

    }
}
