/*
(Financial application: compute future tuition) Suppose that the tuition for a university
 is $10,000 this year and increases 6% every year. In one year, the tuition
will be $10,600. Write a program that computes the tuition in ten years and the total
cost of four years’ worth of tuition after the tenth year.
*/
public class Exercise05_07 {

    public static void main(String[] args) {
        double pay = 10000.0;
        int sum = 0;
        int one = 0;
        double res;
        for(int i = 1; i <= 14; i++){
            res = pay * 1.05;
            if(i == 11){
                one = (int)res;
            }
            if(i > 10){
                sum += (int)res;
            }
            pay = res;
        }
        System.out.print(sum + "       " + one);
    }
}
