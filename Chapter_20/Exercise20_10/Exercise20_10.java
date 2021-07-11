/*
(Perform set operations on priority queues) Given two stacks of textbooks
of the following subjects {"Chemistry", "Mathematics", "Biology",
"English"} and {"Biology", "English", "Geography", "Physics"},
find the subjects that are (1) only present in the first stack; (2) only present in
the second stack; (3) present in both stacks.
*/
import java.util.PriorityQueue;
import java.util.Arrays;
public class Exercise20_10{
	public static void main(String[]args){
		PriorityQueue<String> list1 = new PriorityQueue<>(Arrays.asList("Chemistry", "Mathematics", "Biology", "English"));
		PriorityQueue<String> list2 = new PriorityQueue<>(Arrays.asList("Biology", "English", "Geography", "Physics"));
		//(1) only present in the first stack;
		difference(list1, list2);
		// (2) only present in the second stack;
		difference(list2, list1);
		//(3) present in both stacks.
		intersection(list1, list2);
	}

	public static void difference(PriorityQueue<String> list1, PriorityQueue<String> list2){
		PriorityQueue<String> temp = new PriorityQueue<>(list1);
		temp.removeAll(list2);
		System.out.println(temp);
	}
	public static void intersection(PriorityQueue<String> list1, PriorityQueue<String> list2){
		PriorityQueue<String> temp = new PriorityQueue<>(list1);
		temp.retainAll(list2);
		System.out.println(temp);
	}
}