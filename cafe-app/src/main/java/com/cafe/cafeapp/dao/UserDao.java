package com.cafe.cafeapp.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.cafe.cafeapp.model.User;


public interface UserDao extends JpaRepository<User, Integer>{
    
    User findByEmailId(@Param("email") String email);
    
}