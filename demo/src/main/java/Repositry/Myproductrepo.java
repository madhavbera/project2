package Repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

//import Entities.Myentity;
import Entities.Product;
import jakarta.transaction.Transactional;

//import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
//import org.springframework.stereotype.Repository;

@Repository
public interface Myproductrepo extends JpaRepository<Product, Integer> {
           @Query(value="select * from products",nativeQuery = true)
           public List<Product> getall();
           @Query(value="select * from products where id=:id",nativeQuery = true)
           public Product getData(int id);
           @Query(value="select * from products  where id in (:ids)",nativeQuery = true)
           public List<Product> getinfo(@Param("ids") List<Integer> id);
           @Modifying
           @Transactional
           @Query(value="delete from products where id in (:ids)",nativeQuery = true)
           public void getdelete(@Param("ids")List<Integer> id);
           @Query("select p.ProductName as Product_Name from Product p where p.id=:id")//JPQL query
           public String getspedata(@Param("id") int  id);
           @Query(value="select id from products",nativeQuery = true)//native query
           public List<Integer> getallid();
           @Query(value="select price as Price from products where id=:id",nativeQuery = true)
           String getprice(int id);
           @Modifying
           @Transactional
           @Query(value="alter table products add product_discount int",nativeQuery = true)
           void getaddnewcolumn();
           @Modifying
           @Transactional
           @Query(value="update products set product_discount=50 where id in (:ids)",nativeQuery = true)
           void putdatas(@Param("ids") List<Integer> id);
           @Modifying
           @Transactional
           @Query(value="update products set product_discount=:discount where id =:id",nativeQuery = true)
           void getupdate(@Param("discount") int discount,@Param("id") int id);
           @Query("select p from Product p")
           List<Product> getalldata();
           @Query(value="select * from products where id=:id ",nativeQuery = true)
           Product getbyid(int id);
           
}
