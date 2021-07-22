/*
(Execution time for sorting) Write a program that obtains the execution time of
selection sort, bubble sort, merge sort, quick sort, heap sort, and radix sort for
input size 60,000, 120,000, 180,000, 240,000, 300,000, and 360,000. Your program 
should create data randomly and print a table like this:


(Hint: You can use the following code template to obtain the execution time.)
long startTime = System.currentTimeMillis();
perform the task;
long endTime = System.currentTimeMillis();
long executionTime = endTime − startTime;
The text gives a recursive quick sort. Write a nonrecursive version in this exercise.
*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Exercise23_13{
    public static void main(String[]args){
        System.out.printf("%-10s%-2c%-12s%-10s%-10s%-10s%-10s\n", "Array", '|', "Selection", "Merge", "Quick", "Heap", "Radix");
        System.out.printf("%-10s%-2c%-12s%-10s%-10s%-10s%-10s\n", "size", '|', "Sort", "Sort", "Sort", "Sort", "Sort");
        System.out.println("__________|_______________________________________________________");
        for(int size = 60000; size <= 360000; size += 60000){
            int []times = new int[6];

            //selection sort
            Integer []arr = getArray(size);
            long startTime = System.currentTimeMillis();
            Sort.selectionSort(arr);
            long endTime = System.currentTimeMillis();
            times[0] = (int)(endTime - startTime);

            //merge sort
            arr = getArray(size);
            startTime = System.currentTimeMillis();
            Sort.mergeSort(arr);
            endTime = System.currentTimeMillis();
            times[1] = (int)(endTime - startTime);

            //quick sort
            arr = getArray(size);
            startTime = System.currentTimeMillis();
            Sort.QuickSort<Integer> quickSort = new Sort.QuickSort<>();
            quickSort.quickSortIterative(arr, 0, arr.length - 1, null);
            endTime = System.currentTimeMillis();
            times[2] = (int)(endTime - startTime);

            //Heap sort
            arr = getArray(size);
            startTime = System.currentTimeMillis();
            Sort.Heap<Integer> heap = new Sort.Heap<>(arr);
            for(int i = arr.length - 1; i >= 0; i--){
                arr[i] = heap.remove();
            }
            endTime = System.currentTimeMillis();
            times[3] = (int)(endTime - startTime);

            //radix sort
            arr = getArray(size);
            startTime = System.currentTimeMillis();
            Sort.RadixSort radixSort = new Sort.RadixSort();
            radixSort.radixsort(arr, arr.length);
            endTime = System.currentTimeMillis();
            times[4] = (int)(endTime - startTime);

            System.out.printf("%-10d%-2c%-12d%-10d%-10d%-10d%-10d\n", size, '|', times[0], times[1], times[2], times[3],times[4]);
        }
    }
    public static Integer[] getArray(int size){
        Integer[] temp = new Integer[size];
        Random random = new Random();
        for(int i = 0; i < temp.length; i++){
            temp[i] = random.nextInt(1000);
        }
        return temp;
    }

}
class Sort{
    //selection sort
    public static<E extends Comparable<E>>void selectionSort(E[]list){
        selectionSort(list, null);
    }
    public static <E>void selectionSort(E[]list, java.util.Comparator<E> comparator){
        if(comparator == null){
            comparator = (e1, e2) -> ((Comparable<E>)e1).compareTo(e2);
        }
        for(int i = 0; i < list.length - 1; i++){
            E currentMin = list[i];
            int currentMinIndex = i;
            for(int j = i + 1; j < list.length; j++){
                if(comparator.compare(currentMin, list[j]) > 0){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if(currentMinIndex != i){
                E temp = list[currentMinIndex];
                list[currentMinIndex] = list[i];
                list[i] = temp;
            }
        }
    }
    //bubble sort
    public static<E extends Comparable<E>>void bubbleSort(E[]list){
        bubbleSort(list, null);
    }
    public static <E>void bubbleSort(E[]list, java.util.Comparator<E> comparator){
        if(comparator == null){
            comparator = (e1, e2) -> ((Comparable<E>)e1).compareTo(e2);
        }
        boolean check = true;
        while(check){
            check = false;
            for(int i = 1; i < list.length; i++){
                if(comparator.compare(list[i], list[i - 1]) < 0){
                    E temp = list[i];
                    list[i] = list[i - 1];
                    list[i - 1] = temp;
                    check = true;
                }
            }
        }
    }
    //Merge sort
    public static<E extends Comparable<E>>void mergeSort(E[]list){
        mergeSort(list, null);
    }
    public static <E>void mergeSort(E[]list, java.util.Comparator<E> comparator){
        if(comparator == null){
            comparator = (e1, e2) -> ((Comparable<E>)e1).compareTo(e2);
        }
        if(list.length > 1){
            E[] fisrtHalf = java.util.Arrays.copyOf(list, list.length / 2);
            mergeSort(fisrtHalf, comparator);

            E[] secondHalf = java.util.Arrays.copyOfRange(list, list.length / 2, list.length);
            mergeSort(secondHalf, comparator);

            merge(fisrtHalf, secondHalf, list, comparator);
        }
    }
    private static<E>void merge(E[]list1, E[]list2, E[]temp, java.util.Comparator<E> comparator){
        int current1 = 0, current2 = 0, current3 = 0;
        while(current1 < list1.length && current2 < list2.length){
            if(comparator.compare(list1[current1], list2[current2]) > 0)
                temp[current3++] = list2[current2++];
            else
                temp[current3++] = list1[current1++];
        }
        while(current1 < list1.length){
            temp[current3++] = list1[current1++];
        }
        while(current2 < list2.length){
            temp[current3++] = list2[current2++];
        }
    }
    //quick sort
    public static<E extends Comparable<E>>void quickSort(E[]list){
        quickSort(list, null);
    }
    public static <E> void quickSort(E[] list, java.util.Comparator<? super E> comparator){
        if(comparator == null){
            comparator = (e1, e2) -> ((Comparable<E>)e1).compareTo(e2);
        }
        quickSort(list, 0, list.length - 1, comparator);
    }
    private static <E>void quickSort(E[] list, int first, int last,java.util.Comparator<? super E> comparator) {
        if (last > first) {
            int pivotIndex = partition(list, first, last, comparator);
            quickSort(list, first, pivotIndex - 1, comparator);
            quickSort(list, pivotIndex + 1, last, comparator);
        }

    }
    private static <E>int partition(E[] list, int first, int last, java.util.Comparator<? super E> comparator) {
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

    public static class  QuickSort<E> {

        public int partition(E arr[], int low, int high, Comparator<? super E> comparator){
            E pivot = arr[high];
            int i = (low - 1);
            for (int j = low; j <= high - 1; j++) {
                if (comparator.compare(arr[j], pivot) <= 0) {
                    i++;
                    E temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            E temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;
            return i + 1;
        }
        public void quickSortIterative(E arr[], int l, int h, Comparator<E> comparator) {
            if(comparator == null){
                comparator = (e1, e2) -> ((Comparable<E>)e1).compareTo(e2);
            }
            int[] stack = new int[h - l + 1];
            int top = -1;
            stack[++top] = l;
            stack[++top] = h;
            while (top >= 0) {
                h = stack[top--];
                l = stack[top--];
                int p = partition(arr, l, h, comparator);
                if (p - 1 > l) {
                    stack[++top] = l;
                    stack[++top] = p - 1;
                }
                if (p + 1 < h) {
                    stack[++top] = p + 1;
                    stack[++top] = h;
                }
            }
        }
    }



    public static class Heap<E> {
        private java.util.ArrayList<E> list = new java.util.ArrayList<>();
        private java.util.Comparator<? super E> c;

        /** Create a default heap using a natural order for comparison */
        public Heap() {
            this.c = (e1, e2) -> ((Comparable<E>)e1).compareTo(e2);
        }

        /** Create a heap with a specified comparator */
        public Heap(java.util.Comparator<E> c) {
            this.c = c;
        }

        /** Create a heap from an array of objects */
        public Heap(E[] objects) {
            this.c = (e1, e2) -> ((Comparable<E>)e1).compareTo(e2);
            for (int i = 0; i < objects.length; i++)
                add(objects[i]);
        }

        /** Add a new object into the heap */
        public void add(E newObject) {
            list.add(newObject); // Append to the heap
            int currentIndex = list.size() - 1; // The index of the last node

            while (currentIndex > 0) {
                int parentIndex = (currentIndex - 1) / 2;
                // Swap if the current object is greater than its parent
                if (c.compare(list.get(currentIndex),
                        list.get(parentIndex)) > 0) {
                    E temp = list.get(currentIndex);
                    list.set(currentIndex, list.get(parentIndex));
                    list.set(parentIndex, temp);
                }
                else
                    break; // the tree is a heap now

                currentIndex = parentIndex;
            }
        }

        /** Remove the root from the heap */
        public E remove() {
            if (list.size() == 0) return null;

            E removedObject = list.get(0);
            list.set(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);

            int currentIndex = 0;
            while (currentIndex < list.size()) {
                int leftChildIndex = 2 * currentIndex + 1;
                int rightChildIndex = 2 * currentIndex + 2;

                // Find the maximum between two children
                if (leftChildIndex >= list.size()) break; // The tree is a heap
                int maxIndex = leftChildIndex;
                if (rightChildIndex < list.size()) {
                    if (c.compare(list.get(maxIndex),
                            list.get(rightChildIndex)) < 0) {
                        maxIndex = rightChildIndex;
                    }
                }

                // Swap if the current node is less than the maximum
                if (c.compare(list.get(currentIndex),
                        list.get(maxIndex)) < 0) {
                    E temp = list.get(maxIndex);
                    list.set(maxIndex, list.get(currentIndex));
                    list.set(currentIndex, temp);
                    currentIndex = maxIndex;
                }
                else
                    break; // The tree is a heap
            }

            return removedObject;
        }

        /** Get the number of nodes in the tree */
        public int getSize() {
            return list.size();
        }

        /** Return true if heap is empty */
        public boolean isEmpty() {
            return list.size() == 0;
        }
    }
    public static class RadixSort{
        public int getMax(Integer arr[], int n) {
            Integer mx = arr[0];
            for (int i = 1; i < n; i++)
                if (arr[i] > mx)
                    mx = arr[i];
            return mx;
        }
        public void countSort(Integer arr[], int n, int exp) {
            int output[] = new int[n]; // output array
            int i;
            int count[] = new int[10];
            Arrays.fill(count, 0);
            for (i = 0; i < n; i++)
                count[(arr[i] / exp) % 10]++;
            for (i = 1; i < 10; i++)
                count[i] += count[i - 1];
            for (i = n - 1; i >= 0; i--) {
                output[count[(arr[i] / exp) % 10] - 1] = arr[i];
                count[(arr[i] / exp) % 10]--;
            }
            for (i = 0; i < n; i++)
                arr[i] = output[i];
        }
        public void radixsort(Integer arr[], int n) {
            int m = getMax(arr, n);
            for (int exp = 1; m / exp > 0; exp *= 10)
                countSort(arr, n, exp);
        }
    }
}