package com.company;
import java.util.Scanner;
public class StackOfIntegers {
    private int[]arr = new int[1];
    private int num;
    StackOfIntegers(int num){
        this.num = num;
    }
    StackOfIntegers(){
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a number: ");
        this.num = str.nextInt();
    }

    int[] findAllDivisor(){
        int size = 1;
        int[]temp;
        while(num != 1){
            for(int i = 2; i <= num; i++){
                if(num == 1){
                    break;
                }
                if(num % i == 0){
                    num /= i;
                    temp = new int[size];
                    for(int j = 0; j < arr.length; j++){
                        temp[j] = arr[j];
                    }
                    temp[temp.length - 1] = i;
                    arr = new int[size];
                    for(int j = 0; j < arr.length; j++){
                        arr[j] = temp[j];
                    }
                    size++;
                    i--;
                }

            }
        }
        return arr;
    }

    void OutputAllDivisor(){
        for(int value : findAllDivisor()){
            System.out.print(value + " ");
        }
    }

    void findAllDivisor(int num){
        this.num = num;
        findAllDivisor();
    }


    void setNum(int num){
        this.num = num;
    }
    int getNum(){
        return num;
    }
    int[] getArr(){
        return arr;
    }
}

