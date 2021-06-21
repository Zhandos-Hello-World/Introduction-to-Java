/*
(Largest row and column) Write a program that randomly fills in 0s and 1s into
a 5-by-5 matrix, prints the matrix, and finds the first row and column with the
most 1s. Here is a sample run of the program:

01101
01011
10010
11111
00101
The largest row index: 3
The largest column index: 4
*/
public class Exercise08_10 {

    public static void main(String[] args) {
        int[][]arr = new int[5][5];
        fill(arr);
        for(int[]values:arr){
            for(int value:values){
                System.out.print(value);
            }
            System.out.println();
        }
        System.out.println("The largest row index: " + findRow(arr));
        System.out.println("The largest column index: " + findColumn(arr));
    }
    public static int findRow(int[][]arr){
        int maxCurrent = 0, maxOld = 0, index = 0;
        for(int i = 0; i < arr.length; i++){
            maxCurrent = 0;
            for(int j = 0; j < arr[i].length; j++){
                maxCurrent += arr[i][j];
            }
            if(maxCurrent > maxOld){
                index = i;
                maxOld = maxCurrent;
            }
        }
        return index;

    }
    public static int findColumn(int[][]arr){
        int maxCurrent = 0, maxOld = 0, index = 0;
        for(int i = 0; i < arr.length; i++){
            maxCurrent = 0;
            for(int j = 0; j < arr[i].length; j++){
                maxCurrent += arr[j][i];
            }
            if(maxCurrent > maxOld){
                index = i;
                maxOld = maxCurrent;
            }
        }
        return index;
    }

    public static void fill(int[][]arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = (int)(Math.random() * 2 + 0);
            }
        }
    }
}
