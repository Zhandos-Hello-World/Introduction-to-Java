/*
(Baby name popularity ranking) Revise Programming Exercise 21.11 to
prompt the user to enter year, gender, and name and display the ranking for the
name. Prompt the user to enter another inquiry or exit the program. Here is a
sample run:
 */

import java.io.IOException;
import java.net.URL;
import java.util.*;

public class Main{

    private static final String[]links = {
            "http://liveexample.pearsoncmg.com/data/babynamesranking2001.txt",
            "http://liveexample.pearsoncmg.com/data/babynamesranking2002.txt",
            "http://liveexample.pearsoncmg.com/data/babynamesranking2003.txt",
            "http://liveexample.pearsoncmg.com/data/babynamesranking2004.txt",
            "http://liveexample.pearsoncmg.com/data/babynamesranking2005.txt",
            "http://liveexample.pearsoncmg.com/data/babynamesranking2006.txt",
            "http://liveexample.pearsoncmg.com/data/babynamesranking2007.txt",
            "http://liveexample.pearsoncmg.com/data/babynamesranking2008.txt",
            "http://liveexample.pearsoncmg.com/data/babynamesranking2009.txt",
            "http://liveexample.pearsoncmg.com/data/babynamesranking2010.txt",
    };
    public static void main(String[]args) throws IOException{
        LinkedHashMap<String, Integer>[]male = new LinkedHashMap[10];
        for(int i = 0; i < male.length; i++){
            male[i] = new LinkedHashMap<>();
        }
        LinkedHashMap<String, Integer>[]female = new LinkedHashMap[10];
        for(int i = 0; i < female.length; i++){
            female[i] = new LinkedHashMap<>();
        }
        for(int i = 0; i < 10; i++){
            URL url = new URL(links[i]);
            try(Scanner scanner = new Scanner(url.openStream())){
                while(scanner.hasNextLine()){
                    int rank = scanner.nextInt();
                    male[i].put(scanner.next(), rank);
                    scanner.next();
                    female[i].put(scanner.next(), rank);
                    scanner.next();
                }
            }
        }
        Scanner str = new Scanner(System.in);
        boolean repeat = true;
        while(true){
            if(repeat){
               repeat = false;
            }
            else{
                System.out.print("Enter another inquiry? ");
                char y;
                while(true){
                    y = str.next().toLowerCase().charAt(0);
                    if(y == 'y'){
                        break;
                    }
                    else if(y == 'n'){
                        System.exit(1);
                    }
                    else{
                        System.out.print("You need to repeat (Y/N for counting): ");
                    }
                }
            }

            System.out.print("Enter the year: ");
            int year = str.nextInt() % 2000 - 1;
            System.out.print("Enter the gender: ");
            int gender = str.next().toLowerCase().charAt(0) == 'm' ? 1:0;
            System.out.print("Enter the name: ");
            String name = str.next();
            if(gender == 1){
                if(male[year].containsKey(name.trim())){
                    System.out.println("Boy name " + name.trim() + " is ranked #" + male[year].get(name.trim()) + " in year " + (2001 + year));
                }
                else{
                    System.out.println("Boy with name is not found");
                }
            }
            else{
                if(female[year].containsKey(name.trim())){
                    System.out.println("Girl name " + name.trim() + " is ranked #" + female[year].get(name.trim()) + " in year " + (2001 + year));
                }
                else{
                    System.out.println("Girl with name is not found");
                }
            }
        }

    }
}
