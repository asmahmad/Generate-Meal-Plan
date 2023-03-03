package com.coderscampus.mealplan.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.util.Optional;
import java.util.Properties;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.mealplan.spoonacular.dto.DayResponse;
import com.coderscampus.mealplan.spoonacular.dto.WeekResponse;

@Service
public class MealPlanIntegrationService {
		
	public ResponseEntity<DayResponse> callSpoonacularApiDayPlan(Optional<Integer> targetCalories, Optional<String> diet, Optional<String> exclude) throws FileNotFoundException, IOException {
		
			//Hiding apiKey for security:
			Properties props = new Properties();
			props.load(new FileInputStream("application.properties"));
			String apiKey = props.getProperty("apiKey");
		
			//extracting the actual URL:
			String urlsBase = props.getProperty("spoonacular.urls.base");
			String urlsMealPlan = props.getProperty("spoonacular.urls.mealplan");
		
			// Instantiating RestTemplate consume RESTful Web Services.
			RestTemplate rt = new RestTemplate();
		

			//Building a UriComponents instance.
			URI uri = UriComponentsBuilder.fromHttpUrl(urlsBase+urlsMealPlan)
									  	   .queryParamIfPresent("targetCalories",targetCalories)
									  	   .queryParamIfPresent("diet",diet)
									  	   .queryParamIfPresent("exclude",exclude)
									  	   .queryParam("apiKey", apiKey)
									  	   .queryParam("timeFrame", "day")
									  	   .build()
									  	   .toUri();
		
			//Mapping JSON string to JAVA object:
			ResponseEntity<DayResponse>	dayResponseEntity = rt.getForEntity(uri, DayResponse.class);	

			return dayResponseEntity;
	}
	
	
	public ResponseEntity<WeekResponse> callSpoonacularApiWeekPlan(Optional<Integer> targetCalories, Optional<String> diet, Optional<String> exclude) throws FileNotFoundException, IOException {
		
			//Hiding apiKey for security:
			Properties props = new Properties();
			props.load(new FileInputStream("application.properties"));
			String apiKey = props.getProperty("apiKey");
		
			//extracting the actual URL:
			String urlsBase = props.getProperty("spoonacular.urls.base");
			String urlsMealPlan = props.getProperty("spoonacular.urls.mealplan");
		
			// Instantiating RestTemplate consume RESTful Web Services.
			RestTemplate rt = new RestTemplate();
		
			//Building a UriComponents instance.
			URI uri = UriComponentsBuilder.fromHttpUrl(urlsBase+urlsMealPlan)
										  .queryParamIfPresent("targetCalories",targetCalories)
										  .queryParamIfPresent("diet",diet)
										  .queryParamIfPresent("exclude",exclude)
										  .queryParam("apiKey", apiKey)
										  .queryParam("timeFrame", "week")
										  .build()
										  .toUri();
		

			//Mapping JSON string to JAVA object:
			ResponseEntity<WeekResponse>	weekResponseEntity = rt.getForEntity(uri, WeekResponse.class);	

			return weekResponseEntity;
				
	}

}
