package com.company;

public class Student extends Person{
    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";
    private String currentStatus;

    Student(String name, String address, String email, String phone, String status){
        super(name, address, email, phone);
        this.currentStatus = status;
    }
    Student(){
        super();
        this.currentStatus = "unknown";
    }

    String getCurrentStatus(){
        return this.currentStatus;
    }
    void setCurrentStatus(String currentStatus){
        this.currentStatus = currentStatus;
    }

    @Override
    public String toString(){
        return "Student" + "\nname: " + getName() + "\nstatus: "  + getCurrentStatus() +
                this.name +"\naddress: " +  this.address +"\nemail: " + this.email +
                "\nphone: " + this.phone +  "\n---------------\n";
    }
}
