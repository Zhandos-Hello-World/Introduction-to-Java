/*
(Stopwatch) Design a class named StopWatch. The class contains:
■■ Private data fields startTime and endTime with getter methods.
■■ A no-arg constructor that initializes startTime with the current time.
■■ A method named start() that resets the startTime to the current time.
■■ A method named stop() that sets the endTime to the current time.
■■ A method named getElapsedTime() that returns the elapsed time for the
stopwatch in milliseconds.
Draw the UML diagram for the class then implement the class. Write a test program
that measures the execution time of sorting 100,000 numbers using selection sort.
*/

public class Exercise09_06{
	public static void main(String[]args){
		int[] arr = new int[100000];
		random(arr);
		StopWatch watch = new StopWatch();
		selectionSort(arr);
		watch.stop();
		System.out.print(watch.getElapsedTime());

	}
	public static void random(int[]arr){
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 100000 + 0);
		}
	}


    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++){  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
}