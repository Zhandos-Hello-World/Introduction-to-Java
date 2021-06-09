/*
(Find the smallest n such that n^3 > 12,000) Use a while loop to find the smallest
integer n such that n^3 is greater than 12,000
*/

public class Exercise05_12{

    public static void main(String[] args) {
        int i = 1;
        while ((int)(Math.pow(i, 3)) < 12000){
            i++;
        }
        System.out.print(--i);
    }
}
