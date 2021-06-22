import java.util.Date;
public class Account{
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	Account(){
		dateCreated = new Date(System.currentTimeMillis());
	}
	Account(int id, double balance){
		this();
		this.id = id;
		this.balance = balance;
	}
	Account(int id, double balance, double annualInterestRate){
		this(id, balance);
		this.annualInterestRate = annualInterestRate;
	}


	public int getId(){
		return id;
	}
	public double getBalance(){
		return balance;
	}
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	public void setId(int id){
		this.id = id;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}
	public Date getDateCreated(){
		return dateCreated;
	}
	public double getMonthlyInterestRate(){
		return getMonthlyInterest() / 1200.0;
	}
	public double getMonthlyInterest(){
		return balance * (getAnnualInterestRate());
	}
	public void withdraw(double balance){
		this.balance -= balance;
	}
	public void deposit(double balance){
		this.balance += balance;
	}


}