package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int highScore = 0;
        String nameScore = "";
        int a = str.nextInt();
        for(int i = 1; i <= a; i++){
            str.nextLine();
            System.out.print(i + ") Student name is: ");
            String NameStudent = str.nextLine();
            System.out.print(i + ") Student score is: ");
            int score = str.nextInt();
            if(i == 0){
                highScore = score;
                nameScore = NameStudent;
            }
            else{
                if(highScore < score){
                    highScore = score;
                    nameScore = NameStudent;
                }
            }
        }
        System.out.println("----------------------------------");
        System.out.println("The student with the highest score");
        System.out.println("Student name is: " + nameScore);
        System.out.println("Score is: " + highScore);
        System.out.println("----------------------------------");
    }
}
