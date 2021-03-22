package com.company;

public class MyStringBuilder2 {
    private String s;
    private char[]chars;
    public MyStringBuilder2(){
    }
    public MyStringBuilder2(char[] chars){
        this.chars = chars;
    }
    public MyStringBuilder2(String s){
        this.s = s;
    }
    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s){
        String temp = this.s.substring(0, offset - 1);
        String temp2 = this.s.substring(offset);
        this.s = temp + s + temp2;
        return new MyStringBuilder2(this.s);
    }
    public MyStringBuilder2 reverse(){
        String temp = "";
        for(int i = this.s.length() - 1; i >= 0; i--){
            temp = temp.concat(String.valueOf(this.s.charAt(i)));
        }
        this.s = temp;
        return new MyStringBuilder2(this.s);
    }
    public MyStringBuilder2 substring(int begin){
        String temp = "";
        for(int i = begin; i < this.s.length(); i++){
            temp = temp.concat(String.valueOf(this.s.charAt(i)));
        }
        this.s = temp;
        return new MyStringBuilder2(this.s);
    }
    public MyStringBuilder2 toUpperCase(){
        this.s = this.s.toUpperCase();
        return new MyStringBuilder2(this.s);
    }
}
