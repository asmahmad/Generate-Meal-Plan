package com.coderscampus.mealplan.spoonacular.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Nutrients {
	
	@JsonProperty("calories")
	Double calories;
	
	@JsonProperty("protein")
	Double protein;
	
	@JsonProperty("fat")
	Double fat;
	
	@JsonProperty("carbohydrates")
	Double carbohydrates;

	public Double getCalories() {
		return calories;
	}

	public void setCalories(Double calories) {
		this.calories = calories;
	}

	public Double getProtein() {
		return protein;
	}

	public void setProtein(Double protein) {
		this.protein = protein;
	}

	public Double getFat() {
		return fat;
	}

	public void setFat(Double fat) {
		this.fat = fat;
	}

	public Double getCarbohydrates() {
		return carbohydrates;
	}

	public void setCarbohydrates(Double carbohydrates) {
		this.carbohydrates = carbohydrates;
	}

	@Override
	public String toString() {
		return "Nutrients [calories=" + calories + ", protein=" + protein + ", fat=" + fat + ", carbohydrates="
				+ carbohydrates + "]";
	}
	
}
