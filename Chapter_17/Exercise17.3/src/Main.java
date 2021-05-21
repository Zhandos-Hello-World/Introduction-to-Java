/*
(Sum all the floating points in a binary data file) Suppose a binary data file
named Exercise17_03.dat has been created and its data are created using
writeDouble(double) in DataOutputStream. The file contains an unspecified number of floating points. Write a program to find the sum of the floating
points
 */
import java.io.*;
public class Main {
    public static void main(String[]args) throws IOException {
        File file = new File("Exercise17_3.dat");
        if(!file.exists()){
            try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))){
                for(int i = 0; i < 10; i++){
                    dos.writeDouble(Math.random() * 100 + 0);
                }
            }
        }
        double sum = 0.0;
        try{
            try(DataInputStream dis = new DataInputStream(new FileInputStream(file))){
                while(true)sum += dis.readDouble();
            }
        }
        catch (EOFException ex){
            System.out.println(sum);
        }
    }
}
