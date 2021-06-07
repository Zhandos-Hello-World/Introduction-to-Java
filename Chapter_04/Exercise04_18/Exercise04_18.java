/*
(Student major and status) Write a program that prompts the user to enter two
characters and displays the major and status represented in the characters. The first
character indicates the major and the second is number character 1, 2, 3, 4, which
indicates whether a student is a freshman, sophomore, junior, or senior. Suppose
the following characters are used to denote the majors:
I: Information Management
C: Computer Science
A: Accounting
Here is a sample run:

    Enter two characters: I1
    Information Management Freshman

    Enter two characters: A3
    Accounting Junior

    Enter two characters: T3
    Invalid input

*/
import java.util.Scanner;
public class Exercise04_18 {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String a = str.nextLine().toLowerCase();
        char a1 = a.charAt(0);
        char a2 = a.charAt(1);
        int num = Integer.parseInt(String.valueOf(a2));
        String q;
        switch (num){
            case 1:q = "Freshman";break;
            case 2:q = "Sophomore";break;
            case 3:q = "Junior";break;
            case 4:q = "Senior";break;
            default:q = "";break;
        }

        if(a1 == 'm'){
            System.out.print("Mathematics " + q);
        }
        else if(a1 == 'c'){
            System.out.print("Computer Science " + q);
        }
        else if(a1 == 'i'){
            System.out.print("Information Technology " + q);
        }
        else{
            System.out.print("invalid input");
        }
    }
}
