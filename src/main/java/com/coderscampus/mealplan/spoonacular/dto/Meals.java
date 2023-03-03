package com.coderscampus.mealplan.spoonacular.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Meals {
	
	@JsonProperty("id")
	private Long id;
	
	@JsonProperty("imageType")
	String imageType;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	@JsonProperty("title")
	String  title;
	
	@JsonProperty("readyInMinutes")
	Integer readyInMinutes;
	
	@JsonProperty("servings")
	Integer servings;
	
	@JsonProperty("sourceUrl")
	String sourceUrl;

	public Long getId() {
		return id;
	}


	

	public void setId(Long id) {
		this.id = id;
	}

	public String getImageType() {
		return imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	public Integer getReadyInMinutes() {
		return readyInMinutes;
	}

	public void setReadyInMinutes(Integer readyInMinutes) {
		this.readyInMinutes = readyInMinutes;
	}

	public Integer getServings() {
		return servings;
	}

	public void setServings(Integer servings) {
		this.servings = servings;
	}

	public String getSourceUrl() {
		return sourceUrl;
	}

	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

	@Override
	public String toString() {
		return "Meals [id=" + id + ", imageType=" + imageType + ", title=" + title + ", readyInMinutes="
				+ readyInMinutes + ", servings=" + servings + ", sourceUrl=" + sourceUrl + "]";
	}
	
}
