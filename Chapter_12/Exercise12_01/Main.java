/*
(NumberFormatException) Listing 7.9, Calculator.java, is a simple command-line calculator. Note the program terminates if any operand is nonnumeric.
Write a program with an exception handler that deals with nonnumeric operands;
then write another program without using an exception handler to achieve the
same objective. Your program should display a message that informs the user of
the wrong operand type before exiting (see Figure 12.12).
*/

public class Main{
	public static void main(String[]args){
		if(args.length != 3){
			System.out.print("Usage: java Calculator operand1 operator operand2");
			System.exit(1);
		}
		int i = 0;
		int operand1 = 0, operand2 = 0;
		try{
			operand1 = Integer.parseInt(args[i]);
			i += 2;
			operand2 = Integer.parseInt(args[i]);
			char operator = args[1].charAt(0);
			int result = 0;
			switch(operator){
				case '+': result = operand1 + operand2;break;
				case '-': result = operand1 - operand2;break;
				case '/': result = operand1 / operand2;break;
				case '*': result = operand1 * operand2;break;
			}
			System.out.print(operand1 + ' ' + operator + ' ' + operand2 + '=' + result);

		}
		catch(NumberFormatException ex){
			System.out.print("Wrong input: " + args[i]);
		}
	}
}