/*
(Partition of a list) Write the following method that partitions the list using the
first element, called a pivot:

	public static int partition(int[] list)

 After the partition, the elements in the list are rearranged so all the elements before
the pivot are less than or equal to the pivot, and the elements after the pivot are
greater than the pivot. The method returns the index where the pivot is located in
the new list. For example, suppose the list is {5, 2, 9, 3, 6, 8}. After the partition,
the list becomes {3, 2, 5, 9, 6, 8}. Implement the method in a way that takes at
most list.length comparisons. See liveexample.pearsoncmg.com/dsanimation/QuickSortNeweBook.html 
for an animation of the implementation. Write a
test program that prompts the user to enter the size of the list and the contents of
the list and displays the list after the partition. Here is a sample run. 


	Enter list size: 8
	Enter list content: 10 1 5 16 61 9 11 1
	After the partition, the list is 9 1 5 1 10 61 11 16
*/
import java.util.Scanner;

public class Exercise07_32{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter list size: ");
		int size = input.nextInt();
		int[]list = new int[size];
		System.out.print("Enter list content: ");
		for(int i = 0; i < list.length; i++){
			list[i] = input.nextInt();
		}
		System.out.print("After the partition, the list is " + print(partition(list)));

	}
    public static String print(int[]list){
        String q = "";
        for(int i:list){
            q += i + " ";
        }
        return q;
    }
    public static int[] partition(int[] list){
        int pivot = list[0];

        int low = 1, high = list.length - 1;
        while(true){
            if(low >= high){
                if(list[high] > pivot){
                    high--;
                }
                else{
                    list[0] = list[high];
                    list[high] = pivot;
                    break;
                }
            }
            else{
                if(list[low] <= pivot){
                    low++;
                }
                else{
                    if(list[high] > pivot){
                        high--;
                    }
                    else{
                        int temp = list[high];
                        list[high] = list[low];
                        list[low] = temp;
                    }
                }
            }
        }
        return list;
    }
}