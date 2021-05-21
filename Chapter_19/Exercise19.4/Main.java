/*
(Using wildcards) Write a generic static method that returns the smallest value in an
instance of Pair from Programming Exercise 19.3.
 */
public class Main {
    public static void main(String[]args){

    }
}
class Pair<E extends Comparable<E>, T extends E>{
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
        this.o2 =  o2;
    }
    public E getFirstObject(){
        return o1;
    }
    public T getSecondObject(){
        return o2;
    }
    public E min(){
        if(o1.compareTo(o2) < 0){
            return o1;
        }
        else{
            return o2;
        }
    }

}