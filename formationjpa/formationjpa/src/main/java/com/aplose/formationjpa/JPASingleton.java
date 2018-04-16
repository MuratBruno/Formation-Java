package com.aplose.formationjpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPASingleton {
	
	private static JPASingleton INSTANCE;
	public EntityManagerFactory emf;
	public EntityManager em;
	
	private JPASingleton(){
		
	}
	
	public static JPASingleton getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new JPASingleton();
		}
		return INSTANCE;
	}
	
	public EntityManager getEntityManager() {
		if (em == null && emf == null) {
			emf = Persistence.createEntityManagerFactory("SmoossPU");
			em = emf.createEntityManager();
		}
		return em;
	}
	
	public void close() {
		if (em != null && em.isOpen()) {
			em.close();
		}
		if (emf != null && emf.isOpen()) {
			emf.close();
		}
	}
}