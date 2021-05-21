/*
(Combine files) Write a utility program that combines the files together into a
new file using the following command:
java Exercise17_12 SourceFile1 . . . SourceFilen TargetFile
The command combines SourceFile1, . . . , and SourceFilen into TargetFile.
 */

import java.io.IOException;
import java.io.RandomAccessFile;


public class Main {
    public static void main(String[]args)throws IOException {
        if (args.length < 2) {
            System.out.println("Usage: java Exercise_17_12 SourceFile1 . . . SourceFilen TargetFile");
            System.exit(0);
        }
        RandomAccessFile[] sourceFiles = new RandomAccessFile[args.length - 1];
        for(int i = 0; i < sourceFiles.length; i++){
            sourceFiles[i] = new RandomAccessFile(args[i], "rw");
        }

        RandomAccessFile targetFile = new RandomAccessFile(args[args.length - 1], "rw");

        for(int i = 0; i < sourceFiles.length; i++){
            byte[] b = new byte[(int)sourceFiles[i].length()];
            sourceFiles[i].seek(0);
            sourceFiles[i].read(b);
            targetFile.seek(targetFile.length());
            targetFile.write(b);
            sourceFiles[i].close();
        }
        targetFile.close();

    }
}
