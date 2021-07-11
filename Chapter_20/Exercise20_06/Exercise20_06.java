/*
(Use iterators on ArrayList) Write a test program that stores 10 million integers
in ascending order (i.e., 1,2, . . ., 10m) in an ArrayList, displays the execution
time taken to traverse the list, and searches for the 10 millionth element using
the get(index) vs using the iterator method.
*/
import java.util.ArrayList;
import java.util.Iterator;
public class Exercise20_06{
	public static void main(String[]args){
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 1; i < 10000000; i++){
			list.add(i);
		}
		Long startTime = System.currentTimeMillis();
		for(int i = 0; i < list.size(); i++){
			list.get(i);
		}
		Long endTime = System.currentTimeMillis();
		System.out.println("Using get(index): " + (endTime - startTime));
		Iterator<Integer> iterator = list.iterator();
		startTime = System.currentTimeMillis();
		while(iterator.hasNext()){
			iterator.next();
		}
		endTime = System.currentTimeMillis();
		System.out.print("Using iterator: " + (endTime - startTime));

	}
}