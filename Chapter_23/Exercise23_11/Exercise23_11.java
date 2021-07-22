import java.util.Comparator;

/* You have to use the following template to submit to Revel.
   Note: To test the code using the CheckExerciseTool, you will submit entire code.
   To submit your code to Revel, you must only submit the code enclosed between
     // BEGIN REVEL SUBMISSION

     // END REVEL SUBMISSION
*/
/* You only need to write your code for the clone and equals methods */
public class Exercise23_11 {
    public static void main(String[] args) {
        String[] strings = {"red", "green", "purple", "orange", "yellow", "cyan"};
        Heap<String> heap1 = new Heap<>(strings);
        Heap<String> heap2 = (Heap<String>)(heap1.clone());

        System.out.println("heap1: " + heap1.getSize());
        System.out.println("heap2: " + heap2.getSize());
        System.out.println("equals? " + heap1.equals(heap2));

        heap1.remove();

        System.out.println("heap1: " + heap1.getSize());
        System.out.println("heap2: " + heap2.getSize());

        System.out.println("equals? " + heap1.equals(heap2));
    }

    public static class Heap<E> implements Cloneable {
        private java.util.ArrayList<E> list = new java.util.ArrayList<>();
        private java.util.Comparator<? super E> c;

        /** Create a default heap using a natural order for comparison */
        public Heap() {
            this.c = (e1, e2) -> ((Comparable<E>)e1).compareTo(e2);
        }

        /** Create a heap with a specified comparator */
        public Heap(java.util.Comparator<E> c) {
            this.c = c;
        }

        /** Create a heap from an array of objects */
        public Heap(E[] objects) {
            this.c = (e1, e2) -> ((Comparable<E>)e1).compareTo(e2);
            for (int i = 0; i < objects.length; i++)
                add(objects[i]);
        }

        /** Add a new object into the heap */
        public void add(E newObject) {
            list.add(newObject); // Append to the heap
            int currentIndex = list.size() - 1; // The index of the last node

            while (currentIndex > 0) {
                int parentIndex = (currentIndex - 1) / 2;
                // Swap if the current object is greater than its parent
                if (c.compare(list.get(currentIndex),
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

        /** Remove the root from the heap */
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
                    if (c.compare(list.get(maxIndex),
                            list.get(rightChildIndex)) < 0) {
                        maxIndex = rightChildIndex;
                    }
                }

                // Swap if the current node is less than the maximum
                if (c.compare(list.get(currentIndex),
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

        /** Get the number of nodes in the tree */
        public int getSize() {
            return list.size();
        }

        /** Return true if heap is empty */
        public boolean isEmpty() {
            return list.size() == 0;
        }

        // BEGIN REVEL SUBMISSION
        public Object clone() {
            // Write your code here
            // Hint: Need to perform a deep copy. See Section 13.7 for reference
            Heap<E> temp = new Heap<>((Comparator<E>) c);
            list.forEach(temp::add);
            return temp;
        }

        public boolean equals(Object o) {
            // Write your code here
            if(o == this){
                return true;
            }
            if(!(o instanceof Heap)){
                return false;
            }
            Heap temp = (Heap)o;
            return temp.c.equals(c) && temp.list.equals(list);
        }
// END REVEL SUBMISSION
    }
}