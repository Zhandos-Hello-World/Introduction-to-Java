package com.company;
import java.util.Scanner;
import java.lang.*;
import static java.lang.Character.isDigit;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String a = str.nextLine();
        String d1 = a.substring(0, 3);
        String d2 = a.substring(4, 6);
        String d3 = a.substring(7);
        if(a.charAt(3) == '-' && a.charAt(6) == '-'){
            if(!isDigit(Integer.parseInt(d1)) && !isDigit(Integer.parseInt(d2))&&
                    !isDigit(Integer.parseInt(d3))){
                System.out.print(a + " is a valid social security number");
            }
            else{
                System.out.print(a + " is an invalid social security number");
            }
        }
        else{
            System.out.print(a + " is an invalid social security number");
        }
    }

}
