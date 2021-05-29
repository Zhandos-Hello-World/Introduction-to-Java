/*
(Baby name popularity ranking) The popularity ranking of baby names from
years 2001 to 2010 is downloaded from www.ssa.gov/oact/babynames and stored
in files named babynameranking2001.txt, babynameranking2002.txt,  .  .  .  ,
babynameranking2010.txt. You can download these files using the URL such
as http://liveexample.pearsoncmg.com/data/babynamesranking2001.txt. Each file
contains 1,000 lines. Each line contains a ranking, a boy’s name, number for the
boy’s name, a girl’s name, and number for the girl’s name. For example, the first
two lines in the file babynameranking2010.txt are as follows:
1 Jacob 21,875 Isabella 22,731
2 Ethan 17,866 Sophia 20,477
Therefore, the boy’s name Jacob and girl’s name Isabella are ranked #1 and the
boy’s name Ethan and girl’s name Sophia are ranked #2; 21,875 boys are named
Jacob, and 22,731 girls are named Isabella. Write a program that prompts the
user to enter the year, gender, followed by a name, and displays the ranking of
the name for the year. Here is a sample run:
*/

import java.io.IOException;

import java.util.Scanner;

import java.net.URL;


public class Exercise12_31{
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
		Scanner str = new Scanner(System.in);

		System.out.print("Enter the year: ");
		int year = str.nextInt() % 2000 - 1;

		System.out.print("Enter the gender: ");
		// if 1 then Male and Female otherwise
		int gender = (str.next().toUpperCase().charAt(0) == 'M') ? 1:0;
	
		System.out.print("Enter the name: ");
		String name = str.next();



		URL url = new URL(links[year]);
		
		try(Scanner scan = new Scanner(url.openStream())){
			int rank = 0;
			int currentGender = 0;
			String currentNameMale = "";
			String currentNameFemale = "";
			boolean notFound = true;
			while(scan.hasNext()){
				currentGender = 1;
				//for temp rank
				rank = scan.nextInt();
				//for temp male name
				currentNameMale = scan.next();
				scan.next();
				if(currentGender == gender && currentNameMale.equals(name)){
					System.out.print(name + " is ranked #" + rank + " in year " + (int)(year + 2001));
					notFound = false;
					break;
				}

				currentGender = 0;
				//for temp femal name
				currentNameFemale = scan.next();
				scan.next();
				if(currentGender == gender && currentNameFemale.equals(name)){
					System.out.print(name + " is ranked #" + rank + " in year " + (int)(year + 2001));
					notFound = false;
					break;
				}
				rank++;
			}
			if(notFound){
				System.out.print("The name " + name + " is not ranked in year " + (int)(year + 2001));
			}
		}
	}
}