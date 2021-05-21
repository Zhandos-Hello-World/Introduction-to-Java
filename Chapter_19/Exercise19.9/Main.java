/*
(Sort ArrayList) Write the following method that sorts an ArrayList:
public static <E extends Comparable<E>>
 void sort(ArrayList<E> list)
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 1000 + 0));
        }
        System.out.println("Before sort: " + list);
        sort(list);
        System.out.println("After sort: " + list);
    }
    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        boolean check = true;
        while (check) {
            check = false;
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i).compareTo(list.get(i - 1)) < 0) {
                    E temp = list.get(i);
                    list.set(i, list.get(i - 1));
                    list.set(i - 1, temp);
                    check = true;
                }
            }
        }
        // or we can write Collections.sort(list); 0_0

    }
}