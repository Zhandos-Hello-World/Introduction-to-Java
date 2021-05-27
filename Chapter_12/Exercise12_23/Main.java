/*
(Process scores in a text file on the Web) Suppose the text file on the Web
http://liveexample.pearsoncmg.com/data/Scores.txt contains an unspecified
number of scores separated by spaces. Write a program that reads the scores
from the file and displays their total and average.
*/
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.net.URL;
import java.net.MalformedURLException;
public class Main{
    public static void main(String[]args) {
        try{
            URL url = new URL("http://liveexample.pearsoncmg.com/data/Scores.txt");
            Scanner input = new Scanner(url.openStream());
            double length = 0;
            double sum = 0;
            while(input.hasNext()){
                sum += input.nextDouble();
                length++;
            }
            System.out.println("Total: " + sum);
            System.out.print("Average: " + sum / length);
        }
        catch(MalformedURLException ex){
            System.out.println("Invalid URL");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}