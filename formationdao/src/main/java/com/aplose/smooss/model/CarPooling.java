package com.aplose.smooss.model;

public class CarPooling {

	private String departAdress;
	private String arriveeAdress;
	private Integer nbPlaces;
	private String carDescription;
	private String allerRetour;
	private String departureTime;
	private String departureBackTime;

	public String getDepartAdress() {
		return departAdress;
	}

	public void setDepartAdress(String departAdress) {
		this.departAdress = departAdress;
	}

	public String getArriveeAdress() {
		return arriveeAdress;
	}

	public void setArriveeAdress(String arriveeAdress) {
		this.arriveeAdress = arriveeAdress;
	}

	public Integer getNbPlaces() {
		return nbPlaces;
	}

	public void setNbPlaces(Integer nbPlaces) {
		this.nbPlaces = nbPlaces;
	}

	public String getCarDescription() {
		return carDescription;
	}

	public void setCarDescription(String carDescription) {
		this.carDescription = carDescription;
	}

	public String getAllerRetour() {
		return allerRetour;
	}

	public void setAllerRetour(String allerRetour) {
		this.allerRetour = allerRetour;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getDepartureBackTime() {
		return departureBackTime;
	}
	
	public void setDepartureBackTime(String departureBackTime) {
		this.departureBackTime = departureBackTime;
	}

}
