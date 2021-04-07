package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
public class Main {
    private static String[][] StateAndCapital = {
            {"Alabama", "Montgomery"}, {"Alaska", "Juneau"}, {"Arizona", "Phoenix"},
            {"Arkansas", "Little Rock"}, {"California", "Sacramento"},
            {"Colorado", "Denver"}, {"Connecticut", "Hartford"},
            {"Delaware", "Dover"}, {"Florida", "Tallahassee"},
            {"Georgia", "Atlanta"},{"Hawaii", "Honolulu"}, {"Idaho", "Boise"},
            {"Illinois", "Springfield"}, {"Indiana", "Indianapolis"},
            {"Iowa Des", "Moines"}, {"Kansas", "Topeka"}, {"Kentucky","Frankfort"},
            {"Louisiana", "Baton Rouge"}, {"Maine", "Augusta"},
            {"Maryland", "Annapolis"}, {"Massachusetts", "Boston"},
            {"Michigan", "Lansing"}, {"Minnesota", "Saint Paul"},
            {"Mississippi", "Jackson"}, {"Missouri", "Jefferson City"},
            {"Montana", "Helena"}, {"Nebraska", "Lincoln"},
            {"Nevada	", "Carson City"}, {"New Hampshire", "Concord"},
            {"New Jersey", "Trenton"}, {"New Mexico", "Santa Fe"},
            {"New York", "Albany"}, {"North Carolina", "Raleigh"},
            {"North Dakota", "Bismarck"},{"Ohio", "Columbus"},
            {"Oklahoma", "Oklahoma City"}, {"Oregon", "Salem"},
            {"Pennsylvania", "Harrisburg"}, {"Rhode Island", "Providence"},
            {"South Carolina", "Columbia"}, {"South Dakota", "Pierre"},
            {"Tennessee", "Nashville"}, {"Texas", "Austin"},
            {"Utah", "Salt Lake City"}, {"Vermont", "Montpelier"},
            {"Virginia", "Richmond"}, {"Washington", "Olympia"},
            {"West Virginia", "Charleston"}, {"Wisconsin", "Madison"},
            {"Wyoming", "Cheyenne"}};

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        ArrayList<String> states = getValue(0);
        ArrayList<String> capitals = getValue(1);
        ArrayList<Integer> finishedQuestions = new ArrayList<>();
        long c = System.currentTimeMillis();
        Collections.shuffle(states, new Random(c));
        Collections.shuffle(capitals, new Random(c));
        int x = 0;
        for(int i = 0; i < states.size(); i++){
            System.out.print("What is the capital of " + states.get(i) + "?");
            String input = str.next().toLowerCase();
            if(input.equals(capitals.get(i))){
                System.out.println("Your answer is correct");
                x++;
            }
            else{
                System.out.println("The correct answer should be " + capitals.get(i));
            }
        }
        System.out.print("The correct count is " + x);
    }
    public static ArrayList<String> getValue(int t){
        ArrayList<String> e = new ArrayList<>();
        for(int i = 0; i < StateAndCapital.length; i++){
            e.add(StateAndCapital[i][t]);
        }
        return e;
    }
}