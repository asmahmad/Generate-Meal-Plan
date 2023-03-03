package com.coderscampus.mealplan.spoonacular.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Wednesday {
	
	@JsonProperty("meals")
	private List<Meals> meals;
	
	@JsonProperty("nutrients")
	private Nutrients nutruents;

	public List<Meals> getMeals() {
		return meals;
	}

	public void setMeals(List<Meals> meals) {
		this.meals = meals;
	}

	public Nutrients getNutruents() {
		return nutruents;
	}

	public void setNutruents(Nutrients nutruents) {
		this.nutruents = nutruents;
	}

	@Override
	public String toString() {
		return "Wednesday [meals=" + meals + ", nutruents=" + nutruents + "]";
	}
}
