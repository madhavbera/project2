package com.dockercontainer.place.cont;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dockercontainer.place.entity.UserDB;
import com.dockercontainer.place.entity.Userdto;
import com.dockercontainer.place.repo.Myrepo;

@RestController
@RequestMapping("/dockerpalce")
public class Placecont {
   
	@Autowired
	Myrepo repo;
	private final PasswordEncoder encoder;
	public Placecont(PasswordEncoder encoderdt)
	{
		this.encoder=encoderdt;
	}
	@GetMapping("/hellow")
	public String gethellow()
	{
		return "Hellow user how can i help you , trasfer a file";
	}
	@PostMapping("/createuser/{id}")
	public String createuser(@RequestBody Userdto dt,@PathVariable int id)
	{
		UserDB user=new UserDB();
		user.setId(id);
		user.setName(dt.getName());
		user.setPassword(encoder.encode(dt.getPassword()));
		user.setRoles(dt.getRoles());
		repo.save(user);
		return "User created successfully";
		
	}
	@PreAuthorize("hasRole('USER')")
	@GetMapping("/sum/{a}/{b}")
	public String  get(@PathVariable int a,@PathVariable int b)
	{
		return "sum:"+(a+b);
	}
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/multiply/{a}/{b}")
	public ResponseEntity<String> getmulti(@PathVariable long a ,@PathVariable long b)
	{
		return ResponseEntity.ok("Multiply of "+a+" * "+b+"="+(a*b));
		
	}
}
