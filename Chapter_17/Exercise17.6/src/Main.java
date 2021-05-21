/*
(Store Loan objects) The Loan class in Listing 10.2 does not implement
Serializable. Rewrite the Loan class to implement Serializable. Write
a program that creates five Loan objects and stores them in a file named
Exercise17_06.dat.
 */

import java.io.*;
import java.util.Date;

public class Main {
    private static Loan[]loans = {new Loan(), new Loan (3, 2, 2000),
            new Loan(2, 1, 1500), new Loan(1, 2, 10000),
            new Loan(1.5, 2, 3)};
    public static void main(String[]args) throws IOException {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Exercise17_06.dat"))){
            for(int i = 0; i < loans.length; i++){
                oos.writeObject(loans[i]);
            }
        }
    }
}
class Loan implements Serializable{
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    public Loan(){
        this(2.5, 1, 1000);
    }
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount){
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new Date();
    }


    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public Date getLoanDate() {
        return loanDate;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyPayment(){
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1/Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return monthlyPayment;
    }
    public double getTotalPayment(){
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }
}
