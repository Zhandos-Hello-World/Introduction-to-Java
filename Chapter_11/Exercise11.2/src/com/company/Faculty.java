package com.company;

public class Faculty extends Employee{
    private String dateAbsent;
    private String status;
    Faculty(String name, String email, String address, String phone, int office, int salary,
                       String dateAbsent,  String status){
        super(name, email, address, phone, office, salary);
        this.dateAbsent = dateAbsent;
        this.status = status;
    }
    void setDateAbsent(String dateAbsent){
        this.dateAbsent = dateAbsent;
    }
    void setStatus(String status){
        this.status = status;
    }
    String getStatus(){
        return status;
    }
    String getDateAbsent(){
        return dateAbsent;
    }

    @Override
    public String toString(){
        return "Faculty" + "\nname: " + this.name +"\naddress: " +
                this.address +"\nemail: " + this.email + "\nphone: " + this.phone +
                "\noffice: " + this.office + "\nsalary: " + this.salary +
                "\nstatus: " + getStatus() + "\ndate: " + getDateAbsent() +
                "\n---------------\n";
    }

}
