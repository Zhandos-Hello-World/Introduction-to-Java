/*
(Revising Listing 19.1) Revise the GenericStack class in Listing 19.1 to implement it using an array rather than an ArrayList.
You should check the array size before adding a new element to the stack. If the array is full, create a new array that
doubles the current array size and copy the elements from the current array to the
new array.
 */

import java.math.BigInteger;
import java.util.Arrays;

public class Main {
    public static void main(String[]args) {
        GenericStack<Integer> list = new GenericStack<>();
        for(int i = 0; i < 100; i++){
            list.push(i);
        }
        System.out.println(list.peek());
        for(int i = 0; i < 10; i++){
            System.out.println(list.pop());
        }
        System.out.println(list.toString());

        GenericStack<String> s = new GenericStack<>();
        s.push("Hello");
        s.push("Hi");
        s.push("How are you?");
        System.out.println(s.toString());
        GenericStack<Integer> i = new GenericStack<>();
        i.push(3);
        i.push(4);
        System.out.println(i.toString());
        GenericStack<Number> numbers = new GenericStack<>();
        numbers.push(32);
        numbers.push(15.2);
        numbers.push(131.3f);
        numbers.push(new BigInteger("42222222333333344"));
        System.out.println(numbers.peek());
        System.out.println(numbers.toString());
        numbers.pop();
        System.out.print(numbers.toString());
    }
}
class GenericStack<E>{
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