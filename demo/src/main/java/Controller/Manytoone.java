package Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Entities.E;
import Repositry.Erepo;

@RestController
@RequestMapping("/manytoone")
public class Manytoone {
	private final Erepo erepo;
	public Manytoone(Erepo erepo)//Constructor injection
	{
		this.erepo=erepo;
	}
  @GetMapping("/Data")
  public List<E> getemp()
  {
	  return erepo.findAll();
  }

}
