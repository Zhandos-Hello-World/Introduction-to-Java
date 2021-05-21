/*
(Restore objects from a file) Suppose a file named Exercise17_07.dat has
been created using the ObjectOutputStream from the preceding programming exercises. The file contains Loan objects. The Loan class in Listing 10.2
does not implement Serializable. Rewrite the Loan class to implement
Serializable. Write a program that reads the Loan objects from the file and
displays the total loan amount. Suppose that you don’t know how many Loan
objects are there in the file, use EOFException to end the loop.
 */

import java.io.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        double sumTotalLoanAmount = 0.0;
        try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("Exercise17_07.dat")))) {
            try {
                while (true) sumTotalLoanAmount += ((Loan) (ois.readObject())).getLoanAmount();
            } catch (EOFException exception) {
                System.out.print("Sum of total loan amount: " + sumTotalLoanAmount);
                ois.close();
            }
        }
    }
}

class Loan implements Serializable {
    private static final long serialVersionUID = 761159894648207992L;
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
