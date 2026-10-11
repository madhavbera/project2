package Exceptions;

//import org.springframework.web.bind.annotation.RestControllerAdvice;

//@RestControllerAdvice
public class Exception extends RuntimeException {

	public Exception(String message) {
		super(message);
	}
	

}
