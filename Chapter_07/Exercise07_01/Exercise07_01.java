/*
(Assign grades) Write a program that reads student scores, gets the best score, and
then assigns grades based on the following scheme:
Grade is A if score is >= best -5
Grade is B if score is >= best -10;
Grade is C if score is >= best -15;
Grade is D if score is >= best -20;
Grade is F otherwise.
The program prompts the user to enter the total number of students, and then
prompts the user to enter all of the scores, and concludes by displaying the grades.
Here is a sample run:


	Enter the number of students: 4
	Enter 4 scores: 40 55 70 58
	Student 0 score is 40 and grade is F
	Student 1 score is 55 and grade is C
	Student 2 score is 70 and grade is A
	Student 3 score is 58 and grade is C
*/
import java.util.Scanner;

public class Exercise07_01{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numbers = input.nextInt();
        int[]grades = new int[numbers];
        System.out.print("Enter 4 scores: ");
        for(int i = 0; i < grades.length; i++){
            grades[i] = input.nextInt();
        }
        int best = best(grades);
        for(int i = 0; i < grades.length; i++){
            System.out.println("Student " + i + " score is " + grades[i] + " and grade is " + String.valueOf(gradeLetter(grades[i], best)));
        }
    }
    public static char gradeLetter(int grade, int best){
        if(grade >= best - 5){
            return 'A';
        }
        else if(grade >= best - 10){
            return 'B';
        }
        else if(grade >= best - 15){
            return 'C';
        }
        else if(grade >= best - 20){
            return 'D';
        }
        return 'F';
    }
    public static int best(int[]arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}