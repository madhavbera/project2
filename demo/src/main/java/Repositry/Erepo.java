package Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entities.E;

@Repository
public interface Erepo extends JpaRepository<E, Integer> {

}
