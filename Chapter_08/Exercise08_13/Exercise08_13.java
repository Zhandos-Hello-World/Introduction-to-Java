/*
(Locate the smallest element) Write the following method that returns the location
of the smallest element in a two-dimensional array.

    public static int[] locateSmallest(double[][] a)

The return value is a one-dimensional array that contains two elements. These
two elements indicate the row and column indices of the smallest element in the
two-dimensional array. Write a test program that prompts the user to enter a 
twodimensional array and displays the location of the smallest element in the array.
Here is a sample run:

    Enter the number of rows and columns of the array: 3 4
    Enter the array:
    23.5 35 2 10
    4.5 3 45 3.5
    35 44 5.5 9.6
    The location of the smallest element is at (0, 2)

*/
import java.util.Scanner;

public class Exercise08_13{

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the array: ");
        int row = str.nextInt();
        int column = str.nextInt();
        double[][]arr = new double[row][column];
        System.out.println("Enter the array: ");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = str.nextDouble();
            }
        }
        int []arrOutput = locateLargest(arr);
        System.out.print("The location of the smallest element is at (" +
                arrOutput[0] + ", "+ arrOutput[1] + ")");
    }
    public static int[] locateLargest(double[][] a){
        double numberMin = a[0][0];
        int []index = new int[2];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(numberMin > a[i][j]){
                    numberMin = a[i][j];
                    index[0] = i;
                    index[1] = j;
                }
            }
        }
        return index;
    }
}
