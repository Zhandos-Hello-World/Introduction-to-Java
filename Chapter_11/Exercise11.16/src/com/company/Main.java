package com.company;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = str.nextInt();
        list.add(answer);
        while(number1 + number2 != answer){
            System.out.print("Wrong answer. Try again. What is "
                                + number1 + " + " + number2 + "? ");
            answer = str.nextInt();
            for(int i = 0; i < list.size(); i++){
                if(answer == list.get(i)){
                    System.out.println("You already entered " + list.get(i));
                    break;
                }
            }
            list.add(answer);
        }
        list.clear();
        System.out.print("You got it!");
    }
}
