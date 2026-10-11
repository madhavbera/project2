package Service;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import Entities.Myentity;
import Exceptions.Exception;
//import com.employe.info.webrepo;
@Service
public class Myservice {
	

	@Autowired
	RestTemplate resttemplate;
	
	public String getstring()
	{
		return "hellow world";
	}
	public Myentity getinfo(Integer id)
	{
		System.out.println("id:"+id);
		String url="http://localhost:9292/example/"+id;

	Myentity st=resttemplate.getForObject(url,Myentity.class);
	System.out.println("Return object:"+st);
		return  st;
	}
	public ResponseEntity<?> getAllid()
	{
		String url="http://localhost:9292/example/All";
		Myentity[] mt=resttemplate.getForObject(url, Myentity[].class);
		return ResponseEntity.ok(mt);
	}
	public String getmessag()
	{
		String url="http://localhost:9292/example/hellow";
		String me=resttemplate.getForObject(url,String.class);
		return me;
		}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handle(Exception ex)
	{
		Map<String,Object> map=new HashMap<>();
		map.put("status:",HttpStatus.NOT_FOUND);
		map.put("Error:",ex.getMessage());
		return new ResponseEntity<>(map,HttpStatus.NOT_FOUND);
		}
}
