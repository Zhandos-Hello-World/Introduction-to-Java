package com.company;
import java.util.Scanner;

class Main {

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if(a.length() == b.length()){
            if(a.equals(b)){
                return true;
            }
            else{
                String s = "";
                for(int i = a.length() - 1; i >= 0; i--){
                    s = s.concat(String.valueOf(a.charAt(i)));
                }
                if(s.equals(b)){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}