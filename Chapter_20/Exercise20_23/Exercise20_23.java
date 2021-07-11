/*
(Evaluate expression) Modify Listing 20.12, EvaluateExpression class to make
all operators (+*−/) have equal precedence. For example, 4 + 3 − 2 * 10
is 50. Write a test program that prompts the user to enter an expression and
displays the result.
*/
import java.util.Stack;
public class Exercise20_23{
	public static void main(String[]args){
		if(args.length != 1){
			System.out.print("Usage: java Exercise20_23 \"12 32 +\"");
			System.exit(1);
		}

		String word = args[0];


		Stack<Integer> operand = new Stack<>();
		Stack<Character> operator = new Stack<>();

		String[]token = word.split(" ");
		for(String value:token){
			if(value.equals("+") || value.equals("-") || value.equals("*") || value.equals("/")){
				operator.push(value.charAt(0));
			}
			else{
				operand.push(Integer.parseInt(value));
				if(!operator.empty() && operand.size() == 2){
					String operation = String.valueOf(operator.pop());
					int num2 = operand.pop();
					int num1 = operand.pop();

					switch(operation){
						case "+": operand.push(num1 + num2);break;
						case "-": operand.push(num1 - num2);break;
						case "/": operand.push(num1 / num2);break;
						case "*": operand.push(num1 * num2);break;
					}
				}
			}
		}
		System.out.print("The result is " + operand.pop());
	}

}