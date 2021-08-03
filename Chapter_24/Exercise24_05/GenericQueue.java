import java.util.LinkedList;

public class GenericQueue <E> extends LinkedList <E>{
    public void enqueue(E e){
        addLast(e);
    }
    public E dequeue(){
        return removeFirst();
    }
    @Override
    public String toString() {
        return "Queue: " + super.toString();
    }
}
