public class Fraction{
	private int denominator;

	public Fraction(int denominator) throws NullDenominatorException{
		setDenominator(denominator);
	}
	public void setDenominator(int denominator) throws NullDenominatorException{
		if(denominator == 0)
			throw new NullDenominatorException("Denominator mustn't be 0\nDenominator = " + getDenominator());
		this.denominator = denominator;
	}
	public int getDenominator(){
		return denominator;
	}
}