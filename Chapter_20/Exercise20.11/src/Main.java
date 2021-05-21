/*
(Remove Consecutive Integers) Write a program that reads 10 integers and
displays them in the reverse of the order in which they were read. If two consecutive numbers are identical, then only display one of them. Implement your
program using only stack and not arrays or queues.
 */
import java.util.Stack;

public class Main {
    public static void main(String[]args){
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < 10; i++){
            int random = (int)(Math.random() * 12 + 0);
            if(!stack.contains(random)){
                stack.push(random);
            }
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
