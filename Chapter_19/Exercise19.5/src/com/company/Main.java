package com.company;

public class Main {
    public static void main(String[] args) {
	    Integer []numbers = new Integer[100];
	    for(int i = 0; i < numbers.length; i++){
	        numbers[i] = i;
        }
	    System.out.print(max(numbers));
    }
    public static <E extends Comparable<E>> E max(E[] list){
        E max = list[0];
        for(int i = 0; i < list.length; i++){
            if(list[i].compareTo(max) > 0){
                max = list[i];
            }
        }
        return max;
    }
}
