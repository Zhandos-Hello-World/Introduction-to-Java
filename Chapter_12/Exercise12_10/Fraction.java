public class Fraction{
	private int numberator;
	private int denominator;

	public Fraction(int numberator, int denominator) throws NullDenominatorException{
		setNumberator(numberator);
		setDenominator(denominator);

	}
	public void setNumberator(int numberator){
		this.numberator = numberator;
	}
	public void setDenominator(int denominator) throws NullDenominatorException{
		if(denominator == 0)
			throw new NullDenominatorException("Denominator mustn't be 0\nNumberator = " + getNumberator() + ", Denominator = " + getDenominator());
		this.denominator = denominator;
	}
	public int getDenominator(){
		return denominator;
	}
	public int getNumberator(){
		return numberator;
	}
}