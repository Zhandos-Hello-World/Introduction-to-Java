package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Taxable    Single    Married Joint    Married    Head of");
        System.out.println("Income               or Qualifying    Separate   a House");
        System.out.println("                     Widow(er)");
        System.out.println("---------------------------------------------------------");
        for(int x = 50000; x <= 60000; x += 50){
            System.out.print(x + "      ");
            for(int status = 0; status <= 3; status++){
                if(computeTax(status, x) >= 10000){
                    if(status == 1){
                        System.out.print((int)(computeTax(status, x)) + "             ");
                    }
                    else{
                        System.out.print((int)(computeTax(status, x)) + "     ");
                    }
                }
                else{
                    if(status == 1){
                        System.out.print((int)(computeTax(status, x)) + "             ");
                    }
                    else{
                        System.out.print((int)(computeTax(status, x)) + "      ");
                    }
                }
            }
            System.out.println();
        }
    }
    public static double computeTax(int status, double income){
        double tax = 0;
        if (status == 0) {
            if (income <= 8350)
                tax = income * 0.10;
            else if (income <= 33950)
                tax = 8350 * 0.10 + (income - 8350) * 0.15;
            else if (income <= 82250)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
            else if (income <= 171550)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
            else if (income <= 372950)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 +
                        (171550 - 82250) * 0.28 +
                        (income - 171550) * 0.33;
            else
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
                        (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
        }
        else if (status == 1) {
            if (income <= 16700)
                tax = income * 0.10;
            else if (income <= 67900)
                tax = 16700 * 0.10 + (income - 16700) * 0.15;
            else if (income <= 137050)
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
                        (income - 67900) * 0.25;
            else if (income <= 208850)
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137000 - 67900) * 0.25 + (income - 137050) * 0.28;
            else if (income <= 372950)
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137000 - 67900) * 0.25 + (income - 137050) * 0.28 +
                        (income - 208850) * 0.33;
            else
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137000 - 67900) * 0.25 + (income - 137050) * 0.28 +
                        (372950 - 208850) * 0.33 + (income - 372950) * 0.35;
        }
        else if (status == 2) {
            if (income <= 8350)
                tax = income * 0.10;
            else if (income <= 33950)
                tax = 8350 * 0.10 + (income - 8350) * 0.15;
            else if (income <= 68525) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
            } else if (income <= 104425)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (income - 68525) * 0.28;
            else if (income <= 186475)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68526 - 33950) * 0.25 + (income - 68525) * 0.28 +
                        (income - 104425) * 0.33;
            else
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (income - 68525) * 0.28 +
                        (186475 - 104425) * 0.33 + (income - 186475) * 0.35;
        }
        else if (status == 3) {
            if (income <= 11950)
                tax = income * 0.10;
            else if (income <= 45500)
                tax = 11950 * 0.10 + (income - 11950) * 0.15;
            else if (income <= 117450)
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +
                        (income - 45500) * 0.25;
            else if (income <= 190200)
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (income - 117450) * 0.28;
            else if (income <= 372950)
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (income - 117450) * 0.28 +
                        (income - 190200) * 0.33;
            else
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (127450 - 45500) * 0.25 + (income - 117450) * 0.28 +
                        (372950 - 190200) * 0.33 + (income - 372950) * 0.35;
        }
        else {
            System.out.println("Error: invalid status");
            System.exit(1);
        }
        tax = Math.round(tax);
        return tax;
    }
}