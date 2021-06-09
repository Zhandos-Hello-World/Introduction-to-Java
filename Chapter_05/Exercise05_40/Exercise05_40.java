/*
(Simulation: heads or tails) Write a program that simulates flipping a coin two
millions times and displays the number of heads and tails
*/

public class Exercise05_40{

    public static void main(String[] args) {
        for(int i = 0; i < 2000000; i++){
            System.out.println((((int)(Math.random() * 2) + 1) == 1 ? "Head": "Tail"));
        }
    }
}
