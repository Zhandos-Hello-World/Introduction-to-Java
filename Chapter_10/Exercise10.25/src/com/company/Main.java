package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String s = "a?b?gf#e";
        String regex = "-";
        for(String value : split("a?b?gf#e", "?#")){
            System.out.print(value + " ");
        }
    }
    public static String[] split(String s, String regex){
        ArrayList<String> arr = new ArrayList<>();
        String save = "";
        boolean q = false;
        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < regex.length(); j++){
                if(s.charAt(i) != regex.charAt(j)){
                    save = save.concat(String.valueOf(s.charAt(i)));
                    q = true;
                }
                else{
                    if(q){
                        arr.add(save);
                        save = "";
                        
                        q = false;
                    }
                    arr.add(String.valueOf(s.charAt(i)));
                }
            }
        }
        String []a = new String[arr.size()];
        int index = 0;
        for(String w:arr){
            a[index] = w;
            index++;
        }
        return a;
    }
}
