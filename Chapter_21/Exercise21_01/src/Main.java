/*
(Perform set operations on hash sets) Given two stacks of textbooks of the following subjects 5"Chemistry", "Mathematics", "Biology", "English"6
and 5"Biology", "English", "Geography", "Physics"6 respectively, find
the subjects that are (1) only present in the first stack; (2) only present in the
second stack; (3) present in both stacks. (You may clone the sets to preserve the
original sets from being changed by set methods.)
 */
import java.util.*;
public class Main{
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>(Arrays.asList("Chemistry", "Mathematics", "Biology", "English"));
        HashSet<String> set2 = new HashSet<>(Arrays.asList("Biology", "English", "Geography", "Physics"));

        System.out.println("subset 1: " + subset(set1, set2));
        System.out.println("subset 2: " + subset(set2, set1));
        System.out.println("Intersection both set: " + interSection(set1, set2));
    }

    public static <E> HashSet<E> subset(HashSet<E> set1, HashSet<E> set2){
        HashSet<E> temp = new HashSet<>(set1);
        temp.removeAll(set2);
        return temp;
    }
    public static <E> HashSet<E> interSection(HashSet<E> set1, HashSet<E> set2){
        HashSet<E> temp = new HashSet<>(set1);
        temp.retainAll(set2);
        return temp;
    }
}