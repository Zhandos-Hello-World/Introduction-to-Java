/* You have to use the following template to submit to Revel.
   Note: To test the code using the CheckExerciseTool, you will submit entire code.
   To submit your code to Revel, you must only submit the code enclosed between
     // BEGIN REVEL SUBMISSION

     // END REVEL SUBMISSION
*/
import java.util.*;

public class Exercise24_01 {
    public static void main(String[] args) {
        new Exercise24_01();
    }

    public Exercise24_01() {
        Scanner input = new Scanner(System.in);
        String[] name1 = new String[5];
        String[] name2 = new String[5];
        String[] name3 = new String[2];
        System.out.print("Enter five strings for array name1 separated by space: ");
        for (int i = 0; i < 5; i++) {
            name1[i] = input.next();
        }

        System.out.print("Enter five strings for array name2 separated by space: ");
        for (int i = 0; i < 5; i++) {
            name2[i] = input.next();
        }

        System.out.print("Enter two strings for array name3 separated by space: ");
        for (int i = 0; i < 2; i++) {
            name3[i] = input.next();
        }

        MyList<String> list1 = new MyArrayList<>(name1);
        MyList<String> list2 = new MyArrayList<>(name2);
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        list1.addAll(list2);
        System.out.println("After addAll: list1 is " + list1 + "\n");

        list1 = new MyArrayList<>(name1);
        list2 = new MyArrayList<>(name2);
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        list1.removeAll(list2);
        System.out.println("After removeAll: list1 is " + list1 + "\n");

        list1 = new MyArrayList<>(name1);
        list2 = new MyArrayList<>(name2);
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        list1.retainAll(list2);
        System.out.println("After retainAll: list1 is " + list1 + "\n");

        list1 = new MyArrayList<>(name1);
        list2 = new MyArrayList<>(name2);
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        list1.retainAll(list2);
        System.out.println("list1 contains all list2? " + list1.containsAll(list2) + "\n");

        list1 = new MyArrayList<>(name1);
        list2 = new MyArrayList<>(name3);
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println("list1 contains all list2? " + list1.containsAll(list2) + "\n");

        Object[] name4 = list1.toArray();
        System.out.print("name4: ");
        for (Object e: name4) {
            System.out.print(e + " ");
        }


        String[] name5 = new String[list1.size()];
        String[] name6 = list1.toArray(name5);
        System.out.print("\nname6: ");
        for (Object e: name6) {
            System.out.print(e + " ");
        }
    }
}

class MyArrayList<E> implements MyList<E> {
    public static final int INITIAL_CAPACITY = 16;
    private E[] data = (E[])new Object[INITIAL_CAPACITY];
    private int size = 0; // Number of elements in the list

    /** Create an empty list */
    public MyArrayList() {
    }

    /** Create a list from an array of objects */
    public MyArrayList(E[] objects) {
        for (E value:objects)
            add(value); // Warning: don’t use super(objects)!
    }

    @Override /** Add a new element at the specified index */
    public void add(int index, E e) {
        ensureCapacity();

        // Move the elements to the right after the specified index
        for (int i = size - 1; i >= index; i--)
            data[i + 1] = data[i];

        // Insert new element to data[index]
        data[index] = e;

        // Increase size by 1
        size++;
    }

    /** Create a new larger array, double the current size + 1 */
    private void ensureCapacity() {
        if (size >= data.length) {
            E[] newData = (E[])(new Object[size * 2 + 1]);
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

    @Override /** Clear the list */
    public void clear() {
        data = (E[])new Object[INITIAL_CAPACITY];
        size = 0;
    }

    @Override /** Return true if this list contains the element */
    public boolean contains(Object e) {
        for (int i = 0; i < size; i++)
            if (e.equals(data[i])) return true;

        return false;
    }

    @Override /** Return the element at the specified index */
    public E get(int index) {
        checkIndex(index);
        return data[index];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException
                    ("Index: " + index + ", Size: " + size);
    }

    @Override /** Return the index of the first matching element 
     *  in this list. Return -1 if no match. */
    public int indexOf(Object e) {
        for (int i = 0; i < size; i++)
            if (e.equals(data[i])) return i;

        return -1;
    }

    @Override /** Return the index of the last matching element 
     *  in this list. Return -1 if no match. */
    public int lastIndexOf(E e) {
        for (int i = size - 1; i >= 0; i--)
            if (e.equals(data[i])) return i;

        return -1;
    }

    @Override /** Remove the element at the specified position
     *  in this list. Shift any subsequent elements to the left.
     *  Return the element that was removed from the list. */
    public E remove(int index) {
        checkIndex(index);

        E e = data[index];

        // Shift data to the left
        for (int j = index; j < size - 1; j++)
            data[j] = data[j + 1];

        data[size - 1] = null; // This element is now null

        // Decrement size
        size--;

        return e;
    }

    @Override /** Replace the element at the specified position 
     *  in this list with the specified element. */
    public E set(int index, E e) {
        checkIndex(index);
        E old = data[index];
        data[index] = e;
        return old;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < size; i++) {
            result.append(data[i]);
            if (i < size - 1) result.append(", ");
        }

        return result.toString() + "]";
    }

    /** Trims the capacity to current size */
    public void trimToSize() {
        if (size != data.length) {
            E[] newData = (E[])(new Object[size]);
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        } // If size == capacity, no need to trim
    }

    @Override /** Override iterator() defined in Iterable */
    public java.util.Iterator<E> iterator() {
        return new ArrayListIterator();
    }


    private class ArrayListIterator
            implements java.util.Iterator<E> {
        private int current = 0; // Current index

        @Override
        public boolean hasNext() {
            return (current < size);
        }

        @Override
        public E next() {
            return data[current++];
        }

        @Override
        public void remove() {
            if (current == 0) // next() has not been called yet
                throw new IllegalStateException();
            MyArrayList.this.remove(--current);
        }
    }

    @Override /** Return the number of elements in this list */
    public int size() {
        return size;
    }
}

// BEGIN REVEL SUBMISSION
interface MyList<E> extends java.util.Collection<E> {
    E get(int index);
    int indexOf(Object e);
    int lastIndexOf(E e);
    E remove(int index);
    E set(int index, E e);
    void add(int index, E e);
    // WRITE YOUR CODE HERE
    @Override
    default boolean addAll(Collection<? extends E> collection){
        for(E value:collection)
            add(value);
        return true;
    }
    @Override
    default boolean isEmpty(){
        return size() == 0;
    }
    @Override
    default boolean removeAll(Collection<?> collection){
        if(isEmpty()){
            return false;
        }
        for(int i = 0; i < size(); i++){
            if(collection.contains(get(i))){
                remove(i);
                i--;
            }
        }
        return true;
    }
    @Override
    default Object[]toArray(){
        if(isEmpty())
            return null;
        Object[]obj = new Object[size()];
        for(int i = 0; i < size(); i++){
            obj[i] = get(i);
        }
        return obj;
    }
    @Override
    default boolean add(E e){
        add(size(), e);
        return true;
    }
    @Override
    default boolean remove(Object e){
        if(contains(e)){
            remove(indexOf(e));
            return true;
        }
        return false;
    }
    @Override
    default boolean containsAll(Collection<?> collection){
        for(Object value:collection){
            if(!contains(value)){
                return false;
            }
        }
        return true;
    }
    @Override
    default boolean retainAll(Collection<?> collection){
        if(isEmpty()){
            return false;
        }
        for(int i = 0; i < size(); i++){
            if(!collection.contains(get(i))){
                remove(i);
                i--;
            }
        }
        return true;
    }
    @Override
    default  <T> T[] toArray(T[] a) {
        if(a.length <= size()){
            for(int i = 0; i < a.length; i++){
                a[i] = (T)get(i);
            }
        }
        return a;
    }


}
// END REVEL SUBMISSION