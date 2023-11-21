package com.codewithkarthik.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.codewithkarthik.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	@Query(value="SELECT * FROM users u WHERE u.email=:email", nativeQuery=true)
	public User findByEmail(@Param("email") String email);
}
