/*
(Find numbers divisible by 3 and 4) Write a program that displays all the numbers
from 100 to 1,000, ten per line, that are divisible by 3 and 4. Numbers are separated
by exactly one space


*/
public class Exercise05_10 {

    public static void main(String[] args) {
        for(int i = 100; i <= 1000; i += 10){
            if(i % 3 == 0 && i % 4 == 0){
                System.out.println(i);
            }
        }
    }
}
