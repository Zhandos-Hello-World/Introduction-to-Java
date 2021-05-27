public class IllegalTriangleException extends Exception{
	private String message = "IllegalTriangleException";
	public IllegalTriangleException(String message){
		this.message = this.message.concat(": " + message);
	}
	@Override
	public String getMessage(){
		return message;
	}

}