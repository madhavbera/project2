package com.madhav.testapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.madhav.testapi.entities.Student;
import com.madhav.testapi.fiegnclient.Myfiegnclient;
import com.madhav.testapi.services.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService service;
//	@Autowired
//	Myfiegnclient fiegn;
//
//	@Override
//	public String getmessage()
//	{
//		String message=fiegn.getmessage();
//		return "your message"+message;
//	}
	@GetMapping("/getAll")
	public List<Student> getAll(){
		return service.getAll();
	}
	
    @GetMapping("/{rollNo}")
    public List<Student> getStudent(@PathVariable Long rollNo) {
        return service.getStudentByRoll(rollNo);
    }
    
    @PostMapping("/insert")
    public ResponseEntity<?> insert(@RequestBody Student s){

		return service.updateStudent(s);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable int id){
		return service.deleteStudent(id);
    }
}
