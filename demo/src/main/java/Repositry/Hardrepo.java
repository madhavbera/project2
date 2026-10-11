package Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entities.Hardware;

@Repository
public interface Hardrepo extends JpaRepository<Hardware, Integer> {

}
