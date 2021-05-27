public class HexFormatException extends Exception{
	private String message = "Invalid format of the hexadecimal";
	public HexFormatException(String message){
		this.message = this.message.concat(": " + message);
	}
	@Override
	public String getMessage(){
		return message;
	}
}