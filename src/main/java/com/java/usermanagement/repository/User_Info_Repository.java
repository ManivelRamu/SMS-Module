package com.java.usermanagement.repository;

import com.java.usermanagement.entity.User_Info;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface User_Info_Repository extends JpaRepository<User_Info,Integer> {
    User_Info findByName(String name);
    // User_Info findByName(String user_name);
}
