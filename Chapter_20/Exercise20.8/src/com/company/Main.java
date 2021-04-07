package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> guesses = new ArrayList<>();


        numbers.add((int)(Math.random() * 10));
        numbers.add((int)(Math.random() * 10));
        numbers.add((int)(Math.random() * 10));

        System.out.print("Enter a three-digit number: ");
        int guess = input.nextInt();

        guesses.add(guess / 100);
        int remainingDigits = guess % 100;
        guesses.add(remainingDigits / 10);
        guesses.add(remainingDigits % 10);

        System.out.print("The lottery number is ");
        for (Integer e: numbers) {
            System.out.print(e);
        }
        System.out.println();


        if (guesses.equals(numbers)) {
            System.out.println("Exact match: you win $10,000");
            System.exit(0);
        }

        if (guesses.containsAll(numbers)) {
            System.out.println("All digits match: you win $3,000");
            System.exit(0);
        }

        Collections.sort(numbers);
        Collections.sort(guesses);

        List<Integer> list1 = Arrays.asList(numbers.get(0), guesses.get(1));
        List<Integer> list2 = Arrays.asList(numbers.get(0), guesses.get(2));
        List<Integer> list3 = Arrays.asList(numbers.get(1), guesses.get(2));
        if (guesses.containsAll(list1) ||
                guesses.containsAll(list2) ||
                guesses.containsAll(list3)) {
            System.out.println("Two digits match: you win $2,000");
        }
    }
}