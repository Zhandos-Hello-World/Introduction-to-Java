/*
(Math: combinations) Write a program that displays all possible combinations
for picking two numbers from integers 1 to 7. Also display the total number of
all combinations.
    1 2
    1 3
    ...
    ...
    The total number of all combinations is 21

*/

public class Exercise05_43 {

    public static void main(String[] args) {
        int count = 0;
        for(int n_1 = 1; n_1 < 7; n_1++){
            for(int n_2 = n_1 + 1; n_2 <= 7; n_2++){
                System.out.println(n_1 + "  " + n_2);
                count++;
            }
        }
        System.out.print("The total number of all combinations is " + count);
    }
}
