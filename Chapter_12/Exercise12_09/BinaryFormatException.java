public class BinaryFormatException extends Exception{
	private String message = "Wrong binary input";
	public BinaryFormatException(String message){
		this.message = this.message.concat(": " + message);
	}
	@Override
	public String getMessage(){
		return message;
	}
}