package com.aplose.smooss.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Event{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	////////	ATTRIBUTS DE LA CLASSE EVENT
	private String name;
	private String description;
	private String localisation;
	private Date start;
	private Date end;
		
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
	
}
