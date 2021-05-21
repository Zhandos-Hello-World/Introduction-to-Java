/*
(Shuffle ArrayList) Write the following method that shuffles an ArrayList:
public static <E> void shuffle(ArrayList<E> list)
 */

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[]args){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            list.add(i);
        }
        shuffle(list);
        System.out.println(list);
    }
    public static <E> void shuffle(ArrayList<E> list){
        Collections.shuffle(list);
    }
}

