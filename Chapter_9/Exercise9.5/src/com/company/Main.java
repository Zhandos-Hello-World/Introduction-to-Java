package com.company;
import java.util.GregorianCalendar;
public class Main {

    public static void main(String[] args) {
	    GregorianCalendar a = new GregorianCalendar();
        System.out.print(a.get(GregorianCalendar.YEAR) + "." +
                a.get(GregorianCalendar.MONTH) + "." + a.get(GregorianCalendar.DAY_OF_MONTH));
        a.setTimeInMillis(1234567898765L);
        System.out.print("\n" + a.get(GregorianCalendar.YEAR) + "." + a.get(GregorianCalendar.MONTH) + "." +
                a.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
