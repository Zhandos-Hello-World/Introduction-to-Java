package com.company;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String password = str.next().toLowerCase();
        checkingPassword(password);
    }
    public static void checkingPassword(String password){
        if(password.length() >= 8 && checking(password, 'a', 'z') &&
                checking(password, '0', '9')){
            System.out.print("Password is correct");
        }
        else{
            System.out.print("Password is not correct");
        }
    }
    public static boolean checking(String password, char ch1 , char ch2){
        double check = 0;
        for(int i = 0; i < password.length(); i++){
            for(char n1 = 'a'; n1 < 'z'; n1++){
                if(n1 == password.charAt(i)){
                    check++;
                }
            }
            for(char n2 = '0'; n2 < '9'; n2++){
                if(n2 == password.charAt(i)){
                    check++;
                }
            }
        }
        if(check == password.length()){
            boolean a = false;
            int count = 0;
            boolean d = false;
            for(int i = 0; i < password.length(); i++){
                if(ch1 == 'a'){
                    while (ch1 <= ch2){
                        if(ch1 == password.charAt(i)){
                            a = true;
                            break;
                        }
                        ch1++;
                    }
                    ch1 = 'a';
                }
                else if(ch1 == '0'){
                    d = true;
                    while(ch1 <= ch2){
                        if(ch1 == password.charAt(i)){
                            count++;
                        }
                        ch1++;
                    }
                    ch1 = '0';
                }
            }
            if(count >= 2){
                return true;
            }
            else{
                return a;
            }
        }
        else{
            return false;
        }

    }
}
