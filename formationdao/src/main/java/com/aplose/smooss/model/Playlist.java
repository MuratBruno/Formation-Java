package com.aplose.smooss.model;

import java.util.List;

public class Playlist {
	
	private List<String> urls;
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
