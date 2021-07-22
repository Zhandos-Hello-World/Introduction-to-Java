/*
(Generic insertion sort) Write the following two generic methods using insertion
sort. The first method sorts the elements using the Comparable interface and the
second uses the Comparator interface.

	public static <E extends Comparable<E>> void insertionSort(E[] list)

	public static <E void insertionSort(E[] list, Comparator<?super E> comparator)
*/
import java.util.Comparator;

public class Exercise23_06{
	public static void main(String[]args){
		Integer[]values = shuffle();

		insertionSort(values);
		print(values);

	
		values = shuffle();

		//decreasing
		insertionSort(values, new Comparator<Integer>(){
			@Override
			public int compare(Integer o1, Integer o2){
				return o2 - o1;
			}
		});
		print(values);
	}

	public static Integer[] shuffle(){
		Integer[] list = new Integer[10];
		for(int i = 0; i < list.length; i++){
			list[i] = (int)(Math.random() * 100 + 0);
		}
		return list;
	}


	public static <E extends Number>void print(E[]list){
		for(E value:list){
			System.out.println(value);
		}
		System.out.println("______________________");
	}


	public static <E extends Comparable<E>> void insertionSort(E[] list){
		for(int i = 1; i < list.length; i++){
			E currentElement = list[i];
            int k;
            for(k = i - 1; k >= 0 && currentElement.compareTo(list[k]) < 0; k--){
            	list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
		}
	}
	public static <E> void insertionSort(E[] list, Comparator<?super E> comparator){
		for(int i = 1; i < list.length; i++){
			E currentElement = list[i];
            int k;
            for(k = i - 1; k >= 0 && comparator.compare(currentElement, list[k]) < 0; k--){
            	list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
		}
	}
}