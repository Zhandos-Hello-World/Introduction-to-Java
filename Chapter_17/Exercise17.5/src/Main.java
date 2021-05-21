/*
(Store objects and arrays in a file) Write a program that stores an array of the six
int values 1, 2, 3, 4,5, and 6, a Date object for the current time, and the double
value 10.5 into the file named Exercise17_05.dat.
 */
import java.io.*;
import java.util.Date;
public class Main {

    public static void main(String[]args) throws IOException{
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Exercise17_05.dat"))){
            for(int i = 1; i <= 6; i++){
                oos.writeInt(i);
            }
            oos.writeObject(new Date());
            oos.writeDouble(10.5);
        }
    }
}
