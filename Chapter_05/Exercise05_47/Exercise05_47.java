/*
7 (Business: check ISBN-13) ISBN-13 is a new standard for indentifying books. It
uses 13 digits d1d2d3d4d5d6d7d8d9d10d11d12d13. The last digit d13 is a checksum,
which is calculated from the other digits using the following formula:

10 - (d1 + 3d2 + d3 + 3d4 + d5 + 3d6 + d7 + 3d8 + d9 + 3d10 + d11 + 3d12)%10
If the checksum is 10, replace it with 0. Your program should read the input as a
string. Here are sample runs

    Enter the first 12 digits of an ISBN-13 as a string: 978013213080
    The ISBN-13 number is 9780132130806

    Enter the first 12 digits of an ISBN-13 as a string: 978013213079
    The ISBN-13 number is 9780132130790

    Enter the first 12 digits of an ISBN-13 as a string: 97801320
    97801320 is an invalid input
*/
import java.util.Scanner;
public class Exercise05_47{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String ISBN = input.next();
        if(ISBN.length() == 12){
            int result = 0;
            for(int i = 1; i <= ISBN.length(); i++){
                result += (ISBN.charAt(i - 1) - '0') * ((i % 2 == 0 ? 3 : 1));
            }
            result = 10 - (result % 10);
            System.out.print(ISBN + ((result == 10) ? 0 : result));
        }
        else{
            System.out.print(ISBN + " is an invalid input");
        }
    }
}
