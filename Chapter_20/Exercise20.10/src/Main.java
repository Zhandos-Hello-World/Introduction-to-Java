/*
(Perform set operations on priority queues) Given two stacks of textbooks
of the following subjects {“Chemistry”, “Mathematics”, “Biology”,
“English”} and {“Biology”, “English”, “Geography”, “Physics”},
find the subjects that are (1) only present in the first stack; (2) only present in
the second stack; (3) present in both stacks.
 */

import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
    static PriorityQueue<String> queue = new PriorityQueue<>(Arrays.asList("Chemistry", "Mathematics", "Biology", "English"));
    static PriorityQueue<String> queue1 = new PriorityQueue<>(Arrays.asList("Biology", "English", "Geography", "Physics"));

    public static void main(String[]args) {
        System.out.println("(1) only present in the first stack " + subset(queue, queue1));
        System.out.println("(2) only present in the second stack " + subset(queue1, queue));
        System.out.println("(3) present in both stacks " + interSection(queue, queue1));
    }
    public static<E> PriorityQueue<E> subset(PriorityQueue<E>set1, PriorityQueue<E>set2){
        PriorityQueue<E> temp = new PriorityQueue<>(set1);
        temp.removeAll(set2);
        return temp;
    }
    public static<E> PriorityQueue<E> interSection(PriorityQueue<E>set1, PriorityQueue<E>set2){
        PriorityQueue<E> temp = new PriorityQueue<>(set1);
        temp.retainAll(set2);
        return temp;
    }
}
