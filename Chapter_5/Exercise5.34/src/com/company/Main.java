package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int w = 1;
        int YouScore = 0;
        int ComputerScore = 0;
        while(w <= 2){
            System.out.print(w + ") scissor (0), rock (1), paper (2): ");
            int input = str.nextInt();
            int a = (int)(Math.random() * (3) + 0);
            if(input >= 0 && input <= 2){
                if(input == a){
                    String d;
                    switch (a) {
                        case 0:d = "scissor";break;
                        case 1:d = "rock";break;
                        case 2:d = "paper";break;
                        default:d = "";break;
                    }
                    System.out.println("The computer is " + d + ". You are " + d + " too. It is a draw");
                }
                else if(input == 2 && a == 0){
                    System.out.println("The computer is scissor. You are paper. You lost");
                    ComputerScore += 1;
                }
                else if(input == 1 && a == 2){
                    System.out.println("The computer is paper. You are rock. You lost");
                    ComputerScore += 1;
                }
                else if(input == 2 && a == 1){
                    System.out.println("The computer is rock. You are paper. You won");
                    YouScore += 1;
                }
                else if(input == 0 && a == 1){
                    System.out.println("The computer is rock. You are scissor. You lost");
                    ComputerScore += 1;
                }
                else if(input == 0 && a == 2){
                    System.out.println("The computer paper. You are scissor. You won");
                    YouScore += 1;
                }
                else if(input == 1 && a == 0) {
                    System.out.println("The computer is scissor. You are rock. You won");
                    YouScore += 1;
                }
            }
            if(w < 2){
                System.out.println("--------------------------------------------------------");
            }
            w++;
        }
        System.out.println("----------------------------------------------");
        if(YouScore == ComputerScore){
            System.out.print("Dead heat");
        }
        else if(YouScore > ComputerScore){
            System.out.print("You won");
        }
        else{
            System.out.print("You lost");
        }
    }
}
