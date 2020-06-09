package com.example.demo.serices;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.beans.User;

@Repository
@Transactional
public class UserDaoService {
	
	@PersistenceContext
	public EntityManager entityManagaer;

	public long insert(User user) {
		entityManagaer.persist(user);
		return user.getId();
	}
	
}
