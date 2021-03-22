package com.company;

public class Fan {
    private int speed = 1;
    private boolean on;
    private double radius = 5;
    String color = "blue";
    //These are getters
    public String getSpeed(){
        String s= "";
        switch(speed) {
            case 1: s = "SLOW"; break;
            case 2: s = "MEDIUM"; break;
            case 3: s = "FAST";break;
        }
        return s;
    }
    boolean getON(){
        return on;
    }
    double getRadius(){
        return radius;
    }
    String getColor(){
        return color;
    }
    // These are setters
    void setSpeed(int speed){
        this.speed = speed;
    }
    void setONOrOff(boolean on){
        this.on = on;
    }
    void setRadius(double radius){
        this.radius = radius;
    }
    void setColor(String color){
        this.color = color;
    }


    //This is constructor
    Fan(){
    }

    //This is a method
    public String toString(){
        if(on){
            return "Fan is on \nspeed:" + speed + "\ncolor: " + color + "\nradius: " + radius;
        }
        else{
            return "Fan is off \ncolor:" + color + "\nradius: " + radius;
        }
    }
}
