package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import Entities.Product;
import Repositry.Myproductrepo;

@Service
public class Myproductservice {
	@Autowired
     Myproductrepo repo;
	public ResponseEntity<?> getAll()
	{
		return ResponseEntity.ok(repo.findAll());
	}
	public ResponseEntity<?> getByid(List<Integer> id)
	{
		return ResponseEntity.ok(repo.findAllById(id));
	}
	public ResponseEntity<?> getrequireddata(List<Integer> id)
	{
		return ResponseEntity.ok(repo.getinfo(id));
	}
	public void getd(List<Integer> id)
	{
		 repo.getdelete(id);
	}
	public ResponseEntity<?> getsdata(int id)
	{
	
		return  ResponseEntity.ok( repo.getspedata(id));
	}
	public Product getsingledata(int id)
	{
		return repo.getData(id);
	}
	public List<Product> getdata()
	{
		return repo.getall();
	}
public String getbubble(List<Integer> num)
{
	for(int i=0;i<num.size();i++){
		for(int j=0;j<num.size()-i-1;j++)
		{
			if(num.get(j)<num.get(j+1))
			{
			int temp=num.get(j+1);
			num.set(j+1, num.get(j));
			num.set(j,temp);
			}
		}
	}
	return "Sorted list:"+num;
}
}
