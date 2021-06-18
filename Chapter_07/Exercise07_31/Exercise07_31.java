/*
(Merge two sorted lists) Write the following method that merges two sorted lists
into a new sorted list:

	public static int[] merge(int[] list1, int[] list2)

Implement the method in a way that takes at most list1.length + list2.
length comparisons. See liveexample.pearsoncmg.com/dsanimation/
MergeSortNeweBook.html for an animation of the implementation. Write a test
program that prompts the user to enter two sorted lists and displays the merged
list. Here is a sample run. Note the first number in the input indicates the number
of the elements in the list. This number is not part of the list.

	Enter list1 size and contents: 5 1 5 16 61 111
	Enter list2 size and contents: 4 2 4 5 6
	list1 is 1 5 16 61 111
	list2 is 2 4 5 6
	The merged list is 1 2 4 5 5 6 16 61 111
*/
import java.util.Scanner;
public class Exercise07_31{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter list1 size and contents: ");
		int size = input.nextInt();
		int[]list1 = new int[size];
		for(int i = 0; i < list1.length; i++){
			list1[i] = input.nextInt();
		}
		System.out.print("Enter list2 size and contents: ");
		size = input.nextInt();
		int[]list2 = new int[size];
		for(int i = 0; i < list2.length; i++){
			list2[i] = input.nextInt();
		}
		System.out.println("list1 is " + print(list1));
		System.out.println("list2 is " + print(list2));
		System.out.println("The merged list is " + print(merge(list1, list2)));
	}
	public static int[] merge(int[] list1, int[] list2){
		int[]list3 = new int[list1.length + list2.length];
		int index1 = 0, index2 = 0;
		for(int i = 0; i < list3.length; i++){
			if(index2 == list2.length - 1){
				list3[i] = list1[index1];
				index1++;
				continue;
			}
			if(index1 == list1.length - 1){
				list3[i] = list2[index2];
				index2++;
				continue;
			}


			if(list1[index1] >= list2[index2]){
				list3[i] = list2[index2];
				index2++;
				if(index2 >= list2.length){
					index2--;
				}
			}
			else{
				list3[i] = list1[index1];
				index1++;
				if(index1 >= list1.length){
					index1--;
				}
			}
		}
		return list3;
	}
	public static String print(int []list){
		String result = "";
		for(int i:list){
			result += i + " ";
		}
		return result;
	}
}