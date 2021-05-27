/*
(Checked Exception) In preparation for a class Fraction, create a class
NullDenominatorException that must be a checked exception whose
instances are thrown if the denominator of an object of class Fraction is 0.
*/
public class Main{
	public static void main(String[]args){
		try{
			Fraction f = new Fraction(0);
		}catch(NullDenominatorException ex){
			System.out.print(ex.getMessage());
		}
	}
}