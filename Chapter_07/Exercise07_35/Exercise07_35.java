/*
(Game: hangman) Write a hangman game that randomly generates a word and
prompts the user to guess one letter at a time, as presented in the sample run.
Each letter in the word is displayed as an asterisk. When the user makes a correct
guess, the actual letter is then displayed. When the user finishes a word, display
the number of misses and ask the user whether to continue to play with another
word. Declare an array to store words, as follows:

String[] words = {"write", "that",...};
*/
import java.util.Scanner;

public class Exercise07_35{

    public static void main(String[]args){
        String[] words = {"write", "that", "hello", "love", "goals", "read", "live"};
        Scanner str = new Scanner(System.in);
        for(int i = 0; i < words.length; i++){

            String current = "";
            for(int j = 0; j < words[i].length(); j++){
                current += "*";
            }

            while (!current.equals(words[i])) {


                System.out.print("(Guess) Enter a letter in word " + current + " > ");
                char a = str.next().charAt(0);


                boolean containsWord = words[i].contains(String.valueOf(a));
                if (containsWord && !current.contains(String.valueOf(a))) {
                    current = exchange(words[i], current, a);
                } else if (containsWord) {
                    System.out.println("\t" + a + "is already in the word\n");
                } else {
                    System.out.print("\t" + a + " is not in the word\n");
                }

            }
            System.out.print("The word is " + words[i] + ". You missed " + (i + 1) + " time\nDo you want to guess another word? Enter y or n>");
            char answer = str.next().charAt(0);
            if(answer == 'n'){
                break;
            }
        }
    }
    public static String exchange(String word, String current, char c){
        char[]list = current.toCharArray();
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == c){
                list[i] = c;
            }
        }

        String result = "";
        for(char value:list){
            result += String.valueOf(value);
        }
        return result;
    }
}
