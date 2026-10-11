package Controller;

import java.awt.PageAttributes.MediaType;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Entities.C;
import Entities.Ns;
//import Entities.StudentCourse;
import Repositry.Courepo;
import Repositry.Nsrepo;
//import Repositry.StCrrepo;

@RestController
@RequestMapping("/manytomany")
public class Manytomany {
	private final Courepo c;
	private final Nsrepo nrepo;
	public Manytomany(Courepo c,Nsrepo nrepo)
	{
		this.c=c;
		this.nrepo=nrepo;
	}
	
	@GetMapping(value="Data",produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public List<C> getdata()
	{
		return c.findAll();
	}
	@GetMapping(value="/GetData")
	public List<Ns> GetData()
	{
		return nrepo.findAll();
	}

}
