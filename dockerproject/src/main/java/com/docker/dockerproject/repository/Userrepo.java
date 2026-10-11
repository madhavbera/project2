package com.docker.dockerproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.docker.dockerproject.entity.User;

@Repository
public interface Userrepo extends JpaRepository<User, Integer>{
	@Query(value="select * from user where user_id=:id",nativeQuery = true)
	public User getvalue(@Param("id") int  id);
	

}
