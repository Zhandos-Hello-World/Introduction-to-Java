/*
(Statistics: compute mean and standard deviation) In business applications, you
are often asked to compute the mean and standard deviation of data. The mean is
simply the average of the numbers. The standard deviation is a statistic that tells
you how tightly all the various data are clustered around the mean in a set of data.
For example, what is the average age of the students in a class? How close are the
ages? If all the students are the same age, the deviation is 0.
Write a program that prompts the user to enter 10 numbers and displays the mean
and standard deviations of these numbers using the following formula:

    Enter 10 numbers: 1 2 3 4.5 5.6 6 7 8 9 10
    The mean is 5.61
    The standard deviation is 2.99794
*/
import java.util.Scanner;
public class Exercise05_45{

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double mean = 0, mean_2 = 0;
        for(int i = 1; i <= 10; i++){
            double n_numbers = str.nextDouble();
            mean += n_numbers;
            mean_2 += Math.pow(n_numbers, 2);
        }
        double deviation = Math.sqrt((mean_2 - (Math.pow(mean, 2) / 10.0)) /(10.0 - 1.0));
        mean /= 10.0;
        System.out.println("The mean is " + mean);
        deviation *= 100000;
        deviation = Math.round(deviation);
        deviation /= 100000;
        System.out.println("The standard deviation is " + deviation);

    }
}
