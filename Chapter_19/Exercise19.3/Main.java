/*
(Pair of objects of the same type) Create a Pair class that encapsulates two objects
of the same data type in an instance of Pair.
 */
public class Main {
    public static void main(String[]args){

    }
}
class Pair<E, T extends E>{
    private E o1;
    private T o2;

    Pair(E o1, T o2){
        this.o1 = o1;
        this.o2 = o2;
    }
    public void setFirstObject(E o1){
        this.o1 = o1;
    }
    public void setSecondObject(T o2){
        this.o2 = o2;
    }
    public E getFirstObject(){
        return o1;
    }
    public T getSecondObject(){
        return o2;
    }
}