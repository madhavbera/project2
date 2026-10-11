package Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entities.NewS;

@Repository
public interface NewSrepo extends JpaRepository<NewS,Integer> {

}
