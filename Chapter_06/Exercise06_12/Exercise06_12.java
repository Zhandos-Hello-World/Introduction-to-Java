/*
(Display numbers) Write a method that prints numbers using the following header:

    public static void printNumbers(int num1, int num2, int numberPerLine)

This method prints the characters between num1 and num2 with the specified
numbers per line. Write a test program that prints ten characters per line from 1
to 100. Numbers are separated by exactly one space.

*/

public class Exercise06_12{

    public static void main(String[] args) {
        System.out.println("\nCharacters per 1 to Z");
        printChars('1', 'z', 10);
        printNumbers(1, 100, 10);
    }
    public static void printChars(char ch1, char ch2, int numberPerLine){
        for(char c = ch1, count = 1; c <= ch2; c++, count++){
            if(count % numberPerLine == 0){
                System.out.println(c);
            }
            else{
                System.out.print(c + " ");
            }
        }
        System.out.println();
    }
    public static void printNumbers(int num1, int num2, int numberPerLine){
        int index = 1;
        for(int num = num1; num < num2; num += numberPerLine){
            System.out.print(num + ((index % 10 == 0) ? "\n": " "));
            index++;
        }
        System.out.println();
    }
}
