/*
(Implement GenericQueue using inheritance) In Section 24.5, Stacks and
Queues, GenericQueue is implemented using composition. Define a new queue
class that extends java.util.LinkedList
*/
public class Exercise24_05 {
    public static void main(String[]args){
        GenericQueue<Integer> stack = new GenericQueue<>();
        int i = 0;
        int num = 1;
        while (i < 100){
            if(check(num)){
                stack.enqueue(num);
                i++;
            }
            num++;
        }
        while (!stack.isEmpty())
            System.out.println(stack.dequeue());

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

