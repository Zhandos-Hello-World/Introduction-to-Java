/*
(Use iterators on ArrayList) Write a test program that stores 10 million integers
in ascending order (i.e., 1,2, . . ., 10m) in an ArrayList, displays the execution
time taken to traverse the list, and searches for the 10 millionth element using
the get(index) vs using the iterator method.
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[]args){
        ArrayList<Integer> list = new ArrayList<>();
        long start = System.currentTimeMillis();
        for(int i = 0; i < 10000000; i++){
            list.add(i);
        }
        long end = System.currentTimeMillis();
        long result = end - start;
        System.out.println("Time of the adding to the Arraylist: " + result);

        start = System.currentTimeMillis();
        for(int i = 0; i < list.size(); i++) {
            getQ(list.get(i));
        }
        end = System.currentTimeMillis();
        result = end - start;
        System.out.println("Time is via 'for loop': " + result);

        start = System.currentTimeMillis();
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            getQ(iterator.next());
        }
        end = System.currentTimeMillis();
        result = end - start;
        System.out.println("Time is via 'iterator ': " + result);
    }
    public static void getQ(Integer integer){

    }
}
