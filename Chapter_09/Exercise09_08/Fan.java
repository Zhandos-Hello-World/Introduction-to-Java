public class Fan{
    public static final int slow = 1;
    public static final int medium = 2;
    public static final int fast = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    Fan(){
        speed = slow;
        radius = 5;
        color = "blue";
    }
    Fan(int speed, double radius, String color){
        this.speed = speed;
        this.radius = radius;
        this.color = color;
    }
    @Override
    public String toString(){
        return (on ? ("Speed: " + getSpeed()):"fan is off") + ", color: " + getColor() + ", radius: " + getRadius();
    }
    
    //accessor and mutator methods
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setOn(boolean on){
        this.on = on;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setColor(String color){
        this.color = color;
    }
    public int getSpeed(){
        return speed;
    }
    public boolean isOn(){
        return on;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }

}