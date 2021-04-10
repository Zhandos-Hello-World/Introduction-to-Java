package com.company;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<String> set1 = new PriorityQueue<>(Arrays.asList("Chemistry", "Mathematics", "Biology",
                "English"));
        PriorityQueue<String> set2 = new PriorityQueue<>(Arrays.asList("Biology", "English", "Geography", "Physics"));

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Union of sets: " + union(set1, set2));

        System.out.println("Difference of sets: " + difference(set1, set2));

        System.out.println("Intersection of sets: " + intersection(set1, set2));

    }
    private static <T> PriorityQueue<T> union(
            PriorityQueue<T> set1, PriorityQueue<T> set2) {
        PriorityQueue<T> union = new PriorityQueue<>(set1);
        union.addAll(set2);
        return union;
    }
    private static <T>PriorityQueue<T> difference(PriorityQueue<T> set1, PriorityQueue<T> set2){
        PriorityQueue<T> set = new PriorityQueue<>(set1);
        set.removeAll(set2);
        return set;
    }
    private static <T> PriorityQueue<T> intersection(
            PriorityQueue<T> set1, PriorityQueue<T> set2) {
        PriorityQueue<T> intersection = new PriorityQueue<>(set1);
        intersection.retainAll(set2);
        return intersection;
    }
}