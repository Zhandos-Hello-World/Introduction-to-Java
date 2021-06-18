/*
(Execution time) Write a program that creates an array of numbers from 1 to
100,000,000 in ascending order. Display the execution time of invoking the
linearSearch method and the binarySearch method in Listings 7.6 and
7.7 respectively. Display the execution time of invoking both searches for the following numbers:
 1; 25,000,000; 50,000,000; 75,000,000; 100,000,000. You can
use the following code template to obtain the execution time:

long startTime = System.nanoTime();
perform the task;
long endTime = System.nanoTime();
long executionTime = endTime − startTime;
*/

public class Exercise07_16{
    public static void main(String[]args){
        int[] list = create(100000000);
        for(int i = 1; i <= 100000000; i += 25000000){
            long startTime = System.nanoTime();
            int index = linearSearch(list, i);
            long endTime = System.nanoTime();
            long executionTime = endTime - startTime;
            System.out.println("Index " + i + " is found by linear search in " + executionTime + " nanoTime");

            startTime = System.nanoTime();
            index = binarySearch(list, i);
            endTime = System.nanoTime();
            executionTime = endTime - startTime;
            System.out.println("Index " + i + " is found by binary search in " + executionTime + " nanoTime\n");
            i = (i == 1) ? 0 : i;
        }
    }
    public static int linearSearch(int[]list, int key){
        for(int i = 0; i < list.length; i++){
            if(list[i] == key) return i;
        }
        return -1;
    }
    public static int binarySearch(int[]list, int key){
        int low = 0, high = list.length - 1;
        while(high >= low){
            int mid = (low + high) / 2;
            if(key > list[mid]){
                high = mid - 1;
            }
            else if(key == list[mid]){
                return mid;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }




    public static int[]create(int size){
        int[] list = new int[size];
        for(int i = 0; i < list.length; i++){
            list[i] = i + 1;
        }
        return list;
    }
}