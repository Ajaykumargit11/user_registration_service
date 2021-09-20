package com.htc.user_registration_service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.htc.user_registration_service.entity.User;



@Repository
public interface UserInterface extends JpaRepository<User,Long>{

	@Query(value = "SELECT * FROM USER WHERE userName=?1",nativeQuery = true)
	public User findByUserName(String userName);
   
	@Query(value = "SELECT * FROM USER WHERE phoneno=?1",nativeQuery = true)
	public User findByPhoneno(String phoneno);
	
	@Query(value = "SELECT * FROM USER WHERE email=?1",nativeQuery = true)
	public User findByEmail(String email);

}
