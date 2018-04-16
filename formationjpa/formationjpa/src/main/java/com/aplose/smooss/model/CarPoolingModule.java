package com.aplose.smooss.model;

import java.util.List;

import javax.persistence.*;

@Entity

public class CarPoolingModule extends Module {

	private List<String> carPooling;

	public List<String> getCarPooling() {
		return carPooling;
	}
	
	
	
	
}
