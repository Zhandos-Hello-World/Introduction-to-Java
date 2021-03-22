package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
	    Integer[] integers = new Integer[100];
	    for(int i = 0; i < integers.length; i++){
	        integers[i] = i;
        }
	    System.out.print(binarySearch(integers, 9));
    }
    public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high / 2);
            if (key.compareTo(list[mid]) < 0)
                high = mid - 1;
            else if (key.compareTo(list[mid]) == 0)
                return mid;
            else
                low = mid + 1;
        }

        return -low - 1;
    }
}
