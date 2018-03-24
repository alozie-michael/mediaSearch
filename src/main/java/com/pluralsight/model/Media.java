package com.pluralsight.model;

import org.hibernate.validator.constraints.NotEmpty;

public class Media {

	@NotEmpty
	private String name;
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
