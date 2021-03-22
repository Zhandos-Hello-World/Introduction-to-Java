package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String set1 = "1 3 5 7 \n9 11 13 15 \n17 19 21 23 \n25 27 29 31";
        String set2 = "2 3 6 7 \n10 11 14 15 \n18 19 22 23 \n26 27 30 31";
        String set3 = "4 5 6 7 \n12 13 14 15 \n20 21 22 23 \n28 29 30 31";
        String set4 = "8 9 10 11\n12 13 14 15\n24 25 26 27\n28 29 30 31";
        String set5 = "16 17 18 19\n20 21 22 23\n24 25 26 27\n28 29 30 31";
        int day = 0;
        System.out.print("Is your birthday in Set1?\n");
        System.out.print(set1);
        System.out.print("\nEnter 0 for No and 1 for Yes: ");
        String answer = input.nextLine().toLowerCase();
        char res = answer.charAt(0);
        if (res == 'y')
            day += 1;
        System.out.print("\nIs your birthday in Set2?\n");
        System.out.print(set2);
        System.out.print("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextLine().toLowerCase();
        res = answer.charAt(0);
        if (res == 'y')
            day += 2;

        System.out.print("Is your birthday in Set3?\n");
        System.out.print(set3);
        System.out.print("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextLine().toLowerCase();
        res = answer.charAt(0);

        if (res == 'y')
            day += 4;

        System.out.print("\nIs your birthday in Set4?\n");
        System.out.print(set4);
        System.out.print("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextLine().toLowerCase();
        res = answer.charAt(0);
        if (res == 'y')
            day += 8;
        System.out.print("\nIs your birthday in Set5?\n");
        System.out.print(set5);
        System.out.print("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextLine().toLowerCase();
        res = answer.charAt(0);

        if (res == 'y')
            day += 16;

        System.out.println("\nYour birthday is " + day + "!");
        }
}
