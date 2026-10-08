package com.madhav.testapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepo extends JpaRepository<com.madhav.testapi.entities.Class, Integer>{

}
