package com.company;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        File file = new File("E:\\Import\\JavaExamples\\Chapter_12\\English\\src\\com\\company\\Data");
        try{
            Scanner scanner = new Scanner(file);
            ArrayList<String> arrayList = new ArrayList<>();
            while(scanner.hasNext()){
                arrayList.add(scanner.nextLine());
            }
            String[]englishData = new String[arrayList.size()];
            String[]RussiaData = new String[arrayList.size()];
            ArrayList<String> list = new ArrayList<>();
            for(int i = 0; i < arrayList.size(); i++) {
                int begin = 0, end = 0;
                for (int j = 0; j < arrayList.get(i).length(); j++) {
                    if (arrayList.get(i).charAt(j) == '[') {
                        end = j;
                    }
                    if (arrayList.get(i).charAt(j) == ']') {
                        begin = j;
                        list.add(arrayList.get(i).substring(0, end - 1).concat(arrayList.get(i).substring(begin + 1)));
                        String word = list.get(i);
                        for (int k = 0; k < list.get(i).length(); k++) {
                            if (word.charAt(k) == '-') {
                                englishData[i] = list.get(i).substring(0, k);
                                RussiaData[i] = list.get(i).substring(k + 1);
                                break;
                            }
                        }
                    }
                }
            }
            Scanner str = new Scanner(System.in);
            int i = 0;
            while(i < 100){
                System.out.print(englishData[i] + " - ");
                String input = str.next();
                String word = " ";
                for(int j = 0; j < RussiaData[i].length(); j++){
                    if(RussiaData[i].charAt(j) != ' '){
                        word = word.concat(String.valueOf(RussiaData[i].charAt(j)));
                    }
                }
                if(input.equals(word)){
                    System.out.println("Correct");
                }
                else{
                    System.out.println("Wrong");
                }
                i++;
            }
        }
        catch (FileNotFoundException ex){
            System.out.print(ex.getMessage());
        }
    }
}
