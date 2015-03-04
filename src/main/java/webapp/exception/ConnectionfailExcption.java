package webapp.exception;

public class ConnectionfailExcption extends RuntimeException {
	
	public ConnectionfailExcption() {
		super();
		
	}
	
	public ConnectionfailExcption(String message) {
		super(message);
		
	}
	
	public ConnectionfailExcption(String message, Throwable e) {
		super(message,e);
		
	}

}
