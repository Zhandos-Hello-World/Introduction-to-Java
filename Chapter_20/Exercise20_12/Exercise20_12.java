/*
(Create Stack from list) Define a class MyStack that extends Stack to be
able to have its constructor use a list of objects instead of pushing each object
individually.
*/
import java.util.Stack;
import java.util.Collection;
import java.util.Arrays;

public class Exercise20_12{
	public static void main(String[]args){
		MyStack<Integer> stack = new MyStack<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		while(!stack.empty()){
			System.out.print(stack.pop() + " ");
		}
	}
}
class MyStack<T> extends Stack<T>{
    MyStack(Collection<? extends T> c){
        c.forEach(this::push);
    }
}