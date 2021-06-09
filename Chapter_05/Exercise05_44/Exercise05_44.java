/*
(Computer architecture: bit-level operations) A byte value is stored in 8 bits. Write
a program that prompts the user to enter a byte integer and displays the 8 bits for
the integer. Here are sample runs:

    Enter an integer: 5
    The 8 bits are 00000101

    Enter an integer: –5
    The 8 bits are 11111011

(Hint: You need to use the bitwise right shift operator (>>) and the bitwise AND
operator (&), which are covered in Appendix G, Bitwise Operations.)

*/

import java.util.Scanner;
public class Exercise05_44{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        short number = input.nextShort();
        String bits = "";
        for (int i = 0; i < 8; i++) {
            bits = (number & 1) + bits;
            number >>= 1;
        }
        System.out.println("The bits are " + bits);
    }
}
