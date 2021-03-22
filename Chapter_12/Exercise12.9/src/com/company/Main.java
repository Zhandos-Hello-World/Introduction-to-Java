package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String nums = str.next();
        try{
            bin2D(nums);
        }
        catch (BinaryFormatException ex){
            System.out.print(ex.getMessage());
            System.exit(1);
        }
        int save = 0;
        int temp = 1;
        for(int i = nums.length() - 1, j = 0; i >= 0; i--, j++){
            if(j != 0){
                for(int x = 0; x < j; x++){
                    temp *= 2;
                }
            }
            save += Integer.parseInt(String.valueOf(nums.charAt(i))) * temp;
            temp = 1;
        }
        System.out.print(save);
    }
    public static void bin2D(String nums)throws BinaryFormatException{
        boolean check = false;
        for(int i = 0; i < nums.length(); i++){
            int n = Integer.parseInt(String.valueOf(nums.charAt(i)));
            if(n < 0 || n > 1){
                check = true;
                break;
            }
        }
        if(check){
            throw new BinaryFormatException("This number is not decimal number");
        }
    }
}
