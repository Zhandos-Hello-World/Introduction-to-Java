/*
(BinaryFormatException) Exercise 12.7 implements the bin2Dec method
to throw a BinaryFormatException if the string is not a binary string. Define
a custom exception called BinaryFormatException. Implement the bin2Dec
method to throw a BinaryFormatException if the string is not a binary string.
*/

public class Main{
	public static void main(String[]args){
		try{
			System.out.println(bin2Dec("1001"));
			System.out.println(bin2Dec("1002"));
		}
		catch(BinaryFormatException ex){
			System.out.print(ex.getMessage());
		}
	}
	public static int bin2Dec(String binaryStr)throws BinaryFormatException{
		for(int i = 0; i < binaryStr.length(); i++){
			if(binaryStr.charAt(i) > '1' || binaryStr.charAt(i) < '0'){
				throw new BinaryFormatException(binaryStr);
			}
		}
        int number = 0;
        for(int i = 0; i < binaryStr.length(); i++){
            if (binaryStr.charAt(i) == '0') {
                continue;
            }
            number += Math.pow(2, (binaryStr.length() - 1 - i));
        }
        return number;
    }
}