/*
(Remove Consecutive Integers) Write a program that reads 10 integers and
displays them in the reverse of the order in which they were read. 
If two consecutive numbers are identical, then only display one of them. Implement your
program using only stack and not arrays or queues
*/
import java.util.Stack;
import java.util.Arrays;
public class Exercise20_11{
    public static void main(String[]args){
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < 10; i++){
            stack.push((int)(Math.random() * 10 + 0));
        }
        while(!stack.empty()){
            int num = stack.pop();
            if(!stack.contains(num)){
                System.out.println(num);
            }
        }
    }
}