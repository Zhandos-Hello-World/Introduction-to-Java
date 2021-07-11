/*
(Implement Comparable) Implement a new class that implements Comparator
of GregorianCalendar class to be able sort the calendar in increasing
order based on day, month, and year, in that order. Write a method to display 
the GregorianCalendar instance in "dd-MMM-yyyy" format using
SimpleDateFormat class. Write a test program with 10 GregorianCalendar
instances and display the results after the sort.
*/
import java.text.SimpleDateFormat;
import java.util.*;

public class Exercise20_04{
    public static void main(String[]args){
        GregorianCalendar[]arr = new GregorianCalendar[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = new GregorianCalendar();
            arr[i].setGregorianChange(new Date((long)(Math.random() * 1200000000000L + 12000000000L)));
        }

        ArrayList<GregorianCalendar> listDate = new ArrayList<>(Arrays.asList(arr));
        listDate.sort(new Comparator<GregorianCalendar>() {
            @Override
            public int compare(GregorianCalendar o1, GregorianCalendar o2) {
                if (o1.getGregorianChange().getTime() > o2.getGregorianChange().getTime()) {
                    return 1;
                } else if (o1.getGregorianChange().getTime() < o2.getGregorianChange().getTime()) {
                    return -1;
                }
                return 0;
            }
        });
        SimpleDateFormat simple = new SimpleDateFormat("dd-MMM-yyyy");

        Iterator<GregorianCalendar> iterator = listDate.iterator();
        while (iterator.hasNext()){
            Date date = iterator.next().getGregorianChange();
            System.out.println(simple.format(date));
        }

    }
}
