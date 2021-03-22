package com.company;

public class Main {

    public static void main(String[] args) {
        int num1 = random();
        int num2 = random();
        int sum = num1 + num2;
        System.out.println("You rolled " + num1 + " + " + num2 + " = " + sum);
        if(sum == 2 || sum == 3 || sum == 12){
            System.out.println("You lose");
        }
        else if (sum == 7 || sum == 11){
            System.out.println("You win");
        }
        else{
            System.out.println("point is " + sum);
            output(sum);
        }
    }

    public static int random(){
        return (int)(Math.random() * 6) + 1;

    }
    public static void output(int sum){
        int save = sum;
        int num1 = random();
        int num2 = random();
        sum = num1 + num2;
        System.out.println("You rolled " + num1 + " + " + num2 + " = " + sum);
        if(sum == save){
            System.out.print("You win");
        }
        else{
            System.out.print("You lose");
        }

    }
}
