package Student;
/**
 * @author Eric Newman
 * CSU Global
 * CSC 372 - Programming II
 * 11/05/2022
 */
	// custom exception class that is to validate the GPA
@SuppressWarnings("serial")
public class GPAException extends IllegalArgumentException{

	public GPAException() {															// constructor to accept no arguments by custom exception
		// No arguments
	}
	
	public GPAException(String message) {											// constructor to allow the custom exception to accept a string parameter
		super(message);
	}

	public GPAException(Throwable cause) {											// constructor to allow the custom exception to accept a throwable parameter
		super(cause);
	}
	
	public GPAException(String message, Throwable cause) {							// constructor to allow the custom exception to accept both string and throwable
		super(message, cause);
	}
} // ends GPAException class