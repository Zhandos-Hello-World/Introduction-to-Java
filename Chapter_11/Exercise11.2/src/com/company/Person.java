package com.company;

public class Person {
    protected String name;
    protected String address;
    protected String email;
    protected String phone;

    Person(String name, String address, String email, String phone){
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.name = name;
    }

    String getName(){
        return this.name;
    }
    String getAddress(){
        return this.address;
    }
    String getEmail(){
        return this.email;
    }
    String getPhone(){
        return this.phone;
    }
    void setName(String name){
        this.name = name;
    }
    void setAddress(String address){
        this.address = address;
    }
    void setEmail(String email){
        this.email = email;
    }
    void setPhone(String phone){
        this.phone = phone;
    }

    Person(){
        this("unknown","unknown","unknown","unknown");
    }

    @Override
    public String toString(){
        return "Person" + "\nname: " + this.name +"\naddress: " +
                this.address +"\nemail: " + this.email + "\nphone: " + this.phone +
                "\n---------------\n";
    }
}
