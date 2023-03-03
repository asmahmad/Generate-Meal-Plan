package com.coderscampus.mealplan;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coderscampus.mealplan.service.MealPlanIntegrationService;

@SpringBootApplication
public class MealPlanApplication {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		SpringApplication.run(MealPlanApplication.class, args);
				
	}

}
