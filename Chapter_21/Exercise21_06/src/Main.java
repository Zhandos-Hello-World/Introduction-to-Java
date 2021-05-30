/*
(Count the occurrences of words/names) Given a problem that is identical to
Programming Exercises 21.2 and 21.3, write a program that will count the number of courses each student attended. In descending order of the number of days
attended, display the names of students and the number of courses each student
has attended. If the number of days attended by any two students is the same,
display their names in ascending order. For example, if both Billy and John
attended classes for 2 days, display Billy: 2 first, and then John: 2.
 */

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Create a list and two sets
        Map<Integer, Integer> map = new HashMap<>(); // Stores results

        // Prompt the user to enter a number of integers
        System.out.println("Enter a number of integers."
                + "\nInput ends when the input is 0:");

        int key;
        while ((key = input.nextInt()) != 0) {
            if (!map.containsKey(key)) {
                map.put(key, 1);
            }
            else {
                int frequency = map.get(key);
                frequency++;
                map.put(key, frequency);
            }
        }

        int max = Collections.max(map.values());
        System.out.print("The most occurrences integers are: ");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                System.out.print(entry.getKey() + " ");
            }
        }
        System.out.println();
    }
}