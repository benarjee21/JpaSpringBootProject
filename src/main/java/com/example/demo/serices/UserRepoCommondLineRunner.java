package com.example.demo.serices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.beans.User;

@Component
public class UserRepoCommondLineRunner implements CommandLineRunner {
	
	@Autowired
	UserRepository userReo;
	
	private static final Logger log=LoggerFactory.getLogger(UserRepoCommondLineRunner.class);
	
	@Override
	public void run(String... args) throws Exception {
		
		User user=new User("Jill","Developer");
		userReo.save(user);
		log.info("New User Created"+user);
	}
	
	

}
