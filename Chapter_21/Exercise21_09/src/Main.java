/*
(Guess the capitals using maps) Rewrite Programming Exercise 8.37 to store
pairs of each state and its capital in a map. Your program should prompt the user
to enter a state, and should display the capital for the state.
 */

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final String[][] StateAndCapital = {
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
    private static final Scanner str = new Scanner(System.in);
    private static int x = 0;
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        for(String[]str:StateAndCapital){
            map.put(str[0], str[1]);
        }
        map.forEach((State, Capital) -> {
            System.out.print("What is the capital of " + State + "?");
            String input = str.nextLine().toLowerCase().trim();
            if(input.equals(Capital.toLowerCase().trim())){
                System.out.println("Your answer is correct");
                x+=1;
            }
            else{
                System.out.println("The correct answer should be " + Capital);
            }
        });
        System.out.print("The correct count is " + x);
    }
}
