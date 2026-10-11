package Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entities.Nc;

@Repository
public interface Ncrepo extends JpaRepository<Nc, Integer> {

}
