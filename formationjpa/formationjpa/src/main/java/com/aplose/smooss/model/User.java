package com.aplose.smooss.model;

import javax.persistence.*;

@Entity

public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@OneToMany
	private Event evt;

}