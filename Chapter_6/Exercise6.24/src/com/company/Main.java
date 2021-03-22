package com.company;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-" +
                "yyyy HH:mm:ss");
        System.out.print(formatter.format(date));
    }

}
