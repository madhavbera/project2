package com.madhav.testapi;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.madhav.testapi.entities.Student;
import com.madhav.testapi.repo.ClassRepo;
import com.madhav.testapi.repo.StudentRepo;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
@EnableFeignClients
public class TestapiApplication {
	
	@Autowired
	StudentRepo repo;
	
	@Autowired
	ClassRepo classRepo;

	public static void main(String[] args) {
		SpringApplication.run(TestapiApplication.class, args);
	}

//	@PostConstruct
//    public void init() {
//		com.madhav.testapi.entities.Class c1 = classRepo.save(new com.madhav.testapi.entities.Class("Intermediate"));
//		
//		com.madhav.testapi.entities.Class c2 = classRepo.save(new com.madhav.testapi.entities.Class("Metric"));
//		com.madhav.testapi.entities.Class c3 = classRepo.save(new com.madhav.testapi.entities.Class("BCA"));
//		com.madhav.testapi.entities.Class c4 = classRepo.save(new com.madhav.testapi.entities.Class("Under Metric"));
//
//        repo.save(new Student("Madhav Bera",10,550,"Chakulia",c3));
//        repo.save(new Student("Sasti Bera",11,540,"Chakulia",c1));
//        repo.save(new Student("Hashnain Shaikh",8,570,"Odisha",c3));
//        repo.save(new Student("Tonomono Bera",8,520,"Cable Basti",c4));
//    }	
}
