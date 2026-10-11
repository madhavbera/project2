package com.docker.dockerproject.controller;

import org.springframework.http.MediaType;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.docker.dockerproject.entity.DTO;
import com.docker.dockerproject.entity.Employee;
import com.docker.dockerproject.exception.Globalexcepion;
import com.docker.dockerproject.exception.Exception;

//import com.docker.dockerproject.resttemplate.Resttemplate;

@RestController
@RequestMapping("/docker")
public class Cont {
	@Autowired
	RestTemplate resttemp;
	@GetMapping("/welcome")
	public ResponseEntity<String> getwelcome()
	{
		return new ResponseEntity<>("WELCOME TO MY APPLICATION",HttpStatus.OK);
	}
	@GetMapping("/Hellow")
	public String gethello()
	{
		return "Hellow User!";
	}
	@GetMapping("/hellow/{name}")
	public String getname(@PathVariable String name)
	{
		return "Hellow "+name;
	}
	@GetMapping("/getmessage")
	public String getmessage()
	{
		String url ="http://localhost:8989/dockerpalce/hellow";
		String message=resttemp.getForObject(url, String.class);
		return message;
	}
	@GetMapping(value="/GETData/{id}",produces= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
//	@PreAuthorize("hasRole('USER')")
    public ResponseEntity<?> getAlldata(@PathVariable int id)
	{

//		try {
		
		String url ="http://localhost:9292/example/"+id;
        Employee ls =resttemp.getForObject(url,Employee.class );
        DTO dt=new DTO();
        dt.setName(ls.getName());
        dt.setSalary(ls.getSalary());
        dt.setPost(ls.getPost());
	 return new ResponseEntity<>(dt,HttpStatus.OK);
//		}
//		catch(HttpClientErrorException.NotFound ex)
//		{
//			return ResponseEntity.ok("Id is not found at "+id);
//		}


	}
//	@ExceptionHandler(HttpClientErrorException.NotFound.class)
//	public ResponseEntity<?> handleexc(HttpClientErrorException.NotFound ex)
//	{
//		Map<String , Object> map =new HashMap<>();
//		map.put("ERROR:", "Id Not found");
//		map.put("time:", LocalDateTime.now());
//		map.put("status:", HttpStatus.NOT_FOUND.value());
//		return new ResponseEntity<>(map,HttpStatus.NOT_FOUND);
//	}
	@GetMapping("/divide/{a}/{b}")
	@PreAuthorize("hasRole('USER')")
	public ResponseEntity<?> getdivide(@PathVariable int a,@PathVariable int b)
	{
		if(b==0)
		{
			throw new Exception("Arithmetic exception");
		}
	float c=(float)a/b;
		return   ResponseEntity.ok("DIVISION: "+c);
	}
//	@ExceptionHandler(ArithmeticException.class)
//	public ResponseEntity<?> handle(ArithmeticException ex)
//	{
//		Map<String , Object> map=new HashMap<>();
//		map.put("ERROR","ArithmaticException");
//		map.put("Time", LocalDateTime.now());
//		map.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
//		return ResponseEntity.ok(map);
//	}
	@GetMapping("/All")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<?> getALL()
	{
		String url="http://localhost:9292/example/All";
		Employee[] em =resttemp.getForObject(url, Employee[].class);
		return new ResponseEntity<>(em,HttpStatus.OK);
	}
	@PreAuthorize("hasRole('USER')")
	@GetMapping("/sum/{a}/{b}")
	public ResponseEntity<?> getsum(@PathVariable int a,@PathVariable int b)
	{
		return ResponseEntity.ok("sum: "+(a+b));
	}
	@PreAuthorize("hasRole('USER')")
	@GetMapping("/multiply/{a}/{b}")
	public String getmulti(@PathVariable long a,@PathVariable long b)
	{
		return "Mutltiply: "+(a*b);
	}
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/Chossenumber")
	public ResponseEntity<?> getchoice(@RequestParam List<Integer> num)
	{
		
	List<Integer> filer=num.stream()
			.filter(n->n>2)
			.map(n->n*2)
			.collect(Collectors.toList());
	return new ResponseEntity<>(filer,HttpStatus.OK);
		
	}
	@PreAuthorize("hasRole('USER')")
	@GetMapping("/Unsorteddata")
	public ResponseEntity<String> getUnsorteddata(@RequestParam List<Integer> num,@RequestParam List<Integer> num1)
	{
		int sum=0;
	    for(int num2:num1)
	    {
	    	sum=sum+num2;
	    }
	
		List<Integer> numbers=num.stream().map(n->n+n).sorted().toList();

		return new ResponseEntity<>("List:"+numbers+" sum of the second number:"+sum,HttpStatus.OK);
	}


}
