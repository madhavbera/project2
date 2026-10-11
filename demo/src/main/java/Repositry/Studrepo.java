package Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entities.S;

@Repository
public interface Studrepo extends JpaRepository<S, Integer> {

}
