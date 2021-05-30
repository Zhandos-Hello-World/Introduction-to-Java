/*
(Addition quiz) Rewrite Programming Exercise 11.16 to store the answers in a set
rather than a list.
 */

import java.util.LinkedHashSet;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        LinkedHashSet<Integer> list = new LinkedHashSet<>();
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = str.nextInt();
        list.add(answer);
        while(number1 + number2 != answer){
            System.out.print("Wrong answer. Try again. What is "
                    + number1 + " + " + number2 + "? ");
            answer = str.nextInt();
            for(int i = 0; i < list.size(); i++){
                Integer[]rightAnswer = {0};
                list.forEach(e-> {
                    rightAnswer[0] = e;
                });

                if(answer == rightAnswer[0]){
                    System.out.println("You already entered " + rightAnswer[0]);
                    break;
                }
            }
            list.add(answer);
        }
        list.clear();
        System.out.print("You got it!");
    }
}
