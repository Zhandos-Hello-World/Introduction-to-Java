package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String a = str.nextLine().toLowerCase();
        char a1 = a.charAt(0);
        char a2 = a.charAt(1);
        int num = Integer.parseInt(String.valueOf(a2));
        String q;
        switch (num){
            case 1:q = "Freshman";break;
            case 2:q = "Sophomore";break;
            case 3:q = "Junior";break;
            case 4:q = "Senior";break;
            default:q = "";break;
        }

        if(a1 == 'm'){
            System.out.print("Mathematics " + q);
        }
        else if(a1 == 'c'){
            System.out.print("Computer Science " + q);
        }
        else if(a1 == 'i'){
            System.out.print("Information Technology " + q);
        }
        else{
            System.out.print("invalid input");
        }
    }
}
