package com.aplose.smooss.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Event{
	
	private long id;

	////////	ATTRIBUTS DE LA CLASSE EVENT
	private User admin ;
	private String name;
	private String description;
	private String localisation;
	private Date start;
	private Date end;
	
	List<Module> modules = new ArrayList<Module>();
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	//////GET SET ADMIN >>
	public User getAdmin() {
		return admin;
	}
	
	public void setAdmin(User admin) {
		this.admin = admin;
	}
	
	//////GET SET NAME >>
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//////GET SET NAME >>
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	/////GET SET LOCALISATION >>
	public String getLocalisation() {
		return localisation;
	}
	
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}
	
	////GET SET DATESTART
	public Date getStart() { //Une autre façon de noter le get
		return this.start;
	}
	
	public void setStart(Date s) { // Une autre façon de noter le set
		this.start = s;
	}
	
	////GET SET DATEEND
	public Date getEnd() {
		return end;
	}
	
	public void setEnd(Date end) {
		this.end = end;
	}
	
	///GET LIST
	public List<Module> getModules() {
		return modules;
	}
}
