/*
(Display nonduplicate names in ascending order) Given one or more text files,
each representing a day’s attendance in a course and containing the names of the
students who attended the course on that particular day, write a program that displays, in ascending order, the names of those students who have attended at least
one day of the course. The text file(s) is/are passed as command-line argument(s).
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[]args) throws FileNotFoundException {
        if(args.length < 1){
            System.out.println("Usage: java Main NameFile.txt");
            System.exit(1);
        }
        File file = new File(args[0]);
        if(!file.exists()){
            System.out.println("File is not found");
            System.exit(1);
        }
        try(Scanner scanner = new Scanner(file)) {
            TreeMap<Integer, String> listMap = new TreeMap<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1.compareTo(o2);
                }
            });
            while(scanner.hasNext()){
                String name = scanner.next();
                Integer attendance = scanner.nextInt();
                listMap.put(attendance, name);
            }
            listMap.forEach((att, name) -> {System.out.println(att + ", " + name);});
        }
    }
}
