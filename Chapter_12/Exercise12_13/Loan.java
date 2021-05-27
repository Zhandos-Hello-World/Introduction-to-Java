import java.util.Date;
public class Loan{
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private Date loanDate;

	public Loan(){
		this(2.5, 1, 1000);
	}
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount)  throws IllegalArgumentException{
		setAnnualInterestRate(annualInterestRate);
		setLoanAmount(loanAmount);
		setNumberOfYears(numberOfYears);
		loanDate = new Date();
	}
	public void setAnnualInterestRate(double annualInterestRate) throws IllegalArgumentException{
		if(annualInterestRate <= 0)
			throw new IllegalArgumentException("Annual interest rate mustn't be equals or less than 0");
		this.annualInterestRate = annualInterestRate;
	}
	public void setNumberOfYears(int numberOfYears) throws IllegalArgumentException{
		if(numberOfYears <= 0){
			throw new IllegalArgumentException("Number of years mustn't be equals or less than 0");
		}
		this.numberOfYears = numberOfYears;
	}
	public void setLoanAmount(double loanDate) throws IllegalArgumentException{
		if(loanAmount <= 0)
			throw new IllegalArgumentException("Loan Date mustn't be equals or less than 0");
		this.loanAmount = loanAmount;
	}

	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	public int getNumberOfYears(){
		return numberOfYears;
	}
	public double getLoanAmount(){
		return loanAmount;
	}

	public Date getLoanDate(){
		return loanDate;
	} 
	public double getMonthlyPayment(){
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 
			(1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		return monthlyPayment;
	}
	public double getTotalPayment(){
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}

}