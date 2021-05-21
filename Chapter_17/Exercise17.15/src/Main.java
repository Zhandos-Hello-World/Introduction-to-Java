/*
(Decrypt files) Suppose a file is encrypted using the scheme in Programming
Exercise 17.14. Write a program to decode an encrypted file. Your program
should prompt the user to enter an input file name for the encrypted file and an
output file name for the unencrypted version of the input file.
 */
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
    public static void main(String[]args)throws IOException {
        try(RandomAccessFile source = new RandomAccessFile("encrypted.txt", "rw");
            RandomAccessFile target = new RandomAccessFile("decrypted.txt", "rw")){
            byte []b = new byte[(int)source.length()];
            source.read(b);
            for(int i = 0; i < b.length; i++){
                b[i]-=10;
            }
            target.write(b);
        }
    }
}
