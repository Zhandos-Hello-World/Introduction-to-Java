/*
(Directory size)  Listing 18.10, DirectorySize.java, gives a recursive method
for finding a directory size. Rewrite this method without using recursion. Your
program should use a queue to store the subdirectories under a directory. The
algorithm can be described as follows:
long getSize(File directory) {
 long size = 0;
 add directory to the queue;
 while (queue is not empty) {
 Remove an item from the queue into t;
 if (t is a file)
 size += t.length();
 else
 add all the files and subdirectories under t into the
 queue;
 }
 return size;
}
*/
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.io.File;

public class Exercise20_18{
    public static void main(String[]args){
        System.out.print("Enter a directory or a file: ");
        Scanner input = new Scanner(System.in);
        String directory = input.nextLine();

        // Display the size
        System.out.println(getSize(new File(directory)) + " bytes");
    }
    public static long getSize(File file) {
        // Create a Queue
        Queue<File> queue = new LinkedList<>();
        long size = 0; // Accumulates the directory size
        for (File temp: file.listFiles()) {
            queue.offer(temp);
        }
        while (!queue.isEmpty()) {
            File t = queue.remove();
            if (t.isFile())
                size += t.length();
            else{
                for (File temp: t.listFiles()) {
                    queue.offer(temp);
                }
            }
        }
        return size;
    }
}