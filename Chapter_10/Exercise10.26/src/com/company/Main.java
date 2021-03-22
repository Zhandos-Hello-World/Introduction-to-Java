package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String calculate = str.nextLine().replaceAll("\\s+","");
        for(int i = 0; i < calculate.length(); i++){
            if(calculate.charAt(i) == '+'){
                System.out.print(t(calculate, '+'));
            }
            else if(calculate.charAt(i) == '-'){
                System.out.print(t(calculate, '-'));
            }
            else if(calculate.charAt(i) == '*'){
                System.out.print(t(calculate, '*'));
            }
            else if(calculate.charAt(i) == '/'){
                System.out.print(t(calculate, '/'));
            }
        }

    }
    public static String t(String s, char a){
        int num1 = Integer.parseInt(s.substring(0, s.indexOf(a)));
        int num2 = Integer.parseInt(s.substring(s.indexOf(a) + 1));
        int res = 0;
        if(a == '+'){
            res = num1 + num2;
        }
        else if(a == '-'){
            res = num1 - num2;
        }
        else if(a == '*'){
            res = num1 * num2;
        }
        else if(a == '/'){
            res = num1 / num2;
        }
        return num1 + " " + a + " " + num2 + " = " + res;
    }
}
