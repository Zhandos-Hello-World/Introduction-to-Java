package com.company;

public class MyInteger {
    private int value = 0;

    //This is constructor
    MyInteger(int value){
        this.value = value;
    }
    // This is getter method
    int getValue(){
        return this.value;
    }
    // These are methods
    boolean isEven(){
        return value % 2 == 0;
    }
    boolean isOdd(){
        return !isEven();
    }
    boolean isPrime(){
        if(value == 2){
            return true;
        }
        if(value > 1){
            for(int i = 2; i < value; i++){
                    if(value % i == 0){
                        return false;
                }
            }
            return true;
        }
        else{
            return false;
        }
    }

    // These are static methods
    public static boolean isEven(int value){
        return value % 2 == 0;
    }
    public static boolean isOdd(int value){
        return !isEven(value);
    }
    public static boolean isPrime(int value){
        if(value == 2){
            return true;
        }
        if(value > 1){
            for(int i = 2; i < value; i++){
                if(value % i == 0){
                    return false;
                }
            }
            return true;
        }
        else{
            return false;
        }
    }


    public static boolean isEven(MyInteger myInteger){
        return myInteger.getValue() % 2 == 0;
    }
    public static boolean isOdd(MyInteger myInteger){
        return !isEven(myInteger);
    }
    public static boolean isPrime(MyInteger myInteger){
        return isPrime(myInteger.getValue());
    }


    boolean equals(MyInteger myInteger){
        return value == myInteger.getValue();
    }
    boolean equals(int value){
        return this.value == value;
    }

    public static int parseInt(char[] arr){
        int sum = 0;
        for (char i : arr) {
            sum += Character.getNumericValue(i);
        }
        return sum;
    }
    public static int parseInt(String StringNumber){
        return Integer.parseInt(StringNumber);
    }
}
