package com.ndhao.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TestDto {
	@JsonProperty(value = "name")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
