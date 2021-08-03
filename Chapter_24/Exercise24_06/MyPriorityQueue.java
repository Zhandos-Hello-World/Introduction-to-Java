import java.util.Comparator;

public class MyPriorityQueue<E>{
    private Heap<E> heap;

    public MyPriorityQueue(){
        heap = new Heap<>();
    }
    public MyPriorityQueue(Comparator<? super E> comparator){
        heap = new Heap<>(comparator);
    }
    public void enqueue(E newObject){
        heap.add(newObject);
    }
    public E dequeue(){
        return heap.remove();
    }
    public int getSize(){
        return heap.getSize();
    }
    public boolean isEmpty(){
        return heap.isEmpty();
    }
}
