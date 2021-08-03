import java.util.ArrayList;

/*
(Use the GenericStack class) Write a program that displays the first 100 prime
numbers in descending order. Use a stack to store the prime numbers.
*/
public class Exercise24_04 {
    public static void main(String[]args){
        GenericStack<Integer> stack = new GenericStack<>();
        int i = 0;
        int num = 1;
        while (i < 100){
            if(check(num)){
                stack.push(num);
                i++;
            }
            num++;
        }
        while (!stack.isEmpty())
            System.out.println(stack.pop());

    }
    public static boolean check(int prime){
        int num = prime / 2;
        if(num == 0){
            return true;
        }
        while(num != 1){
            if(prime % num == 0){
                return false;
            }
            num--;
        }
        return true;
    }
}
class GenericStack<E> {
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
     @Override
    public String toString() {
        return "stack: " + list.toString();
    }
}
