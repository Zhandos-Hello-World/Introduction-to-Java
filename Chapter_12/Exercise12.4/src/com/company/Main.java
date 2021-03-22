package com.company;

public class Main {

    public static void main(String[] args) {
        try{
            Loan loan = new Loan(2, 0, -10);
        }
        catch (IllegalArgumentException ex){
            System.out.println("IllegalArgumentException: " + ex.getMessage());
        }
    }
}
