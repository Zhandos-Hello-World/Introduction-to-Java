/*
(Latin square) A Latin square is an n-by-n array filled with n different Latin letters, 
each occurring exactly once in each row and once in each column. Write a program that 
prompts the user to enter the number n and the array of characters, as shown in the 
sample output, and checks if the input array is a Latin square.The characters are the
first n characters starting from A.
*/
import java.util.Scanner;
public class Exercise08_36{

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter number n: ");
        int rowAndColumn = str.nextInt();
        char[][] arr = new char[rowAndColumn][rowAndColumn];
        System.out.println("Enter " + rowAndColumn + " rows of letters separated by spaces: ");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = str.next().toUpperCase().charAt(0);
            }
        }
        if(findLatin(arr)){
            System.out.print("The input array is a Latin square");
        }
        else{
            System.out.print("Wrong input: the letters must be from A to C");
        }

    }
    public static boolean findLatin(char[][]arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i][j] < 'A' || arr[i][j] > 'D'){
                    return false;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i][j] != arr[j][i]){
                    return false;
                }
            }
        }
        return true;
    }

}
