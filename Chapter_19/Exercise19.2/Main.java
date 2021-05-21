import java.util.ArrayList;
import java.util.Arrays;

/*
(Implement GenericStack using inheritance) In Listing 19.1, GenericStack is
implemented using composition. Define a new stack class that extends ArrayList.
Draw the UML diagram for the classes then implement GenericStack. Write a test
program that prompts the user to enter five strings and displays them in reverse order.
 */
public class Main {
    public static void main(String[]args){
        GenericStack<String> list = new GenericStack<>();
        list.push("Hello_World_1");
        list.push("Hello_World_2");
        list.push("Hello_World_3");
        list.push("Hello_World_4");
        list.push("Hello_World_5");
        list.reverse();
        System.out.println(list.toString());
    }
}
class GenericStack<E> extends ArrayList<E>{
    private E []list;
    private int size = 1;
    private int initialCapacity;

    GenericStack(){
        list = (E[])(new Object[size]);
    }
    public int getSize(){
        return list.length;
    }
    public E peek(){
        return list[list.length - 1];
    }
    public void reverse(){
        E []temp = (E[])(new Object[size]);
        for(int i = 0, j = temp.length - 1; i < list.length; i++, j--){
            temp[i] = list[j];
        }
        list = temp;
    }

    public void push(E o){
        if(initialCapacity == size){
            size += 1;
            E[]temp = (E[])new Object[size];
            for(int i = 0; i < list.length; i++){
                temp[i] = list[i];
            }
            list = temp;
        }
        list[initialCapacity] = o;
        initialCapacity++;
    }
    public E pop(){
        E o = list[list.length - 1];
        size--;
        E[]temp = (E[])new Object[size];
        for(int i = 0; i < size; i++){
            temp[i] = list[i];
        }
        list = temp;
        initialCapacity--;
        return o;
    }
    public boolean isEmpty(){
        return list.length == 0;
    }
    @Override
    public String toString(){
        return "stack: " + Arrays.toString(list);
    }
}
