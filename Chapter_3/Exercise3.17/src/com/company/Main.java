package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2): ");
        int input = str.nextInt();
        int a = (int)(Math.random() * (3) + 0);
        if(input >= 0 && input <= 2){
            if(input == a){
                String d;
                switch (a) {
                    case 0:d = "scissor";
                    case 1:d = "rock";
                    case 2:d = "paper";
                    default:d = "";
                }
                System.out.print("The computer is " + d + ". You are " + d + " too. It is a draw");
            }
            else if(input == 2 && a == 0){
                System.out.print("The computer is scissor. You are paper. You lost");
            }
            else if(input == 1 && a == 2){
                System.out.print("The computer is paper. You are rock. You lost");
            }
            else if(input == 2 && a == 1){
                System.out.print("The computer is rock. You are paper. You won");
            }
            else if(input == 0 && a == 1){
                System.out.print("The computer is rock. You are scissor. You lost");
            }
            else if(input == 0 && a == 2){
                System.out.print("The computer paper. You are scissor. You won");
            }
            else if(input == 1 && a == 0) {
                System.out.print("The computer is scissor. You are rock. You won");
            }
        }
        }
    }

