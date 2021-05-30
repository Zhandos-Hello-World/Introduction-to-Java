/*
(Revise Listing 21.9, CountOccurrenceOfWords.java) Rewrite Listing 21.9 to
display the words in ascending order of occurrence counts.
*/

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[]args){
        String text = "Good morning. Have a good class. Have a good visit. Have fun!";
        Map<String, Integer> map = new TreeMap<>();
        String[] words = text.split("[\\s+\\p{P}]");
        for (int i = 0; i < words.length; i++) {
            String key = words[i].toLowerCase();
            if (key.length() > 0) {
                if (!map.containsKey(key)) {
                    map.put(key, 1);
                }
                else {
                    int value = map.get(key);
                    value++;
                    map.put(key, value);
                }
            }
        }
        Map <Integer, String> map1 = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 >= o2){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        });
        map.forEach((k, v) -> {
            map1.put(v, k);
        });
        map1.forEach((k, v) -> System.out.println(k + "\t" + v));
    }
}

