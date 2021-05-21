/*
(Revising Listing 23.4) to make it be generic bubble sort
 */

import java.util.Arrays;

public class Main {
    public static void main(String[]args){
        Integer[]list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        bubbleSort(list);
        System.out.println(Arrays.toString(list));
    }
    public static <E extends Comparable<E>>void bubbleSort(E[]list){
        for(int k = 1; k < list.length; k++){
            for(int i = 0; i < list.length - k; i++){
                if(list[i].compareTo(list[i + 1]) > 0){
                    E temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }
            }
        }
    }
}