package com.docker.dockerproject.controller;

import java.net.http.HttpClient;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

import com.docker.dockerproject.entity.User;
import com.docker.dockerproject.exception.Exception;
import com.docker.dockerproject.repository.Userrepo;

import jakarta.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/login")
public class Login {
//	@Autowired
//	User us;
	@Autowired
	Userrepo urepo;
  @PutMapping("/user")
  public String putuser(@RequestBody User us)
  {
	  urepo.save(us);
	  
	  return "Data stored successfuly";
	   }
  @PostMapping("/update")
  public String getupdate(@RequestBody User us)
  {
	  urepo.save(us);
	  return "updated successfully";
  }
  @GetMapping("/getdata/{id}")
  public ResponseEntity<?> getdata(@PathVariable int id)
  {
	  User us=new User();
//	  User u =urepo.findById(id).orElseThrow(()->new Exception("Id not found at "+id));
	  if(!(urepo.existsById(id)))
	  {
		throw new Exception("Id not found at "+id);  
	  }
	   us =urepo.getvalue(id);
	  
	  return new ResponseEntity<>(us,HttpStatus.OK);
  }
  @ExceptionHandler(Exception.class)
  public ResponseEntity<?> handle(Exception ex)
  {
	  Map<String, Object> map=new HashMap<>();
	  map.put("Error:", ex.getMessage());
	  map.put("Time:", LocalDateTime.now());
	  map.put("Status:", HttpStatus.NOT_FOUND.value());
	  return ResponseEntity.ok(map);
	  
  }
  

}
