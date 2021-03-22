package com.company;
import java.util.Date;
public class Account{
    private int id;
    private double balance;
    private double annualInterestRate = 1.5;
    private Date dateCreated;
    Account(){
    }
    Account(String name, int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        annualInterestRate = annualInterestRate / 100;
    }


    double getID(){
        return this.id;
    }
    double getBalance(){
        return this.balance;
    }
    double getAnnualInterestRate(){
        return annualInterestRate;
    }
    void setID(int id){
        this.id = id;
    }
    void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    void setBalance(double balance){
        this.balance = balance;
    }

    Date getDateCreated(){
        return this.dateCreated;
    }
    double getMonthlyInterestRate(){
        return annualInterestRate / 12.0;
    }
    double getMonthlyInterest(){
        return balance * annualInterestRate / 12.0;
    }
    void withdraw(double balance){
        this.balance = this.balance - balance;
    }
    double deposit(){
        return 0;
    }
}


