package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import Entities.Myentity;
import Service.Myservice;

@RestController
@RequestMapping("/take")
public class Mycontroller {

	@Autowired
	Myservice service;
	@GetMapping("/hellow")
	public String getmess()
	{
		return "hellow";
	}
	@GetMapping("/hellow world")
	public String getservice()
	{
		return service.getstring();
	}
	@GetMapping("/id/{id}")
	public ResponseEntity<?> getdata(@PathVariable Integer id)
	{
		return ResponseEntity.ok( service.getinfo(id));
	}
	@GetMapping(value="/getAll",produces="application/json")
	public ResponseEntity<?> getall()
	{
		return service.getAllid();
	}
	@GetMapping("/hellow gpt")
	public String gethe()
	{
		return service.getmessag();
	}
}
