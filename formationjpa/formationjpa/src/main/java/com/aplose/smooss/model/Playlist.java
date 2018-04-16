package com.aplose.smooss.model;

import java.util.List;

import javax.persistence.*;

@Entity

public class Playlist {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private List<String> urls;
	@ManyToMany
	
	@Enumerated(EnumType.STRING)
	private MusicGenre genre;
	
	
	public MusicGenre getGenre() {
		return genre;
	}
	public void setGenre(MusicGenre genre) {
		this.genre = genre;
	}
	public List<String> getUrls() {
		return urls;
	}
	
}
