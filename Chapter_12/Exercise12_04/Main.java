/*
(IllegalArgumentException) Modify the Loan class in Listing 10.2 to
throw IllegalArgumentException if the loan amount, interest rate, or
number of years is less than or equal to zero
*/
public class Main{
	public static void main(String[]args){
		try{
			Loan laon = new Loan(0, 3, 100);
		}catch(IllegalArgumentException ex){
			System.out.print(ex.getMessage());
		}
	}
}