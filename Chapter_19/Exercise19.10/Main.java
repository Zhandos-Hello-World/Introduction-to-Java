/*
(Smallest element in ArrayList) Write the following method that returns the
smallest element in an ArrayList:
public static <E extends Comparable<E>> E min(ArrayList<E> list)
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[]args){
        ArrayList<Integer>list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            list.add((int)(Math.random() * 1000 + 0));
        }
        System.out.println(list);
        System.out.println("Min number is: " + min(list));
    }
    public static <E extends Comparable<E>> E min(ArrayList<E> list){
        E min = list.get(0);
        for(int i = 0; i < list.size(); i++){
            if(min.compareTo(list.get(i)) > 0){
                min = list.get(i);
            }
        }
        return min;
    }
}
