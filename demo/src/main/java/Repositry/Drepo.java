package Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entities.D;

@Repository
public interface Drepo extends JpaRepository<D, Integer> {

}
