/*
(Descending Bubble Sort) Modify the bubble sort method of Programming
Exercise 7.18, and sort the elements in the array in descending order instead of
ascending order. Write a test program that reads 10 double numbers, invokes the
method, and displays the sorted numbers in descending order.
*/

public class Exercise07_20{
	public static void main(String[]args){
		int[]list = new int[10];
		for(int i = 0; i < list.length; i++){
			list[i] = (int)(Math.random() * 100 + 0);
		}
		System.out.print("After bubble sort: ");
		for(int value:list){
			System.out.print(value + " ");
		}

		BubbleSort(list);

		System.out.print("\nBefore bubble sort: ");
		for(int value:list){
			System.out.print(value + " ");
		}


	}
	public static void BubbleSort(int[]list){
		for(int i = 0; i < list.length; i++){
			for(int j = 1; j < list.length; j++){
				if(list[j] > list[j - 1]){
					int temp = list[j - 1];
					list[j - 1] = list[j];
					list[j] = temp;
				}
			}
		}
	}
}