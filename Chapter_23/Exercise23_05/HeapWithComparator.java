/*
(Generic Heap using Comparator) Revise Heap in Listing 23.9, using a generic
parameter and a Comparator for comparing objects. Define the class as follows:
class HeapWithComparator<E> {
 private Comparator<? super E> comparator; // For comparing elements
 public HeapWithComparator() {
 // Implement no−arg constructor by creating a comparator for
 natural order
 }
 public HeapWithComparator(Comparator<? super E> comparator) {
 this.comparator = comparator;
 }
 // Implement all add, remove, and getSize method
}
*/
import java.util.Collection;
import java.util.Comparator;

public class HeapWithComparator<E> {
    private java.util.ArrayList<E> list = new java.util.ArrayList<>();
    private Comparator<? super E> comparator; // For comparing elements
    public HeapWithComparator() {
        // Implement no−arg constructor by creating a comparator for natural order
        comparator = (e1, e2) -> ((Comparable<E>)e1).compareTo(e2);
    }
    public HeapWithComparator(Comparator<? super E> comparator) {
        this.comparator = comparator;
    }
    // Implement all add, remove, and getSize method
    public void addAll(E[] newObjects){
        for(E value:newObjects){
            add(value);
        }
    }
    public void addAll(Collection<E> newObjects){
        newObjects.forEach(this::add);
    }
    public int getSize(){
        return list.size();
    }


    public E remove() {
        if (list.size() == 0) return null;

        E removedObject = list.get(0);
        list.set(0, list.get(list.size() - 1));
        list.remove(list.size() - 1);

        int currentIndex = 0;
        while (currentIndex < list.size()) {
            int leftChildIndex = 2 * currentIndex + 1;
            int rightChildIndex = 2 * currentIndex + 2;

            // Find the maximum between two children
            if (leftChildIndex >= list.size()) break; // The tree is a heap
            int maxIndex = leftChildIndex;
            if (rightChildIndex < list.size()) {
                if (comparator.compare(list.get(maxIndex),
                        list.get(rightChildIndex)) < 0) {
                    maxIndex = rightChildIndex;
                }
            }

            // Swap if the current node is less than the maximum
            if (comparator.compare(list.get(currentIndex),
                    list.get(maxIndex)) < 0) {
                E temp = list.get(maxIndex);
                list.set(maxIndex, list.get(currentIndex));
                list.set(currentIndex, temp);
                currentIndex = maxIndex;
            }
            else
                break; // The tree is a heap
        }

        return removedObject;
    }


    /** Add a new object into the heap */
    public void add(E newObject) {
        list.add(newObject); // Append to the heap
        int currentIndex = list.size() - 1; // The index of the last node

        while (currentIndex > 0) {
            int parentIndex = (currentIndex - 1) / 2;
            // Swap if the current object is greater than its parent
            if (comparator.compare(list.get(currentIndex),
                    list.get(parentIndex)) > 0) {
                E temp = list.get(currentIndex);
                list.set(currentIndex, list.get(parentIndex));
                list.set(parentIndex, temp);
            }
            else
                break; // the tree is a heap now

            currentIndex = parentIndex;
        }
    }

}