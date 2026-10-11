package Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Entities.Software;
import Repositry.Sofrepo;

@RestController
@RequestMapping("/onetoone")
public class Onetoone {
	public final Sofrepo srepo;
	public Onetoone(Sofrepo srepo)
	{
		this.srepo=srepo;
	}
	@GetMapping("/getdata")
	public List<Software> getsdata()
	{
		return srepo.findAll();
	}

}
