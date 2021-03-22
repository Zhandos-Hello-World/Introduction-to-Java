package com.company;

public class Staff extends Employee{
    private String status;
    Staff(String name, String email, String address, String phone, int office, int salary,
           String status){
        super(name, email, address, phone, office, salary);
        this.status = status;
    }

    @Override
    public String toString(){
        return "Staff" + "\nname: " + this.name +"\naddress: " +
                this.address +"\nemail: " + this.email + "\nphone: " + this.phone +
                "\noffice: " + this.office + "\nsalary: " + this.salary +
                "\nstatus: " +getStatus() + "\n---------------\n";
    }
    String getStatus(){
        return status;
    }
    void setStatus(String status){
        this.status = status;
    }

}
