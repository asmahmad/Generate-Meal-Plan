package com.coderscampus.mealplan.web;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.mealplan.service.MealPlanIntegrationService;
import com.coderscampus.mealplan.spoonacular.dto.DayResponse;
import com.coderscampus.mealplan.spoonacular.dto.WeekResponse;

@RestController
public class MealPlanController {
	
	@Autowired
	MealPlanIntegrationService mealPlanService;
	
	@GetMapping("mealplanner/day")
	
	@ResponseBody
	public ResponseEntity<DayResponse> getDayMeals(@RequestParam("targetCalories") Optional<Integer> targetCalories,  @RequestParam("diet") Optional<String> diet,  @RequestParam("exclude") Optional<String> exclude) throws FileNotFoundException, IOException  {
	
		return mealPlanService.callSpoonacularApiDayPlan(targetCalories, diet, exclude);
		
	}
	
	@GetMapping("mealplanner/week")
	
	
	@ResponseBody
	public ResponseEntity<WeekResponse> getWeekMeals(@RequestParam("targetCalories") Optional<Integer> targetCalories,  @RequestParam("diet") Optional<String> diet,  @RequestParam("exclude") Optional<String> exclude) throws FileNotFoundException, IOException {
		
		return mealPlanService.callSpoonacularApiWeekPlan(targetCalories, diet, exclude);
		
	}
	

}
