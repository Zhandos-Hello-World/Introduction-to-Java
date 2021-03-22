package com.company;

public class MyString1{
    private char[] chars;

    public MyString1(char[] chars){
        this.chars = new char[chars.length];
        int i = 0;
        for(char value:chars){
            this.chars[i] = value;
            i++;
        }

    }
    public char charAt(int index){
        return this.chars[index];
    }
    public int length(){
        int len = 0;
        for(int i = 0; i < chars.length; i++){
            len++;
        }
        return len;
    }
    public MyString1 substring(int begin, int end){
        char[]temp = new char[end - begin];
        for(int i = begin, j = 0; i < end; i++, j++){
            temp[j] = this.chars[i];
        }
        return new MyString1(temp);
    }
    public MyString1 toLowerCase(){
        char[] ch = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z')
                ch[i] = (char)(chars[i] + 32);
            else
                ch[i] = chars[i];
        }
        return new MyString1(ch);
    }
    public boolean equals(MyString1 s){
        boolean check = true;
        for(int i = 0; i < s.chars.length; i++){
            if(this.chars[i] != s.chars[i]){
                check = false;
                break;
            }
        }
        return check;
    }
    public static MyString1 valueOf(int i){
        int length = 0;
        int n = i;
        while (n >= 1) {
            n /= 10;
            length++;
        }
        char[] ch = new char[length];
        for (int j = 0, k = (int)Math.pow(10, length - 1);
             j < length; j++, k /= 10) {
            ch[j] = Character.forDigit((i / k), 10);
            i %= k;
        }

        return new MyString1(ch);
    }
}
