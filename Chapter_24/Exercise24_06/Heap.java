import java.util.ArrayList;
import java.util.Comparator;

public class Heap <E>{
    private Comparator<? super E> c;
    private final ArrayList<E> list = new ArrayList<>();

    public Heap(){
        c = (e1, e2) -> ((Comparable<E>)e1).compareTo(e2);
    }
    public Heap(E[]objects){
        this();
        addAll(objects);
    }
    public Heap(E[]objects, Comparator<? super E> c){
        this(objects);
        this.c = c;
    }
    public Heap(Comparator<? super E> c){
        this.c = c;
    }
    public void addAll(E[]objects){
        for(E value:objects)
            add(value);
    }

    public void add(E e){
        list.add(e);
        int currentIndex = list.size() - 1;
        while(currentIndex > 0){
            int parentIndex = (currentIndex - 1) / 2;
            if(c.compare(list.get(parentIndex), list.get(currentIndex)) < 0){
                E temp = list.get(parentIndex);
                list.set(parentIndex, list.get(currentIndex));
                list.set(currentIndex, temp);
            }
            else break;
            currentIndex = parentIndex;
        }
    }
    public E remove(){
        if(list.isEmpty())return null;
        E removedObject = list.get(0);
        list.set(0, list.get(list.size() - 1));
        list.remove(list.size() - 1);
        int currentIndex = 0;
        while(currentIndex < list.size()){
            int leftChildIndex = 2 * currentIndex + 1;
            int rightChildIndex = 2 * currentIndex + 2;
            if(leftChildIndex >= list.size())break;
            int max = leftChildIndex;
            if(rightChildIndex < list.size()){
                if(c.compare(list.get(max), list.get(rightChildIndex)) < 0){
                    max = rightChildIndex;
                }
            }
            if(c.compare(list.get(currentIndex), list.get(max)) < 0){
                E temp = list.get(max);
                list.set(max, list.get(currentIndex));
                list.set(currentIndex, temp);
                currentIndex = max;
            }
            else break;
        }
        return removedObject;
    }
    public int getSize(){
        return list.size();
    }
    public boolean isEmpty(){
        return getSize() == 0;
    }
}
