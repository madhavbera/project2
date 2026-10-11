package com.docker.dockerproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.docker.dockerproject.entity.One;

@Repository
public interface Onerepo extends JpaRepository<One, Integer>{

}
