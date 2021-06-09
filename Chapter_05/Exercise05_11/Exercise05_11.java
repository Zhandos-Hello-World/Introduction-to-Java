/*
(Find numbers divisible by 3 or 4, but not both) Write a program that displays all
the numbers from 100 to 200, ten per line, that are divisible by 3 or 4, but not both.
Numbers are separated by exactly one space.
*/
public class Exercise05_11{

    public static void main(String[] args) {
        for(int i = 100; i <= 200; i+=10){
            if(i % 3 == 0 ^ i % 4 == 0){
                System.out.println(i);
            }
        }
    }
}
