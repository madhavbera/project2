package com.madhav.testapi.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

	@GetMapping("/greetme/{name}")
	public String welcome(@PathVariable String name) {
		return "Welcome " +name;
	}
	
	@GetMapping("/primeno/{n}")
	public List<Integer> getPrimeNo(@PathVariable int n) {
		List<Integer> list= new ArrayList<Integer> ();
		for(int i=1;i<n;i++)
		{
		int c=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
				c++;
		}
		if(c==2)
			list.add(i);
		}
		return list;
	}
	
	@GetMapping("/countletters/{name}")
	public String countLetters(@PathVariable String name) {
		char[] n= name.toLowerCase().toCharArray();
		int vowels=0;
		int consonents=0;
		for(int i=0;i<n.length;i++) {
			if(n[i]=='a' || n[i]=='e' || n[i]=='i' || n[i]=='o' || n[i]=='u') {
				vowels++;
			}
			else {
				consonents++;
			}
		}
		return "Vowels="+vowels+" Consonents="+consonents;
	}
	
	@GetMapping("/{cases}/{a}/{b}")
	public ResponseEntity<?> calculator(@PathVariable float a ,@PathVariable float b,@PathVariable String cases)
	{
		switch(cases)
		{
		case "sum":
			return new ResponseEntity(a+b, HttpStatus.OK);
		case "subtract":
			return new ResponseEntity(a-b, HttpStatus.OK);
		case "multiply":
			return new ResponseEntity(a*b, HttpStatus.OK);
		case "divide":
			return new ResponseEntity(a/b, HttpStatus.OK);
		default:
			return new ResponseEntity("INVALID CASE", HttpStatus.OK);
		}
	}
	
	@GetMapping("/table/{n}")
	public String welcome(@PathVariable int n) {

	    String s = "";
	    for (int i = 1; i <= 10; i++) {
	        s += n + " * " + i + " = " + (i * n) + "<br>";
	    }
	    return s;
	}

@GetMapping("/searchelement/{n}")
public int search(@PathVariable int n)
{
	int a[]= {5,6,7,8};
	for(int i=0;i<a.length;i++) {

		if (a[i]==n) {
			return (i+1);
//			break;
			
		}
	}
	return -1;
}
}

