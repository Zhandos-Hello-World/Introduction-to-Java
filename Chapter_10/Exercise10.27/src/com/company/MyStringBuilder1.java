package com.company;


public class MyStringBuilder1 {
    private String s;
    public MyStringBuilder1(String s){
        this.s = s;
    }
    public MyStringBuilder1 append(MyStringBuilder1 s){
        this.s = this.s.concat(s.s);
        return new MyStringBuilder1(this.s);
    }
    public MyStringBuilder1 append(int i){
        this.s = this.s.concat(String.valueOf(i));
        return new MyStringBuilder1(this.s);
    }
    public int length(){
        return this.s.length();
    }
    public char charAt(int index){
        return this.s.charAt(index);
    }
    public MyStringBuilder1 toLowerCase(){
        this.s = this.s.toLowerCase();
        return new MyStringBuilder1(this.s);
    }
    public MyStringBuilder1 substring(int begin, int end){
        this.s = this.s.substring(begin, end);
        return new MyStringBuilder1(this.s);
    }
    public String toString(){
        return this.s;
    }
}
