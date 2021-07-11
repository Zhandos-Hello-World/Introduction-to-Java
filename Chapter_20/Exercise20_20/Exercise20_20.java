/*
(Nonrecursive Tower of Hanoi) Implement the moveDisks method in Listing 18.8
using a stack instead of using recursion
*/
import java.util.Stack;
public class Exercise20_20{
	public static void main(String[]args){
		
	}
	public static void moveDisks(int n, char fromTower, char toTower, char auxTower) {
	if (n == 1)
		System.out.println("Move disk " + n + " from " +
		fromTower + " to " + toTower);
	else {
		moveDisks(n − 1, fromTower, auxTower, toTower);
		System.out.println("Move disk " + n + " from " +
		fromTower + " to " + toTower);
		moveDisks(n − 1, auxTower, toTower, fromTower);
		}
 	}
}