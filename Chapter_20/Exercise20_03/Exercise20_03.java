/*
(Guessing the capitals) Rewrite Programming Exercise 8.37 to store the pairs
of states and capitals so that the questions are displayed randomly.
*/
import java.util.Scanner;
import java.util.LinkedList;
public class Exercise20_03{
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

    public static void main(String[] args) {
    	LinkedList<String> state = new LinkedList<>();
    	LinkedList<String> capital = new LinkedList<>();
    	for(int i = 0; i < StateAndCapital.length; i++){
    		state.add(StateAndCapital[i][0]);
    		capital.add(StateAndCapital[i][1]);
    	}

        Scanner str = new Scanner(System.in);
        int x = 0;
        while(!state.isEmpty()){
        	int random = (int)(Math.random() * state.size() + 0);
            System.out.print("What is the capital of " + state.get(random) + "? ");
            String input = str.next().toLowerCase().trim();
         	if (input.equals(capital.get(random).toLowerCase().trim())) {
                System.out.println("Your answer is correct");
                x++;
            } else {
                System.out.println("The correct answer should be " + capital.get(random));
            }
            capital.remove(random);
            state.remove(random);
        }
        System.out.print("The correct count is " + x);
    }
}
