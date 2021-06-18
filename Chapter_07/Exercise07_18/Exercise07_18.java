/*
(Bubble sort) Write a sort method that uses the bubble-sort algorithm. 
The bubble-sort algorithm makes several passes through the array. 
On each pass, successive neighboring pairs are compared. 
If a pair is not in order, its values are swapped; otherwise, 
the values remain unchanged. The technique is called a
bubble sort or sinking sort because the smaller values gradually "bubble" their
way to the top, and the larger values "sink" to the bottom. Write a test program
that reads in 10 double numbers, invokes the method, and displays the sorted
numbers.
*/

public class Exercise07_18{
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
				if(list[j] < list[j - 1]){
					int temp = list[j - 1];
					list[j - 1] = list[j];
					list[j] = temp;
				}
			}
		}
	}
}