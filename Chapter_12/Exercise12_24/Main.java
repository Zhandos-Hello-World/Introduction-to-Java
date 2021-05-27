/*
(Create large dataset) Create a data file with 1,000 lines. Each line in the file
consists of a faculty member’s first name, last name, rank, and salary. The
faculty member’s first name and last name for the ith line are FirstNamei and
LastNamei. The rank is randomly generated as assistant, associate, and full.
The salary is randomly generated as a number with two digits after the decimal
point. The salary for an assistant professor should be in the range from 50,000
to 80,000, for associate professor from 60,000 to 110,000, and for full professor
from 75,000 to 130,000. Save the file in Salary.txt. Here are some sample data:
FirstName1 LastName1 assistant 60055.95
FirstName2 LastName2 associate 81112.45
. . .
FirstName1000 LastName1000 full 92255.21
*/

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main{
	public static void main(String[]args)throws FileNotFoundException{
		try(PrintWriter pw = new PrintWriter("Salary.txt")){
			for(int i = 1; i <= 1000; i++){
				String rank = "";
				double  salary = 0;
				switch((int)(Math.random() * 3 + 0)){
					case 0:rank = " assistant ";salary = Math.random() * 80001 + 50000;break;
					case 1:rank = " associate ";salary = Math.random() * 110001 + 60000;break;
					case 2:rank = " full ";salary = Math.random() * 130001 + 75000;break;
				}
				salary = (int)(salary * 100) / 100.0;
				pw.println("FirstName" + i + " LastName" + i + rank + salary);
			}
		}
	}
}