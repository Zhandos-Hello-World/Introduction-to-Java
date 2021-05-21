/*
(Encrypt files) Encode the file by adding 10 to every byte in the file. Write a gram
that prompts the user to enter an input file name and an output file name and saves
the encrypted version of the input file to the output file.
*/


import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
    public static void main(String[]args) throws IOException {
        try(RandomAccessFile source = new RandomAccessFile("SourceFile.txt", "rw");
            RandomAccessFile target = new RandomAccessFile("encrypted.txt", "rw")){
            target.seek(0);
            byte[]b = new byte[(int)source.length()];
            source.read(b);
            for(int i = 0; i < b.length; i++){
                b[i] += 10;
            }
            target.write(b);
        }
    }
}
