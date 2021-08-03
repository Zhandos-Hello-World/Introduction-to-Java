/*
(Generic PriorityQueue using Comparator) Revise MyPriorityQueue
in Listing 24.8, using a generic parameter for comparing objects. Define a new
constructor with a Comparator as its argument as follows:
PriorityQueue(Comparator<? super E> comparator)

*/
public class Exercise24_06 {
    public static void main(String[]args) {
        MyPriorityQueue<Integer> queue = new MyPriorityQueue<>();
        for(int i = 0; i < 100; i++){
            queue.enqueue((int)(Math.random() * 1000 + 0));
        }
        while(!queue.isEmpty())
            System.out.println(queue.dequeue());
    }
}
