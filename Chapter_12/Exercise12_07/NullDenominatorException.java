public class NullDenominatorException extends Exception{
	private String message = "NullDenominatorException";
	public NullDenominatorException(String message){
		this.message = this.message.concat(": " + message);
	}
	@Override
	public String getMessage(){
		return message;
	}
}