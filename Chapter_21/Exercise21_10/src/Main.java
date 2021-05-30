/*
(Count the occurrences of each keyword) Rewrite Listing 21.7, CountKeywords.
java to read in a Java source-code file and count the occurrence of each keyword
in the file, but don’t count the keyword if it is in a comment or in a string literal.
 */

import java.io.File;
import java.io.FileNotFoundException;

import java.util.*;

public class Main {
    public static void main(String[]args) throws FileNotFoundException {
        if(args.length != 1){
            System.out.print("Usage: java Main source.java");
            System.exit(1);
        }
        File path = new File(args[0]);
        try(Scanner scanner = new Scanner(path)){
            String[] keywordString = {"abstract", "assert", "boolean",
                    "break", "byte", "case", "catch", "char", "class", "const",
                     "continue", "default", "do", "double", "else", "enum",
                     "extends", "for", "final", "finally", "float", "goto",
                     "if", "implements", "import", "instanceof", "int",
                     "interface", "long", "native", "new", "package", "private",
                     "protected", "public", "return", "short", "static",
                     "strictfp", "super", "switch", "synchronized", "this",
                     "throw", "throws", "transient", "try", "void", "volatile",
                     "while", "true", "false", "null"};
            Map <String, Integer> map = new HashMap<>();
            for(String str:keywordString){
                map.put(str, 0);
            }
            while(scanner.hasNext()){
                String key = scanner.next();
                if(findComment(key)){
                    scanner.nextLine();
                }
                else if(findLiteral(key) == 1 || findLiteral(key) == 2){
                    if(findLiteral(key) == 1){
                        boolean check = true;
                        while(check){
                            key = scanner.next();
                            if(findLiteral(key) == 1){
                                check = false;
                            }
                        }
                    }
                }
                else{
                    if(map.containsKey(key)){
                        int value = map.get(key);
                        value++;
                        map.put(key, value);
                    }
                }

            }
            Map<Integer, String> sortedMap = new TreeMap<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    if(o1 >= o2){
                        return -1;
                    }
                    else{
                        return 1;
                    }
                }
            });
            map.forEach((String, Integer) -> {
                sortedMap.put(Integer, String);
            });
            sortedMap.forEach((key, word) -> {
                System.out.println(key + ", " + word);
            });
        }
    }
    public static int findLiteral(String s){
        int twoFlash = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '/'){
                twoFlash ++;
            }
        }
        return twoFlash;
    }



    public static boolean findComment(String s){
        int twoFlash = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '/'){
              twoFlash ++;
            }
        }
        return twoFlash == 2;
    }
}
