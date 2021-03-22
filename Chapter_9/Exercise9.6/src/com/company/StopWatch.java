package com.company;

import java.util.Calendar;

class StopWatch {
    private long startTime = System.currentTimeMillis();
    private long endTime = startTime;
    StopWatch(){
    }

    double getStartTime(){
        return this.startTime;
    }
    double getEndTime(){
        return this.endTime;
    }
    public void start() {
        this.startTime = System.currentTimeMillis();
    }
    public void stop() {
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }


}
