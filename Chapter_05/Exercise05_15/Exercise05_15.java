/*
(Display the ASCII character table) Write a program that prints the characters in
the ASCII character table from ! to ~. Display 10 characters per line. The ASCII
table is given in Appendix B. Characters are separated by exactly one space

*/

public class Exercise05_15{

    public static void main(String[] args) {
        for(char a = '!'; a <= '~'; a++){
            System.out.print(a + " ");
        }
    }
}
