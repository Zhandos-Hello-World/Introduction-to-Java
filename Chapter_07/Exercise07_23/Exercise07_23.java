/*
(Game: locker puzzle) A school has 100 lockers and 100 students. All lockers are
closed on the first day of school. As the students enter, the first student, denoted
as S1, opens every locker. Then the second student, S2, begins with the second
locker, denoted as L2, and closes every other locker. Student S3 begins with the
third locker and changes every third locker (closes it if it was open and opens it if
it was closed). Student S4 begins with locker L4 and changes every fourth locker.
Student S5 starts with L5 and changes every fifth locker, and so on, until student
S100 changes L100.
After all the students have passed through the building and changed the lockers,
which lockers are open? Write a program to find your answer and display all open
locker numbers separated by exactly one space.
(Hint: Use an array of 100 Boolean elements, each of which indicates whether a
locker is open (true) or closed (false). Initially, all lockers are closed.)
*/
import java.util.Arrays;
public class Exercise07_23{
    public static void main(String[]args){
        final boolean[] available = new boolean[100];
        //first student
        Arrays.fill(available, true);
        //second student
        Arrays.fill(available, false);
        available[1] = true;
        //from 3rd student to 100th student
        for(int i = 2; i < available.length; i++){
            available[i] = !available[i];
            for(int j = 0; j < available.length; j ++){
                if((j + 1) % i == 0){
                    available[j] = !available[j];
                }
            }
        }
        for(int i = 0; i < available.length; i++){
            if(available[i]){
                System.out.print("L" + (i + 1) + " ");
            }
        }
    }
}