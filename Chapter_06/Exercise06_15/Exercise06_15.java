/*
(Financial application: print a tax table) Listing 3.5 gives a program to compute
tax. Write a method for computing tax using the following header:

    public static double computeTax(int status, double taxableIncome)

Use this method to write a program that prints a tax table for taxable income from
$50,000 to $70,000 with intervals of $100 for all the following statuses:

Taxable    Single    Married Joint    Married    Head of
Income               or Qualifying    Separate   a House
                     Widow(er)
__________________________________________________________
50000      8688      6665             8688       7353      
50100      8713      6680             8713       7378  
...
69900      13663     9850             13704      12328     
70000      13688     9875             13732      12353 

Hint: round the tax into integers using Math.round (i.e., Math
.round(computeTax(status, taxableIncome))).
*/
public class Exercise06_15{

    public static void main(String[] args) {
        System.out.println("Taxable    Single    Married Joint    Married    Head of");
        System.out.println("Income               or Qualifying    Separate   a House");
        System.out.println("                     Widow(er)");
        System.out.println("__________________________________________________________");
        for(int x = 50000; x <= 70000; x += 100){
            int status0 = (int)(computeTax(0, x)), status1 = (int)(computeTax(1, x)),
                    status2 = (int)(computeTax(2, x)), status3 = (int)(computeTax(3, x));
            System.out.printf("%-11d%-10d%-17d%-11d%-7d\n", x ,status0, status1, status2, status3);
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


