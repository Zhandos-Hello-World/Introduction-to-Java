package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner str = new Scanner(System.in);
	    String s = str.next();
	    System.out.print(sort(s));
    }
    public static String sort(String s){
        char []arr = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            arr[i] = s.charAt(i);
        }
        Arrays.sort(arr);
        String result = "";
        for(int i = 0; i < arr.length; i++){
            result = result.concat(String.valueOf(arr[i]));
        }
        return result;
    }
}
