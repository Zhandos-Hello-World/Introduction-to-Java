package com.company;

public class StackOfIntegers {
    private int num = 0;
    private int[] SaveIntegerPrime;

    StackOfIntegers(){
        this.num = 1;
    }
    StackOfIntegers(int num){
        this.num = num;
    }

    private int size(int number){
        int size = 0;
        for(int i = 2; i <= number; i++){
            boolean check = true;
            for(int j = 2; j <= i; j++){
                if(j != i && i % j == 0){
                    check = false;
                }
            }
            if(check){
                size++;
            }
        }
        return size;
    }

    public int[] primeNumberData(){
        int number = this.num;
        int index = 0;
        SaveIntegerPrime = new int[size(number)];
        for(int i = 2; i <= number; i++){
            boolean check = true;
            for(int j = 2; j <= i; j++){
                if(j != i && i % j == 0){
                    check = false;
                }
            }
            if(check){
                SaveIntegerPrime[index] = i;
                index++;
            }
        }
        return SaveIntegerPrime;
    }

    int getNum(){
        return this.num;
    }
    void setNum(int value){
        this.num = value;
    }


    public void displayPrimeNumber(){
        for(int numbers:primeNumberData()){
            System.out.print(numbers + " ");
        }
    }
    public void displayPrimeNumber(int value){
        this.num = value;
        for(int numbers:primeNumberData()){
            System.out.print(numbers + " ");
        }
    }
}
