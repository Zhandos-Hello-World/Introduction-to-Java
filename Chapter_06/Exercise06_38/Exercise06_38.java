/*
(Generate random characters) Use the methods in RandomCharacter in Listing
6.10 to print 200 uppercase letters and then 200 single digits, printing ten per line.
*/

public class Exercise06_38 {

    public static void main(String[] args) {
        for(int i = 0; i < 200; i++){
            if(i % 10 == 0){
                System.out.println();
            }
            System.out.print(getRandomDigitCharacter() + " ");
        }
        System.out.println();
        for(int i = 0; i < 200; i++){
            if(i % 10 == 0){
                System.out.println();
            }
            System.out.print(getRandomUpperCaseLetter() + " ");
        }
    }
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }
    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    }
