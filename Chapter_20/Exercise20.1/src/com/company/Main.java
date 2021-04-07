package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main{
    public static void main (String[] args) throws FileNotFoundException{
        Scanner scanner = new Scanner(new File("src\\com\\company\\Napoleon Was Once Attacked By a Horde of Bunnies"));
        LinkedList<String>linkedList = new LinkedList<>();
        while (scanner.hasNext()){
            linkedList.add(scanner.next().toLowerCase());
        }
        scanner.close();
        Collections.sort(linkedList);
        linkedList.forEach(E->{
            System.out.println(E);
        });
    }
}