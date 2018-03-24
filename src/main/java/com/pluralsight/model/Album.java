package com.pluralsight.model;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Album {

	private List<Artists> artists;
	private String name;
	private List<Images> images;

	public List<Artists> getArtists() {
		return artists;
	}

	public List<Images> getImages() {
		return images;
	}

	public String getName() {
		return name;
	}

	public void setArtists(List<Artists> artists) {
		this.artists = artists;
	}

	public void setImages(List<Images> images) {
		this.images = images;
	}

	public void setName(String name) {
		this.name = name;
	}

}
