package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = str.nextInt();
        System.out.print("Enter a month: ");
        String month = str.next().substring(0, 3).toLowerCase();
        boolean w = false;
        int q = 0;
        if(month.equals("jan") || month.equals("mar") || month.equals("may")
                || month.equals("jul") || month.equals("aug") || month.equals("oct") || month.equals("dec")){
            q = 31;
            w = true;
        }
        else if(month.equals("feb") || month.equals("apr") || month.equals("jun") ||
                month.equals("sep") || month.equals("nov")){
            if(month.equals("feb") && year % 4 == 0){
                q = 29;
            }
            else{
                q = 30;
            }
            w = true;
        }
        else{
            System.out.print("wrong input");
        }
        if(w){
            char j = month.toUpperCase().charAt(0);
            String monthOutput1 = j + month.toLowerCase().substring(1);
            System.out.print(monthOutput1 + " " + year + " has " + q + " days");
        }
    }
}
