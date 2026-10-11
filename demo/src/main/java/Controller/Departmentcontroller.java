package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Entities.Department;

@RestController
@RequestMapping("/department")
public class Departmentcontroller {
	Department d;
	@GetMapping("/hellow")
	public String gethellow()
	{
		return "Hellow world!";
	}
	@PostMapping("/insertvalue")
	public String postvalue(@RequestBody Department de)
	{
		this.d=de;
		return "value insert successfully";
	}
	@GetMapping("/display")
	public Department getdata()
	{
		return d;
	}
	@PutMapping("/update value/{id}")
	public String updatevalue(@PathVariable int id)
	{
		d.setId(id);
		return "value update successfully";
	}

}
