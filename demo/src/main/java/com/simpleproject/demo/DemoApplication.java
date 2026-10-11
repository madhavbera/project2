package com.simpleproject.demo;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import Entities.C;
import Entities.D;
import Entities.E;
import Entities.Nc;
import Entities.NewC;
import Entities.NewS;
import Entities.Ns;
import Entities.S;
import Repositry.Courepo;
//import Entities.Hardware;
//import Entities.Product;
//import Entities.Qantity;
//import Entities.Software;
import Repositry.Drepo;
import Repositry.Erepo;
import Repositry.Hardrepo;
import Repositry.Myproductrepo;
import Repositry.Ncrepo;
import Repositry.NewCrepo;
import Repositry.NewSrepo;
import Repositry.Nsrepo;
import Repositry.Quantrepo;
import Repositry.Sofrepo;
import Repositry.Studrepo;
import Service.Myproductservice;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
@ComponentScan(basePackages = {"Controller","Service","Resttemplate"})
@EntityScan("Entities")
@EnableJpaRepositories(basePackages = "Repositry")
//@ComponentScan(basePackages = "Repositry")
public class DemoApplication {
	@Autowired
	Myproductservice service;
	@Autowired
	Myproductrepo repo;
	@Autowired
	Quantrepo qrepo;
	@Autowired
	Sofrepo srepo;
	@Autowired
	Hardrepo hrepo;
	@Autowired
	Erepo e;
	@Autowired
	Drepo d;
	@Autowired
	Studrepo strepo;
	@Autowired
	Courepo crepo;
	@Autowired
	Nsrepo nrepo;
	@Autowired
	Ncrepo ncrepo;
	@Autowired
	NewSrepo nsrepo;
	@Autowired
	NewCrepo newcrepo;
	
	
	public static void main(String[] args) {
		
		SpringApplication.run(DemoApplication.class, args);
		
	}
//	Product p=new Product();
	
//This creation is provided by hibernate
@PostConstruct
public void init()
{

//for one to one relation
//	Hardware h=new Hardware(1,"RAM",5000.0);
//	Hardware h1=new Hardware(2,"SSD",5000.0);
//	Hardware h2=new Hardware(3,"HDD",50000.0);
//	Hardware h3=new Hardware(4,"Flopy_disk",50000.0);
//	hrepo.save(h);
//	hrepo.save(h1);
//	hrepo.save(h2);
//	hrepo.save(h3);
//	srepo.save(new Software(101,"System_software",h));
//	srepo.save(new Software(102,"Application",h1));
//	srepo.save(new Software(103,"OS",h2));
//	srepo.save(new Software(104,"Mac os",h3));
	//for many to one relation
//	D d1=new D(1,"IT");
//	D d2=new D(2,"IT");
//	D d3=new D(3,"IT");
//	D d4=new D(4,"IT");
//	d.save(d1);
//	e.save(new E(1,"Gopal",d1));
//	e.save(new E(2,"Madhav",d1));
//	e.save(new E(3,"Shivham",d1));
//	e.save(new E(4,"Sasti",d1));
//for many to many
//	S s1 =new S(101,"Gopal");
//	S s2=new S(102,"Rahul");
//	S s3=new S(103,"Rohan");
//	S s4=new S(104,"Rajau");
//	strepo.save(s1);
//	strepo.save(s2);
//	strepo.save(s3);
//	strepo.save(s4);
//	crepo.save(new C(1,"JAVA",List.of(s1,s2)));
//	crepo.save(new C(2,"Spring",List.of(s2,s3)));
//	crepo.save(new C(3,"PYTHON",List.of(s1,s4)));
//	crepo.save(new C(4,"JAVASCRIPT",List.of(s2,s4)));
//	Nc nc1=new Nc(1,"IT");
//	Nc nc2=new Nc(2,"HR");
//	Nc nc3=new Nc(3,"IT");
//	Nc nc4=new Nc(4,"HR");
//	ncrepo.save(nc1);
//	ncrepo.save(nc2);
//	ncrepo.save(nc3);
//	ncrepo.save(nc4);
//	
//	nrepo.save(new Ns(101,"Gopal",List.of(nc1,nc4,nc2)));
//	nrepo.save(new Ns(102,"Raju",List.of(nc1,nc3,nc4)));
//	nrepo.save(new Ns(103,"shivham",List.of(nc3,nc1,nc2)));
//	NewS s1=new NewS(1,"Goapl",List.of(c1));
//	NewC c1=new NewC(101,"Java",List.of(s1,s2,s3));
//	newcrepo.save(new NewC(101,))
//	nsrepo.save(new NewS(1,"Gopal",List.of(c1,c2,c3)));
	
}
}