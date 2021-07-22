/*
(Generic quick sort) Write the following two generic methods using quick sort.
The first method sorts the elements using the Comparable interface, and the
second uses the Comparator interface.
public static <E extends Comparable<E>> void quickSort(E[] list)
public static <E> void quickSort(E[] list, Comparator<? super E> comparator)
*/
import java.util.Comparator;
public class Exercise23_03{
	public static void main(String[]args){
        Integer[]numbers = new Integer[10];
        Double[]doubles = new Double[10];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int)(Math.random() * 100 + 0);
            doubles[i] = Math.random() * 100 + 0;
        }
        quickSort(numbers);
        quickSort(doubles);
        print(numbers);
        print(doubles);

	}
    public static <E extends Number>void print(E[]list){
        for(E value:list){
            System.out.println(value);
        }
        System.out.println("___________________");
    }



    public static <E extends Comparable<E>> void quickSort(E[] list) {
        quickSort(list, 0, list.length - 1);
    }

    private static <E extends Comparable<E>>void quickSort(E[] list, int first, int last) {
        if (last > first) {
          int pivotIndex = partition(list, first, last);
          quickSort(list, first, pivotIndex - 1);
          quickSort(list, pivotIndex + 1, last);
        }

    }

  /** Partition the array list[first..last] */
    private static <E extends Comparable<E>>int partition(E[] list, int first, int last) {
        E pivot = list[first]; // Choose the first element as the pivot
        int low = first + 1; // Index for forward search
        int high = last; // Index for backward search

        while (high > low) {
          // Search forward from left
          while (low <= high && list[low].compareTo(pivot) <= 0)
            low++;

          // Search backward from right
          while (low <= high && list[high].compareTo(pivot) > 0)
            high--;

          // Swap two elements in the list
          if (high > low) {
            E temp = list[high];
            list[high] = list[low];
            list[low] = temp;
          }
        }

        while (high > first && list[high].compareTo(pivot) >= 0)
          high--;

        // Swap pivot with list[high]
        if (pivot.compareTo(list[high]) > 0) {
          list[first] = list[high];
          list[high] = pivot;
          return high;
        }
        else {
          return first;
        }
    }

    public static <E> void quickSort(E[] list, Comparator<? super E> comparator){
        quickSort(list, 0, list.length - 1, comparator);
    }
    private static <E>void quickSort(E[] list, int first, int last, Comparator<? super E> comparator) {
        if (last > first) {
          int pivotIndex = partition(list, first, last, comparator);
          quickSort(list, first, pivotIndex - 1, comparator);
          quickSort(list, pivotIndex + 1, last, comparator);
        }

    }
    private static <E>int partition(E[] list, int first, int last, Comparator<? super E> comparator) {
        E pivot = list[first]; // Choose the first element as the pivot
        int low = first + 1; // Index for forward search
        int high = last; // Index for backward search

        while (high > low) {
          // Search forward from left
          while (low <= high && comparator.compare(list[low], pivot) <= 0)
            low++;

          // Search backward from right
          while (low <= high && comparator.compare(list[high], pivot) > 0)
            high--;

          // Swap two elements in the list
          if (high > low) {
            E temp = list[high];
            list[high] = list[low];
            list[low] = temp;
          }
        }

        while (high > first && comparator.compare(list[high], pivot) >= 0)
          high--;

        // Swap pivot with list[high]
        if (comparator.compare(pivot, list[high]) > 0) {
          list[first] = list[high];
          list[high] = pivot;
          return high;
        }
        else {
          return first;
        }
    }
}