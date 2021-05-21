/*
(Guessing the capitals) Rewrite Programming Exercise 8.37 to store the pairs
of states and capitals so that the questions are displayed randomly.
 */

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static String[][] StateAndCapital = {
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
            {"Nevada", "Carson City"}, {"New Hampshire", "Concord"},
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
        ArrayList<String> state = new ArrayList<>(StateAndCapital.length);
        ArrayList<String> capital = new ArrayList<>(StateAndCapital.length);
        ArrayList<Integer> isUsed = new ArrayList<>();
        for(String[]value:StateAndCapital){
            state.add(value[0]);
            capital.add(value[1]);
        }
        int x = 0;
        for(int i = 0; i < state.size(); i++){
            boolean check = true;
            Integer randomNumber = (int)(Math.random() * StateAndCapital.length + 0);
            while(check){
                if(isUsed.contains(randomNumber)){
                    randomNumber = (int)(Math.random() * StateAndCapital.length + 0);
                }
                else{
                    check = false;
                    isUsed.add(randomNumber);
                }
            }

            System.out.print("What is the capital of " + state.get(randomNumber) + "?");
            String input = str.next().toLowerCase().trim();
            if(input.equals(capital.get(randomNumber).toLowerCase().trim())){
                System.out.println("Your answer is correct");
                x++;
            }
            else{
                System.out.println("The correct answer should be " + capital.get(randomNumber));
            }
        }
        System.out.print("The correct count is " + x);
    }
}

