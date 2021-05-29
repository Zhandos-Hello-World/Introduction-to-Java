/*
(Ranking summary) Write a program that uses the files described in Programming 
Exercise 12.31 and displays a ranking summary table for the first five girl’s 
and boy’s names as follows:

Year Rank 1 Rank 2 Rank 3 Rank 4 Rank 5 Rank 1 Rank 2 Rank 3 Rank 4 Rank 5
2010 Isabella Sophia Emma Olivia Ava Jacob Ethan Michael Jayden William
2009 Isabella Emma Olivia Sophia Ava Jacob Ethan Michael Alexander William
...
2001 Emily Madison Hannah Ashley Alexis Jacob Michael Matthew Joshua Christopher
*/
import java.io.IOException;

import java.util.Scanner;

import java.net.URL;

public class Exercise12_32{
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
	public static void main(String[]args)throws IOException{
		String [][][] data = new String[10][5][2];
		for(int i = 0; i < links.length; i++){
			URL url = new URL(links[i]);
			try(Scanner scan = new Scanner(url.openStream())){
				for(int j = 0; j < 5; j++){
					scan.next();
					data[i][j][0] = scan.next();
					scan.next();
					data[i][j][1] = scan.next();
					scan.next();
				}
			}
		}

		System.out.println("Year Rank 1 Rank 2 Rank 3 Rank 4 Rank 5 Rank 1 Rank 2 Rank 3 Rank 4 Rank 5");
		System.out.println("--------------------------------------------------------------------------");
		for(int i = data.length - 1; i >= 0; i--){
			System.out.print((int)(2001 + i) + " ");
			//First of all for female
			for(int j = 0; j < 5; j++){
				System.out.print(data[i][j][1] + " ");
			}
			//for male
			for(int j = 0; j < 5; j++){
				System.out.print(data[i][j][0] + " ");
			}
			System.out.println();
		}

	}
}