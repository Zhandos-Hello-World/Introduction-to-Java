/*
(Find the largest n such that n2 6 12,000) Use a while loop to find the largest
integer n such that n2 is less than 12,000

*/
public class Exercise05_13{

    public static void main(String[] args) {
	    int i = 0;
	    while((int)(Math.pow(i, 3)) <= 12000){
	    	i++;
	    }
	    System.out.println(i);
    }
}
