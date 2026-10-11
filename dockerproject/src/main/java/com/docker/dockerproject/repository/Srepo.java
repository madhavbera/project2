package com.docker.dockerproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.docker.dockerproject.entity.S1;

@Repository
public interface Srepo extends JpaRepository<S1, Integer>{

}
