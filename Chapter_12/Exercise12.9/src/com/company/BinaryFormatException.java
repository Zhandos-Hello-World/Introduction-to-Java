package com.company;
public class BinaryFormatException extends Exception{
    private String message = "BinaryFormatException";
    BinaryFormatException(String message){
        this.message = message;
    }
    public String getMessage(){
        return this.message;
    }
    void setMessage(String message){
        this.message = message;
    }
    void addMessage(String message){
        this.message = this.message.concat(message);
    }
}
