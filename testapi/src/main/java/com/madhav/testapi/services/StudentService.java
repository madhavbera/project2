package com.madhav.testapi.services;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.madhav.testapi.entities.Student;
import com.madhav.testapi.repo.StudentRepo;

@Service
public class StudentService {

	@Autowired
	StudentRepo repo;//loose coupling
	
	//get all records
	public List<Student> getAll(){
		return repo.findAll();
	}

	public List<Student> getStudentByRoll(Long rollNo) {
		// TODO Auto-generated method stub
		return repo.findByRoll(rollNo);
	}

	public ResponseEntity<?> insertStudent(Student s) {
		return new ResponseEntity<Student>(repo.save(s), HttpStatus.OK);
	}

	public ResponseEntity<?> updateStudent(Student s) {
		Student st =repo.findByRollAndName(s.getRoll(),s.getName());
		if (st==null) {
			return new ResponseEntity<String>("No record found", HttpStatus.OK);
		} else {
			st.setAddress(s.getAddress());
//			st.setClass_field(s.getClass_field());
			st.setName(s.getName());
			st.setTotalMarks(s.getTotalMarks());
			st.setRoll(s.getRoll());
			return new ResponseEntity<Student>(repo.save(st), HttpStatus.OK);
		}
	}

	public ResponseEntity<?> deleteStudent(int id) {
		Optional<Student> st =repo.findById(id);
		if (st.isEmpty()) {
			return new ResponseEntity<String>("No record found", HttpStatus.OK);
		} else {
			repo.delete(st.get());
			return new ResponseEntity<String>("Record deleted", HttpStatus.OK);
		}
	}
}
