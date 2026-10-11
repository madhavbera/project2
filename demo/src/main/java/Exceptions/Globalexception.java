package Exceptions;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Globalexception {
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handle(Exception ex)
	{
		Map<String,Object> map=new HashMap<>();
		map.put("localtime", LocalDateTime.now());
		map.put("status:",HttpStatus.NOT_FOUND);
		map.put("Error:",ex.getMessage());
		return new ResponseEntity<>(map,HttpStatus.NOT_FOUND);
		
	}

}
