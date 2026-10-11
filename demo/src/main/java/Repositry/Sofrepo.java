package Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entities.Software;

@Repository
public interface Sofrepo extends JpaRepository<Software, Integer> {
	

}
