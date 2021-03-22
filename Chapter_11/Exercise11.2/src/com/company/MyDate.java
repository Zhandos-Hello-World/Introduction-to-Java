package com.company;
import java.util.Date;
import java.text.SimpleDateFormat;
public class MyDate {
    private int year;
    private int month;
    private int day;
    MyDate(){
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy.MM.dd");
        String s = String.valueOf(formatForDateNow);
        this.year = Integer.parseInt(s.substring(0, 5));
        this.month = Integer.parseInt(s.substring(5, 7));
        this.day = Integer.parseInt(s.substring(8));
    }
    MyDate(MyDate myDate){

    }

}
