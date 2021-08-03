import java.util.ArrayList;

public class GenericStack<E> {
    private java.util.ArrayList<E> list = new java.util.ArrayList<>();

    public int getSize(){
        return list.size();
    }
    public boolean isEmpty(){
        return getSize() == 0;
    }
    public E peek(){
        return list.get(getSize() - 1);
    }
    public E pop(){
        E temp = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return temp;
    }
    public void push(E e){
        list.add(e);
    }

    public ArrayList<E> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }
}