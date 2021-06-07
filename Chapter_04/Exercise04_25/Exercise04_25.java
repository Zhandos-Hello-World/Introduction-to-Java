/*
(Generate vehicle plate numbers) Assume that a vehicle plate number consists of
three uppercase letters followed by four digits. Write a program to generate a plate
number.

*/

public class Exercise04_25 {

    public static void main(String[] args) {
        int a = 1000 + (int)(Math.random() * 9000);
        System.out.print("ABC" + a);
    }
}
