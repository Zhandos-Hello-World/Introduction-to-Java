package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner str = new Scanner(System.in);
        String remove = str.next();
        int[] cordinata = new int[2];
        File file = new File
            ("E:\\Import\\JavaExamples\\Chapter_12\\Exercise12.11\\src\\com\\company\\Text.txt");
        try{
            Scanner s = new Scanner(file);
            ArrayList<String> save = new ArrayList<>();
            while(s.hasNext()){
                save.add(s.nextLine());
            }
            s.close();
            char[] removeChar = remove.toCharArray();
            boolean check = false;
            for(int i = 0; i < save.size(); i++){
                for(int j = 0; j < save.get(i).length(); j++){
                    if(removeChar[0] == save.get(i).charAt(j)){
                        int q = 0;
                        int d = j;
                        for(int t = 0; t < removeChar.length; t++, d++){
                            if(d == save.get(i).length()){
                                break;
                            }
                            if(removeChar[t] == save.get(i).charAt(d)){
                                q++;
                            }
                        }
                        if(q == removeChar.length){
                            cordinata[0] = i;
                            cordinata[1] = j;
                            check = true;
                            break;
                        }
                    }
                }
            }
            if(check){
                String exchange = save.get(cordinata[0]).substring(0, cordinata[1]).concat(save.get(cordinata[0]).substring(cordinata[1] + remove.length()));
                PrintWriter a = new PrintWriter(file);
                save.remove(cordinata[0]);
                save.add(cordinata[0], exchange);
                for(int i = 0; i < save.size(); i++){
                    a.print(save.get(i));
                    a.print("\n");
                }
                a.close();
            }
        }
        catch(FileNotFoundException ex){
            System.out.print(ex.getMessage());
        }

    }
}
