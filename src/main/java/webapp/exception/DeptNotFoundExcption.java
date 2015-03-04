package webapp.exception;

public class DeptNotFoundExcption extends RuntimeException {
	
	public DeptNotFoundExcption() {
		super();
		
	}
	
	public DeptNotFoundExcption(String message) {
		super(message);
		
	}
	
	public DeptNotFoundExcption(String message, Throwable e) {
		super(message,e);
		
	}

}
