package Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import Entities.Qantity;
import jakarta.transaction.Transactional;

@Repository
public interface Quantrepo extends JpaRepository<Qantity, Integer> {
	@Modifying
	@Transactional
	@Query(value="insert into Quantity values(101,'laptop',30000.60),(102,'Smartphone',20000.19)",nativeQuery = true)
	void insertvalues();

}
