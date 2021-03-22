package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a hex number: ");
        String hex = str.nextLine();
        try{
            hex2D(hex);
            hexToDecimal(hex.toUpperCase());
            System.out.println("The decimal value for hex number " +
                    hex + " is " + hexToDecimal(hex.toUpperCase()));
        }
        catch (HexFormatException ex){
            System.out.print(ex.getMessage());
        }
    }

    public static int hexToDecimal(String hex) {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++){
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }
    public static int hexCharToDecimal(char ch){
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else
            return ch - '0';
    }
    public static void hex2D(String hex) throws HexFormatException{
        hex = hex.toUpperCase();
        boolean check = false;
        for(int i = 0; i < hex.length(); i++){
            if((hex.charAt(i) < 'A' || hex.charAt(i) > 'F') ||
                    (hex.charAt(i) < '0' && hex.charAt(i) > '9')){
                check = true;
            }
        }
        if(check){
            throw new HexFormatException("This number is not hex");
        }
    }

}
