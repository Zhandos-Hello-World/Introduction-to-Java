package com.company;
import java.util.Date;
public class Employee extends Person{
    java.util.Date date;
    protected int salary;
    protected int office;

    Employee(String name, String email, String address, String phone, int office, int salary){
        super(name, address, email, phone);
        date = new Date();
        this.office = office;
        this.salary = salary;
    }

    java.util.Date getDate(){
        return date;
    }

    @Override
    public String toString(){
        return "Employee" + "\nname: " + this.name +"\naddress: " +
                this.address +"\nemail: " + this.email + "\nphone: " + this.phone +
                 "\noffice: " + this.office + "\nsalary: " + this.salary +
                "\n---------------\n";
    }
    int getSalary(){
        return this.salary;
    }
    int getOffice(){
        return this.office;
    }
    void setOffice(int office){
        this.office = office;
    }
    void setSalary(int salary){
        this.salary = salary;
    }
}
