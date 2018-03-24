package com.pluralsight.model;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Items {

	private Album album;
	private List<Artists> artists;
	private List<Images> images;
	private String name;

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

	public List<Artists> getArtists() {
		return artists;
	}

	public void setArtists(List<Artists> artists) {
		this.artists = artists;
	}

	public List<Images> getImages() {
		return images;
	}

	public void setImages(List<Images> images) {
		this.images = images;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
