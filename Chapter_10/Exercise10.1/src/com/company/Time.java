package com.company;

public class Time {
    // These are data fields
    private int hour;
    private int minute;
    private int second;
    private long totalMilliSeconds;

    //These are constructors
    Time(){
        this.totalMilliSeconds = System.currentTimeMillis();
        long totalSeconds = totalMilliSeconds / 1000;
        this.second = (int)(totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        this.minute = (int)(totalMinutes % 60);
        long totalHours = totalMinutes / 60;
        this.hour  = (int)(totalHours % 24);
    }
    Time(long totalMilliSeconds){
        this.totalMilliSeconds = totalMilliSeconds;
        long totalSeconds = totalMilliSeconds / 1000;
        this.second = (int)(totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        this.minute = (int)(totalMinutes % 60);
        long totalHours = totalMinutes / 60;
        this.hour  = (int)(totalHours % 24);
    }
    Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // These are getter methods
    int getHour(){
        return this.hour;
    }
    int getMinute(){
        return this.minute;
    }
    int getSecond(){
        return this.second;
    }

    //This is setter method for initialization our's setTime
    void setTime(long elapseTime){
        this.totalMilliSeconds = elapseTime;
    }
}
