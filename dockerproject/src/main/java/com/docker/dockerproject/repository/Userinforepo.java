package com.docker.dockerproject.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.docker.dockerproject.entity.Userinfo;

@Repository
public interface Userinforepo extends JpaRepository<Userinfo, Integer> {

  Userinfo findByname(String name);
}
