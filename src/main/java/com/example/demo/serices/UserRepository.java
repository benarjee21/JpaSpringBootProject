package com.example.demo.serices;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.beans.User;

public interface UserRepository extends JpaRepository<User,Long> {
	

}
