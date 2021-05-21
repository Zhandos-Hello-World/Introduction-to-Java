import java.io.IOException;
import java.io.RandomAccessFile;

/*
(Update count) Suppose that you wish to track how many times a program has
been executed. You can store an int to count the file. Increase the count by 1
each time this program is executed. Let the program be Exercise17_08.txt and
store the count in Exercise17_08.dat.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        try (RandomAccessFile inout = new RandomAccessFile("Exercise17_08.dat", "rw");) {
            if (inout.length() == 0) {
                inout.writeInt(1);
            }
            else {
                int count = inout.readInt();
                inout.seek(0);
                inout.writeInt(++count);
            }
        }
    }
}