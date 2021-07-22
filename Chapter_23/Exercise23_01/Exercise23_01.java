/*
(Generic bubble sort) Write the following two generic methods using bubble
sort. The first method sorts the elements using the Comparable interface, and
the second uses the Comparator interface.
public static <E extends Comparable<E>>
 void bubbleSort(E[] list)
public static <E> void bubbleSort(E[] list,
 Comparator<? super E> comparator)
*/
import java.util.Comparator;
import java.util.Arrays;
public class Exercise23_01{
	public static void main(String[]args){
		//Test
		Integer[]list = new Integer[10];
		for(int i = 0; i < list.length; i++){
			list[i] = (int)(Math.random() * 100 + 0);
		}
		System.out.println(Arrays.toString(list));
		bubbleSort(list);
		System.out.println(Arrays.toString(list));
		bubbleSort(list, new Comparator<Integer>(){
			@Override
			public int compare(Integer o1, Integer o2){
				if(o1 > o2){
					return -1;
				}
				else if(o1 < o2){
					return 1;
				}
				return 0;
			}
		});
		System.out.println(Arrays.toString(list));

	}
	public static <E extends Comparable<E>> void bubbleSort(E[] list){
		boolean check = true;
		while(check){
			check = false;
			for(int i = 1; i < list.length; i++){
				if(list[i].compareTo(list[i - 1]) < 0){
					check = true;
					E temp = list[i - 1];
					list[i - 1] = list[i];
					list[i] = temp;
				}
			}
		}
	}
	public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator){
		boolean check = true;
		while(check){
			check = false;
			for(int i = 1; i < list.length; i++){
				if(comparator.compare(list[i], list[i - 1]) < 0){
					check = true;
					E temp = list[i - 1];
					list[i - 1] = list[i];
					list[i] = temp;
				}
			}
		}
	}
}