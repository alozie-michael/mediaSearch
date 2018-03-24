package com.pluralsight.model;

public class MediaResult {

	private String albumName;
	private String artistName;
	private String images;
	
	public MediaResult(){
		
	}

	public MediaResult(String albumName, String artistName, String images) {
		
		this.albumName = albumName;
		this.artistName = artistName;
		this.images = images;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

}
