package epam.cdp.auto.hw7;

public class SearchException extends Exception{
	
	private String msg;
	
	public SearchException(String msg) {
		this.msg = msg;
	}
	
	public String getMessage() {
		return msg;
	}

}