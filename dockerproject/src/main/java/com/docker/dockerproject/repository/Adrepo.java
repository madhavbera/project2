package com.docker.dockerproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.docker.dockerproject.entity.Admission;

@Repository
public interface Adrepo extends JpaRepository<Admission, Long> {

}
