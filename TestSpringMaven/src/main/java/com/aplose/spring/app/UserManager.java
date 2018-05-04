package com.aplose.spring.app;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service
public class UserManager {
	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public void create(User user) {
		em.persist(user);
	}
}
