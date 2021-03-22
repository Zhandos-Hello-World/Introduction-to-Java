package com.company;
import java.util.ArrayList;
import java.util.Date;

public class Transaction extends Account{
    protected static int numIndex = 0;
    private char type;
    private double amount;
    private String description;
    private ArrayList<String> transactions = new ArrayList<>();

    Transaction(char type, double annualInterestRate, double balance,
            String name, String description, int id){
        super(name, id, balance, annualInterestRate);
        this.description = description;
        setAnnualInterestRate(annualInterestRate);
        this.type = type;
    }



    char getType(){
        return this.type;
    }

    double getAmount(){
        return this.amount;
    }

    String getDescription(){
        return this.description;
    }


    void setType(char type){
        this.type = type;
    }
    void setAmount(double amount){
        this.amount = amount;
    }

    void setDescription(String description){
        this.description = description;
    }


}
