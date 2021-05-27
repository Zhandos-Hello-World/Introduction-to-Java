/*
(Process large dataset) A university posts its employees’ salaries at http://
liveexample.pearsoncmg.com/data/Salary.txt. Each line in the file consists of
a faculty member’s first name, last name, rank, and salary (see Programming
Exercise 12.24). Write a program to display the total salary for assistant professors,
 associate professors, full professors, and faculty, respectively, and display
the average salary for assistant professors, associate professors, full professors,
and faculty, respectively.
*/
import java.net.URL;
import java.net.MalformedURLException;
import java.util.Scanner;
import java.io.IOException;

public class Main{
	public static void main(String[]args){
		try{
			URL url = new URL("http://liveexample.pearsoncmg.com/data/Salary.txt");
			Scanner scan = new Scanner(url.openStream());
			//we need array for find average each ranks
			double[]lengthForRank = new double[3];
			//the array for save total salary each ranks 
			double[]salary = new double[3];
			for(int i = 0; i < 1000; i++){
				scan.next();
				scan.next();
				switch(scan.next()){
					case "assistant": salary[0] += scan.nextDouble();lengthForRank[0]++;break;
					case "associate": salary[1] += scan.nextDouble();lengthForRank[1]++;break;
					case "full": salary[2] += scan.nextDouble();lengthForRank[2]++;break;
				}
			}
			scan.close();
			//for short double value and calculate average
			for(int i = 0; i < salary.length; i++){
				lengthForRank[i] = (int)((salary[i] / lengthForRank[i]) * 100) / 100.0;
			}


			System.out.println("Assistant professors's total salary: " + (int)salary[0]);
			System.out.println("Associate professors's total salary: " + (int)salary[1]);
			System.out.println("Full professors's total salary: " + (int)salary[2]);
			System.out.println("------------------------------------------");

			System.out.println("Assistant professors's average salary: " + lengthForRank[0]);
			System.out.println("Associate professors's average salary: " + lengthForRank[1]);
			System.out.println("Full professors's average salary: " + lengthForRank[2]);

		}
		catch(MalformedURLException ex){
			System.out.print("URL is not found");
		}
		catch(IOException ex){
			System.out.print(ex.getMessage());
		}
	}
}
