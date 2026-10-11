package Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entities.C;

@Repository
public interface Courepo extends JpaRepository<C, Integer> {

}
