package com.company;

public class HexFormatException extends Exception{
    private String message = "HexFormatException";
    public HexFormatException() {
        super();
    }
    HexFormatException(String message){
        this.message = this.message.concat(": " + message);
    }
    public String getMessage(){
        return this.message;
    }
    void setMessage(String message){
        this.message = this.message.concat(message);
    }

}
