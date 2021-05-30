
/*
(Count the occurrences of words in a text file) Rewrite Listing 21.9 to read the
text from a text file. The text file is passed as a command-line argument. Words
are delimited by whitespace characters, punctuation marks (,;.:?), quotation
marks ('"), and parentheses. Count words in case-insensitive fashion (e.g.,
consider Good and good to be the same word). The words must start with a letter. Display the output in alphabetical order of words, with each word preceded
by its occurrence count.
 */

import java.util.*;

public class Main {
    public static void main(String[]args){
        String text = "Good morning. Have a good class. Have a good visit. Have fun!";
        Set<Character> set = new HashSet<>(Arrays.asList(',', ';', '.', ':', '?'));
        int count = 0;
        for(int i = 0; i < text.length(); i++){
            if(set.contains(text.charAt(i))){
                count++;
            }
        }
        System.out.print(count);
    }
}

