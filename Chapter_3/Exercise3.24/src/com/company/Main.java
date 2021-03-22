package com.company;
public class Main {
    public static void main(String[] args) {
        String str = "";
        String str_1 = "";
        int a = (int)(Math.random() *(13) + 1);
        int d = (int)(Math.random() * (4)+ 1);
        switch(a){
            case 1:str = "Ace";break;
            case 2:str = "One";break;
            case 3:str = "Two";break;
            case 4:str = "Three";break;
            case 5:str = "Four";break;
            case 6:str = "Five";break;
            case 7:str = "Six";break;
            case 8:str = "Seven";break;
            case 9:str = "Eight";break;
            case 10:str = "Nine";break;
            case 11:str = "Ten";break;
            case 12:str = "Jack";break;
            case 13:str = "Queen";break;
            case 14:str = "King";break;
        }
        switch (d){
            case 1: str_1 = "Spades"; break;
            case 2: str_1 = "Hearts"; break;
            case 3: str_1 = "Diamonds"; break;
            case 4: str_1 = "Clubs"; break;
        }
        System.out.print("The card you picked is " + str + " of " + str_1);
    }
}
