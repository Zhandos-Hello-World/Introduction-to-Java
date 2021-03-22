package com.company;

public class MyString2 {
    private String s;


    String getS(){
        return this.s;
    }


    public MyString2(String s){
        this.s = s;
    }
    public int compare(String s){
        return s.length();
    }
    public MyString2 substring(int begin){
        char[] temp = new char[this.s.length() - 1 - begin];
        for(int i = begin, index = 0; i < temp.length; i++, index++){
            temp[index] = this.s.charAt(i);
        }
        String res = "";
        for(char char1:temp){
            res = res.concat(String.valueOf(char1));
        }
        return new MyString2(res);
    }

    public MyString2 toUpperCase(){
        char[] temp = new char[this.s.length()];
        for(int i = 0; i < this.s.length(); i++){
            char q = this.s.charAt(i);
            if(q >= 'a' && q <= 'z'){
                temp[i] = (char)(q - 32);
            }
            else{
                temp[i] = this.s.charAt(i);
            }
        }
        String res = "";
        for(char char1:temp){
            res = res.concat(String.valueOf(char1));
        }
        return new MyString2(res);
    }
    public char[] toChars(){
        char []res = new char[this.s.length()];
        for(int i = 0; i < this.s.length(); i++){
            res[i] = s.charAt(i);
        }
        return res;
    }
    public static MyString2 valueOf(boolean b){
        String temp = "";
        if(b){
            temp = "true";
        }
        else{
            temp = "false";
        }
        return new MyString2(temp);
    }
}
