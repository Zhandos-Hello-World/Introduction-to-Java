/*
(Conversion from inch to centimeter) Write a program that displays the following
table (note that 1 inch is 2.54 centimeters):
Inches Centimetres
1 2.54
2 5.08
...
9 22.86
10 25.4
*/
public class Exercise05_04{

    public static void main(String[] args) {
        System.out.printf("%-7s%-7s\n", "Inches", "Centimetres");
        for(int i = 1; i <= 10; i++){
            System.out.printf("%-7d%-7.2f\n", i, i * 2.54);
        }
    }
}
