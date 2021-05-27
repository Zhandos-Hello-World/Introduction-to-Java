/*
(Fraction) Create a class Fraction with two integer final fields: numerator and denominator. Its constructor creates fractions when given values
for both, but it has to avoid fractions with null denominators by throwing a
NullDenominatorException of Programming Exercise 12.7.*/
public class Main{
	public static void main(String[]args){
		try{
			Fraction f = new Fraction(12, 0);
		}catch(NullDenominatorException ex){
			System.out.print(ex.getMessage());
		}
	}
}