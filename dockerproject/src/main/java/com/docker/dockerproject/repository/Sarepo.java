package com.docker.dockerproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.docker.dockerproject.entity.S2;

@Repository
public interface Sarepo extends JpaRepository<S2, Integer>{

}
