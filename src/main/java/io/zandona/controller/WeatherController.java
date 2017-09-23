package io.zandona.controller;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

	private static final String[] POSSIBLE_WEATHER_CONDITIONS = new String[] { "sunny", "windy", "cloudy", "rainy" };
	
	@GetMapping("/weather/current")
	public String getCurrentWeather() {
		int i = ThreadLocalRandom.current().nextInt(0, 4);
		return POSSIBLE_WEATHER_CONDITIONS[i];
	}
	
}
