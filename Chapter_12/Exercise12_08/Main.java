/*
(HexFormatException) Programming Exercise 12.6 implements the hex2Dec
method to throw a NumberFormatException if the string is not a hex string.
Define a custom exception called HexFormatException. Implement the hex2Dec
method to throw a HexFormatException if the string is not a hex string.
*/
import java.util.Scanner;

public class Main{
	public static void main(String[]args){
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a hex number: ");
		try{
			String hex = input.nextLine();
			System.out.println("The decimal value for hex number "
				+ hex + " is " + hexToDecimal(hex.toUpperCase()));
		}catch(HexFormatException ex){
			System.out.print(ex.getMessage());
		}

	}
	public static int hexToDecimal(String hex) throws HexFormatException{
		int decimalValue = 0;
		for (int i = 0; i < hex.length(); i++) {	
			char hexChar = hex.charAt(i);	
			if (!((hexChar >= '0' && hexChar <= '9') ||
			 	(hexChar >= 'A' && hexChar <= 'F')))
				throw new HexFormatException(hex);		
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
		}
		return decimalValue;
	}
	public static int hexCharToDecimal(char ch){
		if (ch >= 'A' && ch <= 'F'){
			return 10 + ch - 'A';
		}
		else{
			return ch - '0';
		}
	}
}