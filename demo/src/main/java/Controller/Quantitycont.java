package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import Entities.Account;
import Entities.Myentity;
import Entities.Qantity;
import Repositry.Quantrepo;

@RestController
@RequestMapping("/quantity")
public class Quantitycont {
	
	@Autowired
	RestTemplate resttempate;
	
	@Autowired
	Quantrepo qrepo;
	private Qantity q;
	
	@GetMapping(value="/hellow",produces=MediaType.APPLICATION_JSON_VALUE)
	public String gethellow()
	{
		return "hellow";
	}
	@GetMapping(value= "/insertvalue",produces=MediaType.APPLICATION_JSON_VALUE)
	public String insertvalue()
	{
		qrepo.insertvalues();
		return "values are inserted successfully ";
		
	}
	@PostMapping(value="/insertvalue",consumes="application/json")
	public String putvalue(@RequestBody Qantity qa)
	{
		this.q=qa;
		return "value insert successfully";
	}
	@GetMapping(value="/display",produces=MediaType.APPLICATION_XML_VALUE)
	public Qantity getvalues()
	{
		return q;
	}
	@PutMapping(value="/update/{id}",consumes=MediaType.APPLICATION_JSON_VALUE)
	public String update(@PathVariable int id,@RequestBody Qantity qa)
	{
		q.setQuantity_id(id);
		qrepo.save(q);
		return "update successfully";
	}
    @GetMapping("/communication/{message}")
    public String getmessge(@PathVariable String message)
    {
    	String url="http://localhost:9292/example/hellow";
    	String get=resttempate.getForObject(url, String.class);
    	return get;
    }
    @GetMapping(value="/{message}",produces="application/json")
    public String getmess(@PathVariable String message)
    {
    	String url="http://localhost:9292/example/information";
    	String getdata=resttempate.getForObject(url, String.class);
    	return getdata;
    }
    @GetMapping(value="/Data/{id}",produces="application/xml")
    public ResponseEntity<?> getdata(@PathVariable int id)
    {
    	String url="http://localhost:9292/example/"+id;
    	Myentity en =resttempate.getForObject(url, Myentity.class);
//    	System.out.println(en.getBody());
//    	System.out.println(en.getStatusCode());
//    	System.out.println(en.getHeaders());
    	return new ResponseEntity<>(en,HttpStatus.OK);
    }
    @GetMapping(value="/Getalldata",produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<?> getALLdata(){
    	String url="http://localhost:9292/example/All";
    	Myentity[] list=resttempate.getForObject(url, Myentity[].class);
    	return new ResponseEntity<>(list,HttpStatus.OK);
    }
    @GetMapping(value="/fetchdata",produces="application/xml")
    public ResponseEntity<?> getallfetchdata()
    {
    	String url="http://localhost:8283/Books/getalldata";
    	Account[] ac=resttempate.getForObject(url,Account[].class);
    	return ResponseEntity.ok(ac);
    	}
    @GetMapping(value="/credit/{id}/{account_no}/{money}",produces=MediaType.TEXT_PLAIN_VALUE)
    public String credited(@PathVariable int id,@PathVariable long account_no,@PathVariable long money) {
    	String url="http://localhost:8283/Books/credit/"+id+"/"+account_no+"/"+money;
    	String message=resttempate.getForObject(url, String.class);
    	return message;
    	
    }
    }
