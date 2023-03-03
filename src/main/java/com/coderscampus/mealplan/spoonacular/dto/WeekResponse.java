package com.coderscampus.mealplan.spoonacular.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeekResponse {
	
	@JsonProperty("week")
	private Week week;

}
