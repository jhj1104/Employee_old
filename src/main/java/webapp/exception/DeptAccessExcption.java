package webapp.exception;

public class DeptAccessExcption extends RuntimeException {
	
	public DeptAccessExcption() {
		super();
		
	}
	
	public DeptAccessExcption(String message) {
		super(message);
		
	}
	
	public DeptAccessExcption(Throwable e) {
		super(e);
		
	}
	
	public DeptAccessExcption(String message, Throwable e) {
		super(message,e);
		
	}

}
