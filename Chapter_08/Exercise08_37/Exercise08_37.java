/*
(Guess the capitals) Write a program that repeatedly prompts the user to enter
a capital for a state. Upon receiving the user input, the program reports whether
the answer is correct. Assume that 50 states and their capitals are stored in a
two-dimensional array, as shown in Figure 8.10. The program prompts the user to
answer all states’ capitals and displays the total correct count. The user’s answer
is not case-sensitive.

Here is a sample run:
What is the capital of Alabama? Montogomery
The correct answer should be Montgomery
What is the capital of Alaska? Juneau
Your answer is correct
What is the capital of Arizona? ...
...
The correct count is 35
*/
import java.util.Scanner;
public class Exercise08_37 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String[][] StateAndCapital = {
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
                {"Nevada    ", "Carson City"}, {"New Hampshire", "Concord"},
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
        int x = 0;
        for (String[] strings : StateAndCapital) {
            System.out.print("What is the capital of " + strings[0] + "? ");
            String input = str.next().toLowerCase().trim();
            if (input.equals(strings[1].toLowerCase().trim())) {
                System.out.println("Your answer is correct");
                x++;
            } else {
                System.out.println("The correct answer should be " + strings[1]);
            }
        }
        System.out.print("The correct count is " + x);
    }
}
