/*
(Generic insertion sort) Write the following two generic methods using insertion
sort. The first method sorts the elements using the Comparable interface, and
the second uses the Comparator interface.

	public static <E extends Comparable<E>> void insertionSort(E[] list)
	public static <E> void insertionSort(E[] list, Comparator<? super E> comparator)
*/
import java.util.Random;
import java.util.Comparator;
public class Exercise23_08{
	public static void main(String[]args){
		Integer []number = new Integer[10];
		Random random = new Random();
		for(int i = 0; i < number.length; i++){
			number[i] = random.nextInt(100);
		}
		insertionSort(number);
		for(Integer value:number){
			System.out.println(value);
		}
	}
	public static <E extends Comparable<E>> void insertionSort(E[] list){
		insertionSort(list, null);
	}
	public static <E> void insertionSort(E[] list, Comparator<? super E> comparator){
		if(comparator == null){
			comparator = (e1, e2) -> ((Comparable)e1).compareTo(e2);
		}
		for(int i = 1; i < list.length; i++){
			E current = list[i];
			int k;
			for(k = i - 1; k >= 0 && comparator.compare(current, list[k]) < 0; k--){
				list[k + 1] = list[k];
			}
			list[k + 1] = current;
		}
	}
}