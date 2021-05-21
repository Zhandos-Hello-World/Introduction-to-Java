/*
(Create a binary data file) Write a program to create a file named
Exercise17_02.dat if it does not exist. Append new data to it if it already exists.
Write 150 integers created randomly into the file using binary I/O.
 */


import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[]args) throws IOException {
        ArrayList<Integer> listData = new ArrayList<>();
        File file = new File("Exercise17_02.dat");
        if(file.exists()){
            try(FileInputStream fis = new FileInputStream(file)){
                int value;
                while((value = fis.read()) != -1){
                    listData.add(value);
                }
            }
        }
        for(int i = 0; i < 150; i++){
            listData.add((int)(Math.random() * 150 + 0));
        }


        try(FileOutputStream fos = new FileOutputStream(file)){
            for (Integer listDatum : listData) {
                fos.write(listDatum);
            }
        }
    }
}
