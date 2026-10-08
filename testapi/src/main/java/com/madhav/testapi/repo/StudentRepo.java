package com.madhav.testapi.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.madhav.testapi.entities.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

	List<Student> findByRoll(Long rollNo);

	Student findByRollAndName(int roll, String name);

}
