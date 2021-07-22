/*
(Generic merge sort) Write the following two generic methods using merge sort.
The first method sorts the elements using the Comparable interface and the
second uses the Comparator interface.

public static <E extends Comparable<E>> void mergeSort(E[] list)
public static <E> void mergeSort(E[] list, Comparator<? super E> comparator)
*/
import java.util.Comparator;
import java.util.Arrays;
public class Exercise23_02{
    public static void main(String[]args){
        //testing
        Double[]doubleNum = new Double[10];
        Integer[]numbers = new Integer[10];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int)(Math.random() * 100 + 0);
            doubleNum[i] = Math.random() * 100 + 0;
        }
        mergeSort(numbers);
        mergeSort(doubleNum, new Comparator<Double>(){
            @Override
            public int compare(Double o1, Double o2){
                if(o1 < o2){
                    return 1;
                }
                else if(o1 > o2){
                    return -1;
                }
                return 0;
            }
        });
        for(Integer value:numbers){
            System.out.println(value);
        }
        System.out.println("____________________");
        for(Double value:doubleNum){
            System.out.println(value);
        }
        System.out.println("____________________");
    }
    public static <E extends Comparable<E>> void mergeSort(E[] list){
        if(list.length > 1){
            E[]firsList = (E[])new Comparable[list.length / 2];
            System.arraycopy(list, 0, firsList, 0, list.length / 2);
            mergeSort(firsList);

            E[]secondList = (E[])new Comparable[list.length - list.length / 2];
            System.arraycopy(list, list.length / 2, secondList, 0, list.length - list.length / 2);
            mergeSort(secondList);

            merge(firsList, secondList, list);
        }
    }
    public static <E extends Comparable<E>> void merge(E[]list1, E[]list2, E []temp){
        int current1 = 0, current2 = 0, current3 = 0;
        while(current1 < list1.length && current2 < list2.length){
            if(list1[current1].compareTo(list2[current2]) < 0)
                temp[current3++] = list1[current1++];
            else
                temp[current3++] = list2[current2++];
        }
        while(current1 < list1.length){
            temp[current3++] = list1[current1++];
        }
        while(current2 < list2.length){
            temp[current3++] = list2[current2++];
        }
    }


    public static <E> void mergeSort(E[] list, Comparator<? super E> comparator){
        if(list.length > 1){
            E[] firstHalf = Arrays.copyOf(list, list.length / 2);
            mergeSort(firstHalf, comparator);

            E[] secondHalf = Arrays.copyOfRange(list, list.length / 2, list.length);
            mergeSort(secondHalf, comparator);

            merge(firstHalf, secondHalf, list, comparator);
        }
    }
    public static <E> void merge(E[]list1, E[]list2, E []temp, Comparator<? super E> comparator){
        int current1 = 0, current2 = 0, current3 = 0;
        while(current1 < list1.length && current2 < list2.length){
            if(comparator.compare(list1[current1], list2[current2]) < 0)
                temp[current3++] = list1[current1++];
            else
                temp[current3++] = list2[current2++];
        }
        while(current1 < list1.length){
            temp[current3++] = list1[current1++];
        }
        while(current2 < list2.length){
            temp[current3++] = list2[current2++];
        }
    }

}