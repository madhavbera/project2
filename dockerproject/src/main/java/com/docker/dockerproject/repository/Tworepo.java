package com.docker.dockerproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.docker.dockerproject.entity.Two;

@Repository
public interface Tworepo extends JpaRepository<Two, Integer>{

}
