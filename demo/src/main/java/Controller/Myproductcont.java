package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Entities.Product;
import Repositry.Myproductrepo;
import Service.Myproductservice;

@RestController
@RequestMapping("/product")
public class Myproductcont {
	@Autowired
	Myproductservice service;
	@Autowired
	Myproductrepo repo;
	@GetMapping("/GetAll")
	public ResponseEntity<?> getALL()
	{
		return service.getAll();
	}
	@DeleteMapping("/deleterow/{id}")
	public String deletevalue(@PathVariable int id)
	{
		repo.deleteById(id);
		return "deleted successfully";
	}
	@GetMapping(
		    value = "/getoneid/{id}",
		    produces = MediaType.TEXT_HTML_VALUE
		)
		public String getsingleid(@PathVariable int id) {

		    Product p = repo.findById(id).orElse(null);

		    if (p == null) {
		        return "<h1>Product not found</h1>";
		    }

		    return """
		        <html>
		            <body style="background-color:blue";>
		                <h1>Product Details</h1>
		                <p style="background-color:red;">ID: %d</p>
		                <p>Name: %s</p>
		                <p>Price: %.2f</p>
		                <p>Discount:%d<p>
		            </body>
		        </html>
		        """.formatted(
		            p.getId(),
		            p.getProduct_name(),
		            p.getPrice(),
		            p.getDiscount()
		        );
		}
	 private Product p;
    @PostMapping(value="/insert value",consumes=MediaType.APPLICATION_ATOM_XML_VALUE)
    public String postvalue(@RequestBody Product pr)
    {
       this.p=pr;
    	return "value insert successfully";
    }
    @GetMapping("/display")
    public Product getproduct()
    {
    
     System.out.println( p.getProduct_name());
    	return p;
    }	
    @GetMapping("/getid")
	public ResponseEntity<?> getid(@RequestParam List<Integer> id)
	{
		return service.getByid(id);
	}
	@GetMapping("/Getalldata")
	public List<Product> getDATA()
	{
		return repo.getalldata();
	}
	@GetMapping("/BLsort")
	public String getsort(@RequestParam List<Integer> num)
	{
		return service.getbubble(num);
	}
	@GetMapping("/change/{discount}/{id}")
	public String getchange(@PathVariable int discount,@PathVariable int id)
	{
		repo.getupdate(discount, id);
		return "Add discount";
		
	}
	@GetMapping("/specific data/{id}")
	public ResponseEntity<?> getspecificdata(@PathVariable int id)
	{
		List<Integer> ids=repo.getallid();
		if(ids.contains(id))
		{
			return new ResponseEntity<>(repo.getspedata(id)+":"+repo.getprice(id),HttpStatus.OK);
			
		}
		else {
			return ResponseEntity.ok("Id is not found");
		}
	
//			if(repo.existsById(id))
//			{
//				return service.getsdata(id);
//  			}
//			else {
//				return ResponseEntity.ok("Id is not found");
//			}
//		
		
	
	}
	@GetMapping("/Addnewcolumn")
	public void getnew()
	{
		 repo.getaddnewcolumn();
	}
	@GetMapping("/putdata")
	public String putelement(@RequestParam List<Integer> id)
	{
		 repo.putdatas(id);
		return "Value updated";
	}
	@GetMapping("/Hellow")
	public String gethellow()
	{
		return "HELLOW";
	}
	@GetMapping("/Data")
	public List<Product> getallData()
	{
		return service.getdata();
	}
	@GetMapping("/Getproduct/{id}")
	public Product getDatatable(@PathVariable int id)
	{
		return service.getsingledata(id);
	}
	@GetMapping("/delete")
	public void getde(@RequestParam List<Integer> id)
	{
		service.getd(id);
		
	}
	@GetMapping("/Requireddata")
	public ResponseEntity<?> gettableinfo(@RequestParam List<Integer> id)
	{
		return service.getrequireddata(id);
	}
	@GetMapping("/bubblesort")
	public String getbubble(@RequestParam List<Integer> num)
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
	@GetMapping("Selectionsort")
	public String getselection(@RequestParam List<Integer> num)
	{
		for(int i=0;i<num.size()-1;i++)
		{
			int mid=i;
			for(int j=i+1;j<num.size();j++)
			{
				if(num.get(j)>num.get(mid))
				{
					mid=j;
				}
			}
				int temp=num.get(i);
				num.set(i, num.get(mid));
				num.set(mid, temp);	
		}
		return "Sorted List:"+num;
	}
	@GetMapping("/Insertionsort")
	public String getinsertion(@RequestParam List<Integer> num)
	{
		for(int i=1;i<num.size();i++)
		{
			int temp=num.get(i);
			int j=i-1;
			while(j>=0&&num.get(j)<temp)
			{
				num.set(j+1, num.get(j));
				j--;
			}
			num.set(j+1, temp);
			}
		return "Sorted List:"+num;
	}
}
