package Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entities.NewC;

@Repository

public interface NewCrepo extends JpaRepository<NewC, Integer> {

}
