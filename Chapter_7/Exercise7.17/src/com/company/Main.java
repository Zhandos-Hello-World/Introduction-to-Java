package com.company;
import java.util.Scanner;
import java.util.Locale;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.print("Enter number students: ");
        int a = str.nextInt();
        String[][]arr = new String[a][2];
        int l = 1;
        str.nextLine();
        for(int i = 0; i < a; i++, l++){
            System.out.print(l + ") Student name is: ");
            String name = str.nextLine();
            arr[i][0] = name;
            System.out.print(l + ") Student score is: ");
            String score = str.nextLine();
            arr[i][1] = score;
        }
        System.out.println("---------------------------");
        l = 1;
        int number = 0;
        for(int i = 0, q = 0; i < a; i++, l++, q++){
            for(int j = 0; j < a; j++){
                if(number < Integer.parseInt(arr[j][1])){
                    number = Integer.parseInt(arr[j][1]);
                }
            }
            for(int o = 0; o < a; o++){
                if(number == Integer.parseInt(arr[o][1])){
                    calc(arr[o][0], arr[o][1], l);
                    arr[o][1] = "0";
                    number = 0;
                }
            }
        }
    }
    public static void calc(String name, String score, int l){
        if(!score.equals("0")){
            System.out.println(l + ") Student name is: " + name);
            System.out.println(l + ") The student score is: " +score);
        }

    }
}
