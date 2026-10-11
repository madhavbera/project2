package Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entities.Ns;

@Repository
public interface Nsrepo extends JpaRepository<Ns,Integer> {

}
