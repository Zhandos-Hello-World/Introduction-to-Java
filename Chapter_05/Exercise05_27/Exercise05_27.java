/*
(Display leap years) Write a program that displays all the leap years, ten per line,
from 2014 to 2114, separated by exactly one space. Also display the number of
leap years in this period

*/

public class Exercise05_27 {

    public static void main(String[] args) {
        int c = 0;
        for(int i = 2014; i < 2114; i++){
            if(i % 4 == 0){
                if(i % 100 != 0){
                    System.out.print(i + " ");
                    c++;
                }
                else{
                    if(i % 400 == 0){
                        System.out.print(i + " ");
                        c++;
                    }
                }
            }
            if(c == 10){
                System.out.println();
                c = 0;
            }
        }
    }
}
