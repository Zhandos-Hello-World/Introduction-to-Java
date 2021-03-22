package com.company;
import java.util.Scanner;
public class Account {
    private int[]SaveData = {100, 100, 100, 100, 100, 100, 100, 100, 100, 100};

    void run(){
        Scanner str = new Scanner(System.in);
        while(true){
            System.out.print("Enter an id: ");
            int Index = str.nextInt();
            boolean check = true;
            while(check){
                System.out.print("Main menu\n" +
                        "1: check balance\n" +
                        "2: withdraw\n" +
                        "3: deposit\n" +
                        "4: exit\n" + "Enter a choice: ");
                int choice;
                while(true){
                    choice = str.nextInt();
                    if(choice >= 1 && choice <=4) {
                        break;
                    }
                    else{
                        System.out.println("Enter a correct id");
                        System.out.print("Enter an id: ");
                    }
                }
                if(choice == 1){
                    System.out.print("The balance is " + getAmount(Index));
                }
                else if(choice == 2){
                    System.out.print("Enter an amount to withdraw: ");
                    int amount = str.nextInt();
                    setAmountSubtract(Index, amount);
                }
                else if(choice == 3){
                    System.out.print("Enter an amount to deposit: ");
                    int amount = str.nextInt();
                    setAmountAddition(Index, amount);
                }
                else{
                    check = false;
                }
                System.out.println();
            }
        }
    }
    int getAmount(int Index){
        return SaveData[Index - 1];
    }
    void setAmountSubtract(int Index, int amount){
        SaveData[Index - 1] -= amount;
    }
    void setAmountAddition(int Index, int amount){
        SaveData[Index - 1] += amount;
    }


}
