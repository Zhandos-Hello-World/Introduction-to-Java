package com.company;

public class Main {

    public static void main(String[] args) {
        int score = 0;
        for(int i = 0; i < 10000; i++){
            int num1 = random();
            int num2 = random();
            int sum = num1 + num2;
            System.out.println("You rolled " + num1 + " + " + num2 + " = " + sum);
            if(sum == 2 || sum == 3 || sum == 12){
                System.out.println("You lose");
                System.out.println("-------");

            }
            else if (sum == 7 || sum == 11){
                System.out.println("You win");
                System.out.println("-------");
                score++;
            }
            else{
                System.out.println("point is " + sum);
                output(sum, score);
            }
        }
        System.out.println("---------------------------------");
        System.out.println("You win " + score + " times");
        double percent = ((double) score / 10000.0) * 100;
        System.out.print("The probability is " + doubleOptimization(percent) + " percent");
    }
    public static double doubleOptimization(double percent){
        return Math.round(percent * 100.0) / 100.0;
    }

    public static int random(){
        return (int)(Math.random() * 6) + 1;
    }
    public static void output(int sum, int score){
        int save = sum;
        int num1 = random();
        int num2 = random();
        sum = num1 + num2;
        System.out.println("You rolled " + num1 + " + " + num2 + " = " + sum);
        if(sum == save){
            System.out.println("You win");
            System.out.println("-------");
            score += 1;
        }
        else{
            System.out.println("You lose");
            System.out.println("-------");
        }

    }
}
