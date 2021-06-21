/*
(Financial application: compute tax) Rewrite Listing 3.5, ComputeTax.java,
using arrays. For each filing status, there are six tax rates. Each rate is applied
to a certain amount of taxable income. For example, from the taxable income of
$400,000 for a single filer, $8,350 is taxed at 10%, (33,950 - 8,350) at 15%, 
(82,250 - 33,950) at 25%, (171,550 - 82,550) at 28%, (372,550 - 82,250) at
33%, and (400,000 - 372,950) at 36%. The six rates are the same for all filing
statuses, which can be represented in the following array:
double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
 The brackets for each rate for all the filing statuses can be represented in a twodimensional array as follows:

 int[][] brackets = {
{8350, 33950, 82250, 171550, 372950}, // Single filer
{16700, 67900, 137050, 20885, 372950}, // Married jointly
// −or qualifying widow(er)
{8350, 33950, 68525, 104425, 186475}, // Married separately
{11950, 45500, 117450, 190200, 372950} // Head of household
};

Suppose the taxable income is $400,000 for single filers. The tax can be computed as follows:

tax = brackets[0][0] * rates[0] +
 (brackets[0][1] – brackets[0][0]) * rates[1] +
 (brackets[0][2] – brackets[0][1]) * rates[2] +
 (brackets[0][3] – brackets[0][2]) * rates[3] +
 (brackets[0][4] – brackets[0][3]) * rates[4] +
 (400000 – brackets[0][4]) * rates[5];
*/
import java.util.Scanner;
public class Exercise08_12 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
    int[][] brackets = {{8350, 33950, 82250, 171550, 372950},
                {16700, 67900, 137050, 20885, 372950},
                {8350, 33950, 68525, 104425, 186475},
                {11950, 45500, 117450, 190200, 372950}};
    System.out.print("(0-single filer, 1-married jointly or " +
                "qualifying widow(er), 2-married separately, 3-head of " +
                "household) Enter the filing status: ");
    int status = input.nextInt();
        System.out.print("Enter the taxable income: ");
    double income = input.nextDouble();
    double tax = 0;
        int i = 0;
        if (status == 0) {
        if (income <= brackets[i][0])
            tax = income * rates[0];
        else if (income <= brackets[i][1])
            tax = brackets[i][0] * rates[0] + (income - brackets[i][0]) * rates[1];
        else if (income <= brackets[i][2])
            tax = brackets[i][0] * rates[0] + (brackets[i][1] - brackets[i][0]) * rates[1] +
                    (income - brackets[i][1]) * rates[2];
        else if (income <= brackets[i][3])
            tax = brackets[i][0] * rates[0] + (brackets[i][1] - brackets[i][0]) * rates[1] +
                    (brackets[i][2] - brackets[i][1]) * rates[2] + (income - brackets[i][2]) * rates[3];
        else if (income <= brackets[i][4])
            tax = brackets[i][0] * rates[0] + (brackets[i][1] - brackets[i][0]) * rates[1] +
                    (brackets[i][2] - brackets[i][1]) * rates[2] + (brackets[i][3] - brackets[i][2]) * rates[3] +
                    (income - brackets[i][3]) * rates[4];
        else
            tax = brackets[i][0] * rates[0] + (brackets[i][1] - brackets[i][0]) * rates[1] +
                    (brackets[i][2] - brackets[i][1]) * rates[2] + (brackets[i][3] - brackets[i][2]) * rates[3] +
                    (brackets[i][4] - brackets[i][3]) * rates[4] + (income - brackets[i][4]) * rates[5];
    }
        else if (status == 1) {
            i = status;
            if (income <= brackets[i][0])
                tax = income * rates[0];
            else if (income <= brackets[i][1])
                tax = brackets[i][0] * rates[0] + (income - brackets[i][0]) * rates[1];
            else if (income <= brackets[i][2])
                tax = brackets[i][0] * rates[0] + (brackets[i][1] - brackets[i][0]) * rates[1] +
                        (income - brackets[i][1]) * rates[2];
            else if (income <= brackets[i][3])
                tax = brackets[i][0] * rates[0] + (brackets[i][1] - brackets[i][0]) * rates[1] +
                        (brackets[i][2] - brackets[i][1]) * rates[2] + (income - brackets[i][2]) * rates[3];
            else if (income <= brackets[i][4])
                tax = brackets[i][0] * rates[0] + (brackets[i][1] - brackets[i][0]) * rates[1] +
                        (brackets[i][2] - brackets[i][1]) * rates[2] + (brackets[i][3] - brackets[i][2]) * rates[3] +
                        (income - brackets[i][3]) * rates[4];
            else
                tax = brackets[i][0] * rates[0] + (brackets[i][1] - brackets[i][0]) * rates[1] +
                        (brackets[i][2] - brackets[i][1]) * rates[2] + (brackets[i][3] - brackets[i][2]) * rates[3] +
                        (brackets[i][4] - brackets[i][3]) * rates[4] + (income - brackets[i][4]) * rates[5];
    }
        else if (status == 2) {
            i = status;
            if (income <= brackets[i][0])
                tax = income * rates[0];
            else if (income <= brackets[i][1])
                tax = brackets[i][0] * rates[0] + (income - brackets[i][0]) * rates[1];
            else if (income <= brackets[i][2])
                tax = brackets[i][0] * rates[0] + (brackets[i][1] - brackets[i][0]) * rates[1] +
                        (income - brackets[i][1]) * rates[2];
            else if (income <= brackets[i][3])
                tax = brackets[i][0] * rates[0] + (brackets[i][1] - brackets[i][0]) * rates[1] +
                        (brackets[i][2] - brackets[i][1]) * rates[2] + (income - brackets[i][2]) * rates[3];
            else if (income <= brackets[i][4])
                tax = brackets[i][0] * rates[0] + (brackets[i][1] - brackets[i][0]) * rates[1] +
                        (brackets[i][2] - brackets[i][1]) * rates[2] + (brackets[i][3] - brackets[i][2]) * rates[3] +
                        (income - brackets[i][3]) * rates[4];
            else
                tax = brackets[i][0] * rates[0] + (brackets[i][1] - brackets[i][0]) * rates[1] +
                        (brackets[i][2] - brackets[i][1]) * rates[2] + (brackets[i][3] - brackets[i][2]) * rates[3] +
                        (brackets[i][4] - brackets[i][3]) * rates[4] + (income - brackets[i][4]) * rates[5];
    }
        else if (status == 3) {
            i = status;
            if (income <= brackets[i][0])
                tax = income * rates[0];
            else if (income <= brackets[i][1])
                tax = brackets[i][0] * rates[0] + (income - brackets[i][0]) * rates[1];
            else if (income <= brackets[i][2])
                tax = brackets[i][0] * rates[0] + (brackets[i][1] - brackets[i][0]) * rates[1] +
                        (income - brackets[i][1]) * rates[2];
            else if (income <= brackets[i][3])
                tax = brackets[i][0] * rates[0] + (brackets[i][1] - brackets[i][0]) * rates[1] +
                        (brackets[i][2] - brackets[i][1]) * rates[2] + (income - brackets[i][2]) * rates[3];
            else if (income <= brackets[i][4])
                tax = brackets[i][0] * rates[0] + (brackets[i][1] - brackets[i][0]) * rates[1] +
                        (brackets[i][2] - brackets[i][1]) * rates[2] + (brackets[i][3] - brackets[i][2]) * rates[3] +
                        (income - brackets[i][3]) * rates[4];
            else
                tax = brackets[i][0] * rates[0] + (brackets[i][1] - brackets[i][0]) * rates[1] +
                        (brackets[i][2] - brackets[i][1]) * rates[2] + (brackets[i][3] - brackets[i][2]) * rates[3] +
                        (brackets[i][4] - brackets[i][3]) * rates[4] + (income - brackets[i][4]) * rates[5];
    }
        else {
        System.out.println("Error: invalid status");
        System.exit(1);
    }
         System.out.println("Tax is " + (int)(tax * 100) / 100.0);

}
}