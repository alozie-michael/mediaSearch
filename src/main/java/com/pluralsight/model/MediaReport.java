package com.pluralsight.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MediaReport {

	private Tracks tracks;
	private Albums albums;

	public Tracks getTracks() {
		return tracks;
	}

	public void setTracks(Tracks tracks) {
		this.tracks = tracks;
	}

	public Albums getAlbums() {
		return albums;
	}

	public void setAlbums(Albums albums) {
		this.albums = albums;
	}

}
